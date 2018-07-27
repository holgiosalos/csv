package com.holmes.csv;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Holmes Salazar
 */
public class Rule {

  private String name;

  private String payout;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPayout() {
    return payout;
  }

  public void setPayout(String payout) {
    this.payout = payout;
  }

  @Override public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("name", name)
        .append("payout", payout)
        .toString();
  }
}
