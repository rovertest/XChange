package com.xeiam.xchange.bitfinex.v1.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BitfinexNewOrderRequest {

  @JsonProperty("request")
  protected String request;

  @JsonProperty("nonce")
  protected String nonce;

  @JsonProperty("symbol")
  protected String symbol;

  @JsonProperty("exchange")
  protected String exchange;

  @JsonProperty("side")
  protected String side;

  @JsonProperty("type")
  protected String type;

  @JsonProperty("amount")
  protected BigDecimal amount;

  @JsonProperty("price")
  protected BigDecimal price;

  /**
   * Constructor
   * 
   * @param nonce
   * @param symbol
   * @param amount
   * @param price
   * @param exchange
   * @param side
   * @param type
   */
  public BitfinexNewOrderRequest(String nonce, String symbol, BigDecimal amount, BigDecimal price, String exchange, String side, String type) {

    this.request = "/v1/order/new";
    this.nonce = nonce;
    this.symbol = symbol;
    this.amount = amount;
    this.price = price;
    this.exchange = exchange;
    this.side = side;
    this.type = type;
  }

  public String getRequest() {

    return request;
  }

  public void setRequest(String request) {

    this.request = request;
  }

  public String getNonce() {

    return nonce;
  }

  public void setNonce(String nonce) {

    this.nonce = nonce;
  }

  public String getSide() {

    return side;
  }

  public String getType() {

    return type;
  }

  public String getSymbol() {

    return symbol;
  }

  public String getAmount() {

    return amount.toPlainString();
  }

  public String getPrice() {

    return price.toPlainString();
  }

}
