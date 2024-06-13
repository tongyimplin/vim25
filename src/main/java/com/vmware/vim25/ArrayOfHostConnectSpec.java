package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostConnectSpec;
import com.vmware.vim25.HostConnectSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostConnectSpec", propOrder = {"hostConnectSpec"})
public class ArrayOfHostConnectSpec {
  @XmlElement(name = "HostConnectSpec")
  protected List<HostConnectSpec> hostConnectSpec;
  
  public List<HostConnectSpec> getHostConnectSpec() {
    if (this.hostConnectSpec == null)
      this.hostConnectSpec = new ArrayList<>(); 
    return this.hostConnectSpec;
  }
}
