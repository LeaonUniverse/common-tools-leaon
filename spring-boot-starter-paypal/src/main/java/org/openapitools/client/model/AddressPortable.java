/*
 * Subscriptions
 * You can use billing plans and subscriptions to create subscriptions that process recurring PayPal payments for physical or digital goods, or services. A plan includes pricing and billing cycle information that defines the amount and frequency of charge for a subscription. You can also define a fixed plan, such as a $5 basic plan or a volume- or graduated-based plan with pricing tiers based on the quantity purchased. For more information, see <a href=\"/docs/subscriptions/\">Subscriptions Overview</a>.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.AddressDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
 */
@JsonPropertyOrder({
  AddressPortable.JSON_PROPERTY_ADDRESS_LINE1,
  AddressPortable.JSON_PROPERTY_ADDRESS_LINE2,
  AddressPortable.JSON_PROPERTY_ADDRESS_LINE3,
  AddressPortable.JSON_PROPERTY_ADMIN_AREA4,
  AddressPortable.JSON_PROPERTY_ADMIN_AREA3,
  AddressPortable.JSON_PROPERTY_ADMIN_AREA2,
  AddressPortable.JSON_PROPERTY_ADMIN_AREA1,
  AddressPortable.JSON_PROPERTY_POSTAL_CODE,
  AddressPortable.JSON_PROPERTY_COUNTRY_CODE,
  AddressPortable.JSON_PROPERTY_ADDRESS_DETAILS
})
@JsonTypeName("address_portable")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T11:30:41.643502082Z[Atlantic/Reykjavik]")
public class AddressPortable {
  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "address_line_1";
  private String addressLine1;

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "address_line_2";
  private String addressLine2;

  public static final String JSON_PROPERTY_ADDRESS_LINE3 = "address_line_3";
  private String addressLine3;

  public static final String JSON_PROPERTY_ADMIN_AREA4 = "admin_area_4";
  private String adminArea4;

  public static final String JSON_PROPERTY_ADMIN_AREA3 = "admin_area_3";
  private String adminArea3;

  public static final String JSON_PROPERTY_ADMIN_AREA2 = "admin_area_2";
  private String adminArea2;

  public static final String JSON_PROPERTY_ADMIN_AREA1 = "admin_area_1";
  private String adminArea1;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_ADDRESS_DETAILS = "address_details";
  private AddressDetails addressDetails;

  public AddressPortable() {
  }

