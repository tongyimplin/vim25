package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPowerPolicy;
import com.vmware.vim25.HostPowerPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPowerPolicy", propOrder = {"hostPowerPolicy"})
public class ArrayOfHostPowerPolicy {
  @XmlElement(name = "HostPowerPolicy")
  protected List<HostPowerPolicy> hostPowerPolicy;
  
  public List<HostPowerPolicy> getHostPowerPolicy() {
    if (this.hostPowerPolicy == null)
      this.hostPowerPolicy = new ArrayList<>(); 
    return this.hostPowerPolicy;
  }
}
