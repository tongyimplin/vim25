package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.StringPolicy;
import com.vmware.vim25.VMwareUplinkLacpPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareUplinkLacpPolicy", propOrder = {"enable", "mode"})
public class VMwareUplinkLacpPolicy extends InheritablePolicy {
  protected BoolPolicy enable;
  
  protected StringPolicy mode;
  
  public BoolPolicy getEnable() {
    return this.enable;
  }
  
  public void setEnable(BoolPolicy paramBoolPolicy) {
    this.enable = paramBoolPolicy;
  }
  
  public StringPolicy getMode() {
    return this.mode;
  }
  
  public void setMode(StringPolicy paramStringPolicy) {
    this.mode = paramStringPolicy;
  }
}
