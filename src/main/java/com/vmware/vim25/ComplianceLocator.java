package com.vmware.vim25;

import com.vmware.vim25.ComplianceLocator;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfilePropertyPath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceLocator", propOrder = {"expressionName", "applyPath"})
public class ComplianceLocator extends DynamicData {
  @XmlElement(required = true)
  protected String expressionName;
  
  @XmlElement(required = true)
  protected ProfilePropertyPath applyPath;
  
  public String getExpressionName() {
    return this.expressionName;
  }
  
  public void setExpressionName(String paramString) {
    this.expressionName = paramString;
  }
  
  public ProfilePropertyPath getApplyPath() {
    return this.applyPath;
  }
  
  public void setApplyPath(ProfilePropertyPath paramProfilePropertyPath) {
    this.applyPath = paramProfilePropertyPath;
  }
}
