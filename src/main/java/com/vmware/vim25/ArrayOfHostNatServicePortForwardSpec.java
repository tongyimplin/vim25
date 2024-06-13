package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNatServicePortForwardSpec;
import com.vmware.vim25.HostNatServicePortForwardSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNatServicePortForwardSpec", propOrder = {"hostNatServicePortForwardSpec"})
public class ArrayOfHostNatServicePortForwardSpec {
  @XmlElement(name = "HostNatServicePortForwardSpec")
  protected List<HostNatServicePortForwardSpec> hostNatServicePortForwardSpec;
  
  public List<HostNatServicePortForwardSpec> getHostNatServicePortForwardSpec() {
    if (this.hostNatServicePortForwardSpec == null)
      this.hostNatServicePortForwardSpec = new ArrayList<>(); 
    return this.hostNatServicePortForwardSpec;
  }
}
