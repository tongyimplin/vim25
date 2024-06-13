package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostScsiTopologyLun;
import com.vmware.vim25.HostScsiTopologyLun;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiTopologyLun", propOrder = {"hostScsiTopologyLun"})
public class ArrayOfHostScsiTopologyLun {
  @XmlElement(name = "HostScsiTopologyLun")
  protected List<HostScsiTopologyLun> hostScsiTopologyLun;
  
  public List<HostScsiTopologyLun> getHostScsiTopologyLun() {
    if (this.hostScsiTopologyLun == null)
      this.hostScsiTopologyLun = new ArrayList<>(); 
    return this.hostScsiTopologyLun;
  }
}
