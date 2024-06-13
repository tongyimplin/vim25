package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPowerPolicy;
import com.vmware.vim25.PowerSystemCapability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSystemCapability", propOrder = {"availablePolicy"})
public class PowerSystemCapability extends DynamicData {
  @XmlElement(required = true)
  protected List<HostPowerPolicy> availablePolicy;
  
  public List<HostPowerPolicy> getAvailablePolicy() {
    if (this.availablePolicy == null)
      this.availablePolicy = new ArrayList<>(); 
    return this.availablePolicy;
  }
}
