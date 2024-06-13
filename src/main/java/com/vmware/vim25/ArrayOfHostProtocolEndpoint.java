package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProtocolEndpoint;
import com.vmware.vim25.HostProtocolEndpoint;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProtocolEndpoint", propOrder = {"hostProtocolEndpoint"})
public class ArrayOfHostProtocolEndpoint {
  @XmlElement(name = "HostProtocolEndpoint")
  protected List<HostProtocolEndpoint> hostProtocolEndpoint;
  
  public List<HostProtocolEndpoint> getHostProtocolEndpoint() {
    if (this.hostProtocolEndpoint == null)
      this.hostProtocolEndpoint = new ArrayList<>(); 
    return this.hostProtocolEndpoint;
  }
}
