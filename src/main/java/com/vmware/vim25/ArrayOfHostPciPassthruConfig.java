package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPciPassthruConfig;
import com.vmware.vim25.HostPciPassthruConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPciPassthruConfig", propOrder = {"hostPciPassthruConfig"})
public class ArrayOfHostPciPassthruConfig {
  @XmlElement(name = "HostPciPassthruConfig")
  protected List<HostPciPassthruConfig> hostPciPassthruConfig;
  
  public List<HostPciPassthruConfig> getHostPciPassthruConfig() {
    if (this.hostPciPassthruConfig == null)
      this.hostPciPassthruConfig = new ArrayList<>(); 
    return this.hostPciPassthruConfig;
  }
}
