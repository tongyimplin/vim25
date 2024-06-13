package com.vmware.vim25;

import com.vmware.vim25.ComplianceFailure;
import com.vmware.vim25.ComplianceFailureComplianceFailureValues;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceFailure", propOrder = {"failureType", "message", "expressionName", "failureValues"})
public class ComplianceFailure extends DynamicData {
  @XmlElement(required = true)
  protected String failureType;
  
  @XmlElement(required = true)
  protected LocalizableMessage message;
  
  protected String expressionName;
  
  protected List<ComplianceFailureComplianceFailureValues> failureValues;
  
  public String getFailureType() {
    return this.failureType;
  }
  
  public void setFailureType(String paramString) {
    this.failureType = paramString;
  }
  
  public LocalizableMessage getMessage() {
    return this.message;
  }
  
  public void setMessage(LocalizableMessage paramLocalizableMessage) {
    this.message = paramLocalizableMessage;
  }
  
  public String getExpressionName() {
    return this.expressionName;
  }
  
  public void setExpressionName(String paramString) {
    this.expressionName = paramString;
  }
  
  public List<ComplianceFailureComplianceFailureValues> getFailureValues() {
    if (this.failureValues == null)
      this.failureValues = new ArrayList<>(); 
    return this.failureValues;
  }
}
