package com.holmes.csv;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Holmes Salazar
 */
public class Table {

  private String scenarioName;

  private Rule rule;

  private double expectedCompensation;

  public String getScenarioName() {
    return scenarioName;
  }

  public void setScenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
  }

  public Rule getRule() {
    return rule;
  }

  public void setRule(Rule rule) {
    this.rule = rule;
  }

  public double getExpectedCompensation() {
    return expectedCompensation;
  }

  public void setExpectedCompensation(double expectedCompensation) {
    this.expectedCompensation = expectedCompensation;
  }

  @Override public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("scenarioName", scenarioName)
        .append("rule", rule)
        .append("expectedCompensation", expectedCompensation)
        .toString();
  }
}
