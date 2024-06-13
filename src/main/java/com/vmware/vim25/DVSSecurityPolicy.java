package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVSSecurityPolicy;
import com.vmware.vim25.InheritablePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSSecurityPolicy", propOrder = {"allowPromiscuous", "macChanges", "forgedTransmits"})
public class DVSSecurityPolicy extends InheritablePolicy {
  protected BoolPolicy allowPromiscuous;
  
  protected BoolPolicy macChanges;
  
  protected BoolPolicy forgedTransmits;
  
  public BoolPolicy getAllowPromiscuous() {
    return this.allowPromiscuous;
  }
  
  public void setAllowPromiscuous(BoolPolicy paramBoolPolicy) {
    this.allowPromiscuous = paramBoolPolicy;
  }
  
  public BoolPolicy getMacChanges() {
    return this.macChanges;
  }
  
  public void setMacChanges(BoolPolicy paramBoolPolicy) {
    this.macChanges = paramBoolPolicy;
  }
  
  public BoolPolicy getForgedTransmits() {
    return this.forgedTransmits;
  }
  
  public void setForgedTransmits(BoolPolicy paramBoolPolicy) {
    this.forgedTransmits = paramBoolPolicy;
  }
}
