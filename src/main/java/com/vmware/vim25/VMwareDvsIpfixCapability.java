package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDvsIpfixCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsIpfixCapability", propOrder = {"ipfixSupported", "ipv6ForIpfixSupported", "observationDomainIdSupported"})
public class VMwareDvsIpfixCapability extends DynamicData {
  protected Boolean ipfixSupported;
  
  protected Boolean ipv6ForIpfixSupported;
  
  protected Boolean observationDomainIdSupported;
  
  public Boolean isIpfixSupported() {
    return this.ipfixSupported;
  }
  
  public void setIpfixSupported(Boolean paramBoolean) {
    this.ipfixSupported = paramBoolean;
  }
  
  public Boolean isIpv6ForIpfixSupported() {
    return this.ipv6ForIpfixSupported;
  }
  
  public void setIpv6ForIpfixSupported(Boolean paramBoolean) {
    this.ipv6ForIpfixSupported = paramBoolean;
  }
  
  public Boolean isObservationDomainIdSupported() {
    return this.observationDomainIdSupported;
  }
  
  public void setObservationDomainIdSupported(Boolean paramBoolean) {
    this.observationDomainIdSupported = paramBoolean;
  }
}
