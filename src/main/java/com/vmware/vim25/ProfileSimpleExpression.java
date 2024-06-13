package com.vmware.vim25;

import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.ProfileExpression;
import com.vmware.vim25.ProfileSimpleExpression;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileSimpleExpression", propOrder = {"expressionType", "parameter"})
public class ProfileSimpleExpression extends ProfileExpression {
  @XmlElement(required = true)
  protected String expressionType;
  
  protected List<KeyAnyValue> parameter;
  
  public String getExpressionType() {
    return this.expressionType;
  }
  
  public void setExpressionType(String paramString) {
    this.expressionType = paramString;
  }
  
  public List<KeyAnyValue> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
