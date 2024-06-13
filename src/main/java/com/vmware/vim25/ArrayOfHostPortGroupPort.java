package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPortGroupPort;
import com.vmware.vim25.HostPortGroupPort;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPortGroupPort", propOrder = {"hostPortGroupPort"})
public class ArrayOfHostPortGroupPort {
  @XmlElement(name = "HostPortGroupPort")
  protected List<HostPortGroupPort> hostPortGroupPort;
  
  public List<HostPortGroupPort> getHostPortGroupPort() {
    if (this.hostPortGroupPort == null)
      this.hostPortGroupPort = new ArrayList<>(); 
    return this.hostPortGroupPort;
  }
}
