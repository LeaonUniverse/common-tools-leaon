/*
 * Payments
 * <blockquote><strong>Deprecation notice:</strong> The <code>/v1/payments</code> endpoint is deprecated. Use the <code>/v2/payments</code> endpoint instead. For details, see <a href=\"/docs/checkout/integrate/\">PayPal Checkout Basic Integration</a>.</blockquote>Use the Payments REST API to easily and securely accept online and mobile payments. The payments name space contains resource collections for payments, sales, refunds, authorizations, captures, and orders.<blockquote><strong>Important:</strong> The use of the PayPal REST <code>/payments</code> APIs to accept credit card payments is restricted. Instead, you can accept credit card payments with <a href=\"https://www.braintreepayments.com/products/braintree-direct\">Braintree Direct</a>.</blockquote>You can enable customers to make PayPal and credit card payments with only a few clicks, depending on the country. You can accept an immediate payment or authorize a payment and capture it later. You can show details for completed payments, refunds, and authorizations. You can make full or partial refunds. You also can void or re-authorize authorizations. For more information, see the <a href=\"/docs/integration/direct/payments/\">Payments overview</a>.
 *
 * The version of the OpenAPI document: 1.12
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
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DetailedRefundAllOf
 */
@JsonPropertyOrder({
  DetailedRefundAllOf.JSON_PROPERTY_CUSTOM,
  DetailedRefundAllOf.JSON_PROPERTY_INVOICE_NUMBER,
  DetailedRefundAllOf.JSON_PROPERTY_REFUND_FROM_TRANSACTION_FEE,
  DetailedRefundAllOf.JSON_PROPERTY_REFUND_FROM_RECEIVED_AMOUNT,
  DetailedRefundAllOf.JSON_PROPERTY_TOTAL_REFUNDED_AMOUNT
})
@JsonTypeName("detailed_refund_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-11T03:56:12.691299337Z[Atlantic/Reykjavik]")
public class DetailedRefundAllOf {
  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private String custom;

  public static final String JSON_PROPERTY_INVOICE_NUMBER = "invoice_number";
  private String invoiceNumber;

  public static final String JSON_PROPERTY_REFUND_FROM_TRANSACTION_FEE = "refund_from_transaction_fee";
  private Currency refundFromTransactionFee;

  public static final String JSON_PROPERTY_REFUND_FROM_RECEIVED_AMOUNT = "refund_from_received_amount";
  private Currency refundFromReceivedAmount;

  public static final String JSON_PROPERTY_TOTAL_REFUNDED_AMOUNT = "total_refunded_amount";
  private Currency totalRefundedAmount;

  public DetailedRefundAllOf() {
  }

  public DetailedRefundAllOf custom(String custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * The note to the payer in this transaction.
   * @return custom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustom() {
    return custom;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustom(String custom) {
    this.custom = custom;
  }


  public DetailedRefundAllOf invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The invoice number to track this payment.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public DetailedRefundAllOf refundFromTransactionFee(Currency refundFromTransactionFee) {
    
    this.refundFromTransactionFee = refundFromTransactionFee;
    return this;
  }

   /**
   * Get refundFromTransactionFee
   * @return refundFromTransactionFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_FROM_TRANSACTION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getRefundFromTransactionFee() {
    return refundFromTransactionFee;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_FROM_TRANSACTION_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundFromTransactionFee(Currency refundFromTransactionFee) {
    this.refundFromTransactionFee = refundFromTransactionFee;
  }


  public DetailedRefundAllOf refundFromReceivedAmount(Currency refundFromReceivedAmount) {
    
    this.refundFromReceivedAmount = refundFromReceivedAmount;
    return this;
  }

   /**
   * Get refundFromReceivedAmount
   * @return refundFromReceivedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_FROM_RECEIVED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getRefundFromReceivedAmount() {
    return refundFromReceivedAmount;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_FROM_RECEIVED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundFromReceivedAmount(Currency refundFromReceivedAmount) {
    this.refundFromReceivedAmount = refundFromReceivedAmount;
  }


  public DetailedRefundAllOf totalRefundedAmount(Currency totalRefundedAmount) {
    
    this.totalRefundedAmount = totalRefundedAmount;
    return this;
  }

   /**
   * Get totalRefundedAmount
   * @return totalRefundedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getTotalRefundedAmount() {
    return totalRefundedAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRefundedAmount(Currency totalRefundedAmount) {
    this.totalRefundedAmount = totalRefundedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedRefundAllOf detailedRefundAllOf = (DetailedRefundAllOf) o;
    return Objects.equals(this.custom, detailedRefundAllOf.custom) &&
        Objects.equals(this.invoiceNumber, detailedRefundAllOf.invoiceNumber) &&
        Objects.equals(this.refundFromTransactionFee, detailedRefundAllOf.refundFromTransactionFee) &&
        Objects.equals(this.refundFromReceivedAmount, detailedRefundAllOf.refundFromReceivedAmount) &&
        Objects.equals(this.totalRefundedAmount, detailedRefundAllOf.totalRefundedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, invoiceNumber, refundFromTransactionFee, refundFromReceivedAmount, totalRefundedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedRefundAllOf {\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    refundFromTransactionFee: ").append(toIndentedString(refundFromTransactionFee)).append("\n");
    sb.append("    refundFromReceivedAmount: ").append(toIndentedString(refundFromReceivedAmount)).append("\n");
    sb.append("    totalRefundedAmount: ").append(toIndentedString(totalRefundedAmount)).append("\n");
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

    // add `custom` to the URL query string
    if (getCustom() != null) {
      try {
        joiner.add(String.format("%scustom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invoice_number` to the URL query string
    if (getInvoiceNumber() != null) {
      try {
        joiner.add(String.format("%sinvoice_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoiceNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refund_from_transaction_fee` to the URL query string
    if (getRefundFromTransactionFee() != null) {
      joiner.add(getRefundFromTransactionFee().toUrlQueryString(prefix + "refund_from_transaction_fee" + suffix));
    }

    // add `refund_from_received_amount` to the URL query string
    if (getRefundFromReceivedAmount() != null) {
      joiner.add(getRefundFromReceivedAmount().toUrlQueryString(prefix + "refund_from_received_amount" + suffix));
    }

    // add `total_refunded_amount` to the URL query string
    if (getTotalRefundedAmount() != null) {
      joiner.add(getTotalRefundedAmount().toUrlQueryString(prefix + "total_refunded_amount" + suffix));
    }

    return joiner.toString();
  }

}

