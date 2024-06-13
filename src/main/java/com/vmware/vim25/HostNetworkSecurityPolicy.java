package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkSecurityPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkSecurityPolicy", propOrder = {"allowPromiscuous", "macChanges", "forgedTransmits"})
public class HostNetworkSecurityPolicy extends DynamicData {
  protected Boolean allowPromiscuous;
  
  protected Boolean macChanges;
  
  protected Boolean forgedTransmits;
  
  public Boolean isAllowPromiscuous() {
    return this.allowPromiscuous;
  }
  
  public void setAllowPromiscuous(Boolean paramBoolean) {
    this.allowPromiscuous = paramBoolean;
  }
  
  public Boolean isMacChanges() {
    return this.macChanges;
  }
  
  public void setMacChanges(Boolean paramBoolean) {
    this.macChanges = paramBoolean;
  }
  
  public Boolean isForgedTransmits() {
    return this.forgedTransmits;
  }
  
  public void setForgedTransmits(Boolean paramBoolean) {
    this.forgedTransmits = paramBoolean;
  }
}
