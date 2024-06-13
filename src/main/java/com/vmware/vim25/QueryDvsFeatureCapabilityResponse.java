package com.vmware.vim25;

import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.QueryDvsFeatureCapabilityResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDvsFeatureCapabilityResponse")
public class QueryDvsFeatureCapabilityResponse {
  protected DVSFeatureCapability returnval;
  
  public DVSFeatureCapability getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(DVSFeatureCapability paramDVSFeatureCapability) {
    this.returnval = paramDVSFeatureCapability;
  }
}
