package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostScsiTopologyInterface;
import com.vmware.vim25.HostScsiTopologyInterface;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiTopologyInterface", propOrder = {"hostScsiTopologyInterface"})
public class ArrayOfHostScsiTopologyInterface {
  @XmlElement(name = "HostScsiTopologyInterface")
  protected List<HostScsiTopologyInterface> hostScsiTopologyInterface;
  
  public List<HostScsiTopologyInterface> getHostScsiTopologyInterface() {
    if (this.hostScsiTopologyInterface == null)
      this.hostScsiTopologyInterface = new ArrayList<>(); 
    return this.hostScsiTopologyInterface;
  }
}
