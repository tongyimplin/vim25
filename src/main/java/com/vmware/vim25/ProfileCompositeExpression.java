package com.vmware.vim25;

import com.vmware.vim25.ProfileCompositeExpression;
import com.vmware.vim25.ProfileExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCompositeExpression", propOrder = {"operator", "expressionName"})
public class ProfileCompositeExpression extends ProfileExpression {
  @XmlElement(required = true)
  protected String operator;
  
  @XmlElement(required = true)
  protected List<String> expressionName;
  
  public String getOperator() {
    return this.operator;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public List<String> getExpressionName() {
    if (this.expressionName == null)
      this.expressionName = new ArrayList<>(); 
    return this.expressionName;
  }
}
