package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualPort;
import com.vmware.vim25.DistributedVirtualPort;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualPort", propOrder = {"distributedVirtualPort"})
public class ArrayOfDistributedVirtualPort {
  @XmlElement(name = "DistributedVirtualPort")
  protected List<DistributedVirtualPort> distributedVirtualPort;
  
  public List<DistributedVirtualPort> getDistributedVirtualPort() {
    if (this.distributedVirtualPort == null)
      this.distributedVirtualPort = new ArrayList<>(); 
    return this.distributedVirtualPort;
  }
}
