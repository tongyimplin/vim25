package com.vmware.vim25;

import com.vmware.vim25.ComplianceFailureComplianceFailureValues;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceFailureComplianceFailureValues", propOrder = {"comparisonIdentifier", "profileInstance", "hostValue", "profileValue"})
public class ComplianceFailureComplianceFailureValues extends DynamicData {
  @XmlElement(required = true)
  protected String comparisonIdentifier;
  
  protected String profileInstance;
  
  protected Object hostValue;
  
  protected Object profileValue;
  
  public String getComparisonIdentifier() {
    return this.comparisonIdentifier;
  }
  
  public void setComparisonIdentifier(String paramString) {
    this.comparisonIdentifier = paramString;
  }
  
  public String getProfileInstance() {
    return this.profileInstance;
  }
  
  public void setProfileInstance(String paramString) {
    this.profileInstance = paramString;
  }
  
  public Object getHostValue() {
    return this.hostValue;
  }
  
  public void setHostValue(Object paramObject) {
    this.hostValue = paramObject;
  }
  
  public Object getProfileValue() {
    return this.profileValue;
  }
  
  public void setProfileValue(Object paramObject) {
    this.profileValue = paramObject;
  }
}
