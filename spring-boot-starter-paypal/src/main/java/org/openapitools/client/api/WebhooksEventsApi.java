/*
 * Webhooks Management
 * The PayPal REST APIs use <a href=\"/docs/api/notifications/webhooks/\"/>webhooks</a> for event notification. Webhooks are HTTP callbacks that receive notification messages for events. After you configure a webhook listener for your app, you can <a href=\"#webhooks_create\">create a webhook</a>, which subscribes the webhook listener for your app to events. The <code>notifications</code> namespace contains resource collections for webhooks.
 *
 * The version of the OpenAPI document: 1.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.Pair;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventList;
import org.openapitools.client.model.EventResend;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T07:10:38.624109217Z[Atlantic/Reykjavik]")
public class WebhooksEventsApi {


  private ApiClient apiClient;

  public WebhooksEventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksEventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Show event notification details
   * Shows details for a webhooks event notification, by ID.
   * @param eventId The ID of the webhook event notification to resend. (required)
   * @return Event
   * @throws ApiException if fails to make API call
   */
  public Event webhooksEventsGet(String eventId) throws ApiException {
    return this.webhooksEventsGet(eventId, Collections.emptyMap());
  }


  /**
   * Show event notification details
   * Shows details for a webhooks event notification, by ID.
   * @param eventId The ID of the webhook event notification to resend. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Event
   * @throws ApiException if fails to make API call
   */
  public Event webhooksEventsGet(String eventId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling webhooksEventsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/notifications/webhooks-events/{event_id}"
      .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Event> localVarReturnType = new TypeReference<Event>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * List event notifications
   * Lists webhooks event notifications. Use query parameters to filter the response.
   * @param pageSize The number of webhook event notifications to return in the response. (optional, default to 10)
   * @param startTime Filters the webhook event notifications in the response to those created on or after this date and time and on or before the &#x60;end_time&#x60; value. Both values are in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6) format. Example: &#x60;start_time&#x3D;2013-03-06T11:00:00Z&#x60;. (optional)
   * @param endTime Filters the webhook event notifications in the response to those created on or after the &#x60;start_time&#x60; and on or before this date and time. Both values are in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6) format. Example: &#x60;end_time&#x3D;2013-03-06T11:00:00Z&#x60;. (optional)
   * @param transactionId Filters the response to a single transaction, by ID. (optional)
   * @param eventType Filters the response to a single event. (optional)
   * @return EventList
   * @throws ApiException if fails to make API call
   */
  public EventList webhooksEventsList(Integer pageSize, String startTime, String endTime, String transactionId, String eventType) throws ApiException {
    return this.webhooksEventsList(pageSize, startTime, endTime, transactionId, eventType, Collections.emptyMap());
  }


  /**
   * List event notifications
   * Lists webhooks event notifications. Use query parameters to filter the response.
   * @param pageSize The number of webhook event notifications to return in the response. (optional, default to 10)
   * @param startTime Filters the webhook event notifications in the response to those created on or after this date and time and on or before the &#x60;end_time&#x60; value. Both values are in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6) format. Example: &#x60;start_time&#x3D;2013-03-06T11:00:00Z&#x60;. (optional)
   * @param endTime Filters the webhook event notifications in the response to those created on or after the &#x60;start_time&#x60; and on or before this date and time. Both values are in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6) format. Example: &#x60;end_time&#x3D;2013-03-06T11:00:00Z&#x60;. (optional)
   * @param transactionId Filters the response to a single transaction, by ID. (optional)
   * @param eventType Filters the response to a single event. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return EventList
   * @throws ApiException if fails to make API call
   */
  public EventList webhooksEventsList(Integer pageSize, String startTime, String endTime, String transactionId, String eventType, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/notifications/webhooks-events";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("transaction_id", transactionId));
    localVarQueryParams.addAll(apiClient.parameterToPair("event_type", eventType));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<EventList> localVarReturnType = new TypeReference<EventList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Resend event notification
   * Resends a webhook event notification, by ID. Any pending notifications are not resent.
   * @param eventId The ID of the webhook event notification to resend. (required)
   * @param eventResend  (optional)
   * @return Event
   * @throws ApiException if fails to make API call
   */
  public Event webhooksEventsResend(String eventId, EventResend eventResend) throws ApiException {
    return this.webhooksEventsResend(eventId, eventResend, Collections.emptyMap());
  }


  /**
   * Resend event notification
   * Resends a webhook event notification, by ID. Any pending notifications are not resent.
   * @param eventId The ID of the webhook event notification to resend. (required)
   * @param eventResend  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Event
   * @throws ApiException if fails to make API call
   */
  public Event webhooksEventsResend(String eventId, EventResend eventResend, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = eventResend;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling webhooksEventsResend");
    }
    
    // create path and map variables
    String localVarPath = "/v1/notifications/webhooks-events/{event_id}/resend"
      .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Event> localVarReturnType = new TypeReference<Event>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}
