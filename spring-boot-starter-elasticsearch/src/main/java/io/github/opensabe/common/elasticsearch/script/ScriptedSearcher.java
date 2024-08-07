package io.github.opensabe.common.elasticsearch.script;

import lombok.extern.log4j.Log4j2;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;


@Log4j2
public class ScriptedSearcher {
    private final RestHighLevelClient restHighLevelClient;

    public ScriptedSearcher(RestHighLevelClient restHighLevelClient) {
        this.restHighLevelClient = restHighLevelClient;

    }

    public SearchResponse search(SearchRequest searchRequest, AbstractElasticSearchScript abstractElasticSearchScript, Object... objects) throws IOException {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().query(QueryBuilders.wrapperQuery(abstractElasticSearchScript.getScript(objects)));
        searchRequest.source(searchSourceBuilder);
        SearchResponse search = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
        if (search.getTook() != null && search.getTook().getMillis() > 3000L) {
            log.error("ScriptedSearcher-search took more than 3s");
        }
        return search;
    }
}
