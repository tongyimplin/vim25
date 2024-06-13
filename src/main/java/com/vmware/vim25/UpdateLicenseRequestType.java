package com.vmware.vim25;

import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateLicenseRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLicenseRequestType", propOrder = {"_this", "licenseKey", "labels"})
public class UpdateLicenseRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String licenseKey;
  
  protected List<KeyValue> labels;
  
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
  
  public List<KeyValue> getLabels() {
    if (this.labels == null)
      this.labels = new ArrayList<>(); 
    return this.labels;
  }
}
