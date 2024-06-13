package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIpPoolManagerIpAllocation;
import com.vmware.vim25.IpPoolManagerIpAllocation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIpPoolManagerIpAllocation", propOrder = {"ipPoolManagerIpAllocation"})
public class ArrayOfIpPoolManagerIpAllocation {
  @XmlElement(name = "IpPoolManagerIpAllocation")
  protected List<IpPoolManagerIpAllocation> ipPoolManagerIpAllocation;
  
  public List<IpPoolManagerIpAllocation> getIpPoolManagerIpAllocation() {
    if (this.ipPoolManagerIpAllocation == null)
      this.ipPoolManagerIpAllocation = new ArrayList<>(); 
    return this.ipPoolManagerIpAllocation;
  }
}
