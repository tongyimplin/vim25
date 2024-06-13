package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSnmpDestination;
import com.vmware.vim25.HostSnmpDestination;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSnmpDestination", propOrder = {"hostSnmpDestination"})
public class ArrayOfHostSnmpDestination {
  @XmlElement(name = "HostSnmpDestination")
  protected List<HostSnmpDestination> hostSnmpDestination;
  
  public List<HostSnmpDestination> getHostSnmpDestination() {
    if (this.hostSnmpDestination == null)
      this.hostSnmpDestination = new ArrayList<>(); 
    return this.hostSnmpDestination;
  }
}
