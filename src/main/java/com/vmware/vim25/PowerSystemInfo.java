package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPowerPolicy;
import com.vmware.vim25.PowerSystemInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSystemInfo", propOrder = {"currentPolicy"})
public class PowerSystemInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostPowerPolicy currentPolicy;
  
  public HostPowerPolicy getCurrentPolicy() {
    return this.currentPolicy;
  }
  
  public void setCurrentPolicy(HostPowerPolicy paramHostPowerPolicy) {
    this.currentPolicy = paramHostPowerPolicy;
  }
}
