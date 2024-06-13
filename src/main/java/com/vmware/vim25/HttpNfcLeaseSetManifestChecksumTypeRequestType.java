package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseSetManifestChecksumTypeRequestType;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseSetManifestChecksumTypeRequestType", propOrder = {"_this", "deviceUrlsToChecksumTypes"})
public class HttpNfcLeaseSetManifestChecksumTypeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<KeyValue> deviceUrlsToChecksumTypes;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<KeyValue> getDeviceUrlsToChecksumTypes() {
    if (this.deviceUrlsToChecksumTypes == null)
      this.deviceUrlsToChecksumTypes = new ArrayList<>(); 
    return this.deviceUrlsToChecksumTypes;
  }
}
