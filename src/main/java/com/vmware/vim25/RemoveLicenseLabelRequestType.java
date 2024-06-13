package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveLicenseLabelRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveLicenseLabelRequestType", propOrder = {"_this", "licenseKey", "labelKey"})
public class RemoveLicenseLabelRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String licenseKey;
  
  @XmlElement(required = true)
  protected String labelKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getLicenseKey() {
    return this.licenseKey;
  }
  
  public void setLicenseKey(String paramString) {
    this.licenseKey = paramString;
  }
  
  public String getLabelKey() {
    return this.labelKey;
  }
  
  public void setLabelKey(String paramString) {
    this.labelKey = paramString;
  }
}
