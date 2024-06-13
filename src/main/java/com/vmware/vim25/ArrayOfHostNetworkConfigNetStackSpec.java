package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNetworkConfigNetStackSpec;
import com.vmware.vim25.HostNetworkConfigNetStackSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNetworkConfigNetStackSpec", propOrder = {"hostNetworkConfigNetStackSpec"})
public class ArrayOfHostNetworkConfigNetStackSpec {
  @XmlElement(name = "HostNetworkConfigNetStackSpec")
  protected List<HostNetworkConfigNetStackSpec> hostNetworkConfigNetStackSpec;
  
  public List<HostNetworkConfigNetStackSpec> getHostNetworkConfigNetStackSpec() {
    if (this.hostNetworkConfigNetStackSpec == null)
      this.hostNetworkConfigNetStackSpec = new ArrayList<>(); 
    return this.hostNetworkConfigNetStackSpec;
  }
}
