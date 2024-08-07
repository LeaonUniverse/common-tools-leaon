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
import org.openapitools.client.model.Money;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The payment preferences to override at subscription level.
 */
@JsonPropertyOrder({
  PaymentPreferencesOverride.JSON_PROPERTY_AUTO_BILL_OUTSTANDING,
  PaymentPreferencesOverride.JSON_PROPERTY_SETUP_FEE,
  PaymentPreferencesOverride.JSON_PROPERTY_SETUP_FEE_FAILURE_ACTION,
  PaymentPreferencesOverride.JSON_PROPERTY_PAYMENT_FAILURE_THRESHOLD
})
@JsonTypeName("payment_preferences_override")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T11:30:41.643502082Z[Atlantic/Reykjavik]")
public class PaymentPreferencesOverride {
  public static final String JSON_PROPERTY_AUTO_BILL_OUTSTANDING = "auto_bill_outstanding";
  private Boolean autoBillOutstanding;

  public static final String JSON_PROPERTY_SETUP_FEE = "setup_fee";
  private Money setupFee;

  /**
   * The action to take on the subscription if the initial payment for the setup fails.
   */
  public enum SetupFeeFailureActionEnum {
    CONTINUE("CONTINUE"),
    
    CANCEL("CANCEL");

    private String value;

    SetupFeeFailureActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SetupFeeFailureActionEnum fromValue(String value) {
      for (SetupFeeFailureActionEnum b : SetupFeeFailureActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SETUP_FEE_FAILURE_ACTION = "setup_fee_failure_action";
  private SetupFeeFailureActionEnum setupFeeFailureAction;

  public static final String JSON_PROPERTY_PAYMENT_FAILURE_THRESHOLD = "payment_failure_threshold";
  private Integer paymentFailureThreshold;

  public PaymentPreferencesOverride() {
  }

  public PaymentPreferencesOverride autoBillOutstanding(Boolean autoBillOutstanding) {
    
    this.autoBillOutstanding = autoBillOutstanding;
    return this;
  }

   /**
   * Indicates whether to automatically bill the outstanding amount in the next billing cycle.
   * @return autoBillOutstanding
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_BILL_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoBillOutstanding() {
    return autoBillOutstanding;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_BILL_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoBillOutstanding(Boolean autoBillOutstanding) {
    this.autoBillOutstanding = autoBillOutstanding;
  }


  public PaymentPreferencesOverride setupFee(Money setupFee) {
    
    this.setupFee = setupFee;
    return this;
  }

   /**
   * Get setupFee
   * @return setupFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETUP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Money getSetupFee() {
    return setupFee;
  }


  @JsonProperty(JSON_PROPERTY_SETUP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetupFee(Money setupFee) {
    this.setupFee = setupFee;
  }


  public PaymentPreferencesOverride setupFeeFailureAction(SetupFeeFailureActionEnum setupFeeFailureAction) {
    
    this.setupFeeFailureAction = setupFeeFailureAction;
    return this;
  }

   /**
   * The action to take on the subscription if the initial payment for the setup fails.
   * @return setupFeeFailureAction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETUP_FEE_FAILURE_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetupFeeFailureActionEnum getSetupFeeFailureAction() {
    return setupFeeFailureAction;
  }


  @JsonProperty(JSON_PROPERTY_SETUP_FEE_FAILURE_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetupFeeFailureAction(SetupFeeFailureActionEnum setupFeeFailureAction) {
    this.setupFeeFailureAction = setupFeeFailureAction;
  }


  public PaymentPreferencesOverride paymentFailureThreshold(Integer paymentFailureThreshold) {
    
    this.paymentFailureThreshold = paymentFailureThreshold;
    return this;
  }

   /**
   * The maximum number of payment failures before a subscription is suspended. For example, if &#x60;payment_failure_threshold&#x60; is &#x60;2&#x60;, the subscription automatically updates to the &#x60;SUSPEND&#x60; state if two consecutive payments fail.
   * minimum: 0
   * maximum: 999
   * @return paymentFailureThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_FAILURE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaymentFailureThreshold() {
    return paymentFailureThreshold;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_FAILURE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentFailureThreshold(Integer paymentFailureThreshold) {
    this.paymentFailureThreshold = paymentFailureThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPreferencesOverride paymentPreferencesOverride = (PaymentPreferencesOverride) o;
    return Objects.equals(this.autoBillOutstanding, paymentPreferencesOverride.autoBillOutstanding) &&
        Objects.equals(this.setupFee, paymentPreferencesOverride.setupFee) &&
        Objects.equals(this.setupFeeFailureAction, paymentPreferencesOverride.setupFeeFailureAction) &&
        Objects.equals(this.paymentFailureThreshold, paymentPreferencesOverride.paymentFailureThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoBillOutstanding, setupFee, setupFeeFailureAction, paymentFailureThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPreferencesOverride {\n");
    sb.append("    autoBillOutstanding: ").append(toIndentedString(autoBillOutstanding)).append("\n");
    sb.append("    setupFee: ").append(toIndentedString(setupFee)).append("\n");
    sb.append("    setupFeeFailureAction: ").append(toIndentedString(setupFeeFailureAction)).append("\n");
    sb.append("    paymentFailureThreshold: ").append(toIndentedString(paymentFailureThreshold)).append("\n");
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

    // add `auto_bill_outstanding` to the URL query string
    if (getAutoBillOutstanding() != null) {
      try {
        joiner.add(String.format("%sauto_bill_outstanding%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoBillOutstanding()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `setup_fee` to the URL query string
    if (getSetupFee() != null) {
      joiner.add(getSetupFee().toUrlQueryString(prefix + "setup_fee" + suffix));
    }

    // add `setup_fee_failure_action` to the URL query string
    if (getSetupFeeFailureAction() != null) {
      try {
        joiner.add(String.format("%ssetup_fee_failure_action%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSetupFeeFailureAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_failure_threshold` to the URL query string
    if (getPaymentFailureThreshold() != null) {
      try {
        joiner.add(String.format("%spayment_failure_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentFailureThreshold()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