  public AddressPortable addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address. For example, number or street. For example, &#x60;173 Drury Lane&#x60;. Required for data entry and compliance and risk checks. Must contain the full address.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public AddressPortable addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the address. For example, suite or apartment number.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine2() {
    return addressLine2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public AddressPortable addressLine3(String addressLine3) {
    
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * The third line of the address, if needed. For example, a street complement for Brazil, direction text, such as &#x60;next to Walmart&#x60;, or a landmark in an Indian address.
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine3() {
    return addressLine3;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public AddressPortable adminArea4(String adminArea4) {
    
    this.adminArea4 = adminArea4;
    return this;
  }

   /**
   * The neighborhood, ward, or district. Smaller than &#x60;admin_area_level_3&#x60; or &#x60;sub_locality&#x60;. Value is:&lt;ul&gt;&lt;li&gt;The postal sorting code for Guernsey and many French territories, such as French Guiana.&lt;/li&gt;&lt;li&gt;The fine-grained administrative levels in China.&lt;/li&gt;&lt;/ul&gt;
   * @return adminArea4
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_AREA4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminArea4() {
    return adminArea4;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_AREA4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminArea4(String adminArea4) {
    this.adminArea4 = adminArea4;
  }


  public AddressPortable adminArea3(String adminArea3) {
    
    this.adminArea3 = adminArea3;
    return this;
  }

   /**
   * A sub-locality, suburb, neighborhood, or district. Smaller than &#x60;admin_area_level_2&#x60;. Value is:&lt;ul&gt;&lt;li&gt;Brazil. Suburb, bairro, or neighborhood.&lt;/li&gt;&lt;li&gt;India. Sub-locality or district. Street name information is not always available but a sub-locality or district can be a very small area.&lt;/li&gt;&lt;/ul&gt;
   * @return adminArea3
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_AREA3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminArea3() {
    return adminArea3;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_AREA3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminArea3(String adminArea3) {
    this.adminArea3 = adminArea3;
  }


  public AddressPortable adminArea2(String adminArea2) {
    
    this.adminArea2 = adminArea2;
    return this;
  }

   /**
   * A city, town, or village. Smaller than &#x60;admin_area_level_1&#x60;.
   * @return adminArea2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_AREA2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminArea2() {
    return adminArea2;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_AREA2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminArea2(String adminArea2) {
    this.adminArea2 = adminArea2;
  }


  public AddressPortable adminArea1(String adminArea1) {
    
    this.adminArea1 = adminArea1;
    return this;
  }

   /**
   * The highest level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. Format for postal delivery. For example, &#x60;CA&#x60; and not &#x60;California&#x60;. Value, by country, is:&lt;ul&gt;&lt;li&gt;UK. A county.&lt;/li&gt;&lt;li&gt;US. A state.&lt;/li&gt;&lt;li&gt;Canada. A province.&lt;/li&gt;&lt;li&gt;Japan. A prefecture.&lt;/li&gt;&lt;li&gt;Switzerland. A kanton.&lt;/li&gt;&lt;/ul&gt;
   * @return adminArea1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_AREA1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminArea1() {
    return adminArea1;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_AREA1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminArea1(String adminArea1) {
    this.adminArea1 = adminArea1;
  }


  public AddressPortable postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code, which is the zip code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public AddressPortable countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that country. Use the &#x60;C2&#x60; country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public AddressPortable addressDetails(AddressDetails addressDetails) {
    
    this.addressDetails = addressDetails;
    return this;
  }

   /**
   * Get addressDetails
   * @return addressDetails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressDetails getAddressDetails() {
    return addressDetails;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressPortable addressPortable = (AddressPortable) o;
    return Objects.equals(this.addressLine1, addressPortable.addressLine1) &&
        Objects.equals(this.addressLine2, addressPortable.addressLine2) &&
        Objects.equals(this.addressLine3, addressPortable.addressLine3) &&
        Objects.equals(this.adminArea4, addressPortable.adminArea4) &&
        Objects.equals(this.adminArea3, addressPortable.adminArea3) &&
        Objects.equals(this.adminArea2, addressPortable.adminArea2) &&
        Objects.equals(this.adminArea1, addressPortable.adminArea1) &&
        Objects.equals(this.postalCode, addressPortable.postalCode) &&
        Objects.equals(this.countryCode, addressPortable.countryCode) &&
        Objects.equals(this.addressDetails, addressPortable.addressDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressLine3, adminArea4, adminArea3, adminArea2, adminArea1, postalCode, countryCode, addressDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressPortable {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    adminArea4: ").append(toIndentedString(adminArea4)).append("\n");
    sb.append("    adminArea3: ").append(toIndentedString(adminArea3)).append("\n");
    sb.append("    adminArea2: ").append(toIndentedString(adminArea2)).append("\n");
    sb.append("    adminArea1: ").append(toIndentedString(adminArea1)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `address_line_1` to the URL query string
    if (getAddressLine1() != null) {
      try {
        joiner.add(String.format("%saddress_line_1%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressLine1()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address_line_2` to the URL query string
    if (getAddressLine2() != null) {
      try {
        joiner.add(String.format("%saddress_line_2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressLine2()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address_line_3` to the URL query string
    if (getAddressLine3() != null) {
      try {
        joiner.add(String.format("%saddress_line_3%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressLine3()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `admin_area_4` to the URL query string
    if (getAdminArea4() != null) {
      try {
        joiner.add(String.format("%sadmin_area_4%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminArea4()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `admin_area_3` to the URL query string
    if (getAdminArea3() != null) {
      try {
        joiner.add(String.format("%sadmin_area_3%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminArea3()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `admin_area_2` to the URL query string
    if (getAdminArea2() != null) {
      try {
        joiner.add(String.format("%sadmin_area_2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminArea2()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `admin_area_1` to the URL query string
    if (getAdminArea1() != null) {
      try {
        joiner.add(String.format("%sadmin_area_1%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminArea1()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postal_code` to the URL query string
    if (getPostalCode() != null) {
      try {
        joiner.add(String.format("%spostal_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostalCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `country_code` to the URL query string
    if (getCountryCode() != null) {
      try {
        joiner.add(String.format("%scountry_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address_details` to the URL query string
    if (getAddressDetails() != null) {
      joiner.add(getAddressDetails().toUrlQueryString(prefix + "address_details" + suffix));
    }

    return joiner.toString();
  }

}

