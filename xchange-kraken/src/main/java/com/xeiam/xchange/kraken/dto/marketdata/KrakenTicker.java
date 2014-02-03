/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.kraken.dto.marketdata;

import java.math.BigDecimal;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data object representing depth from Kraken
 */
public class KrakenTicker {

  private final KrakenOrder ask; // ask array(<price>, <lot volume>),
  private final KrakenOrder bid; // bid array(<price>, <lot volume>),
  private final KrakenOrder close; // last trade closed array(<price>, <lot volume>),
  private final BigDecimal[] volume; // volume array(<today>, <last 24 hours>),
  private final BigDecimal[] volumeAvg; // volume weighted average price array(<today>, <last 24 hours>),
  private final BigDecimal[] trades; // number of trades array(<today>, <last 24 hours>),
  private final BigDecimal[] low; // low array(<today>, <last 24 hours>),
  private final BigDecimal[] high; // high array(<today>, <last 24 hours>),
  private final BigDecimal open; // today's opening price

  /**
   * Constructor
   * 
   * @param ask
   * @param bid
   * @param close
   * @param volume
   * @param volumeAvg
   * @param trades
   * @param low
   * @param high
   * @param open
   * @author Raphael Voellmy
   */

  public KrakenTicker(@JsonProperty("a") KrakenOrder ask, @JsonProperty("b") KrakenOrder bid, @JsonProperty("c") KrakenOrder close, @JsonProperty("v") BigDecimal[] volume,
      @JsonProperty("p") BigDecimal[] volumeAvg, @JsonProperty("t") BigDecimal[] trades, @JsonProperty("l") BigDecimal[] low, @JsonProperty("h") BigDecimal[] high, @JsonProperty("o") BigDecimal open) {

    this.ask = ask;
    this.bid = bid;
    this.close = close;
    this.volume = volume;
    this.volumeAvg = volumeAvg;
    this.trades = trades;
    this.low = low;
    this.high = high;
    this.open = open;

  }

  public KrakenOrder getAsk() {

    return ask;
  }

  public KrakenOrder getBid() {

    return bid;
  }

  public KrakenOrder getClose() {

    return close;
  }

  public BigDecimal getTodaysVolume() {

    return volume[0];
  }

  public BigDecimal get24HourVolume() {

    return volume[1];
  }

  public BigDecimal getTodaysVolumeAvg() {

    return volumeAvg[0];
  }

  public BigDecimal get24HourVolumeAvg() {

    return volumeAvg[1];
  }

  public BigDecimal getTodaysNumTrades() {

    return trades[0];
  }

  public BigDecimal get24HourNumTrades() {

    return trades[1];
  }

  public BigDecimal getTodaysLow() {

    return low[0];
  }

  public BigDecimal get24HourLow() {

    return low[1];
  }

  public BigDecimal getTodaysHigh() {

    return high[0];
  }

  public BigDecimal get24HourHigh() {

    return high[1];
  }

  public BigDecimal getOpen() {

    return open;
  }

  @Override
  public String toString() {

    return "KrakenTicker [ask=" + ask + ", bid=" + bid + ", close=" + close + ", volume=" + Arrays.toString(volume) + ", volumeAvg=" + Arrays.toString(volumeAvg) + ", trades="
        + Arrays.toString(trades) + ", low=" + Arrays.toString(low) + ", high=" + Arrays.toString(high) + ", open=" + open + "]";
  }
}
