package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostScsiTopologyTarget;
import com.vmware.vim25.HostScsiTopologyTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiTopologyTarget", propOrder = {"hostScsiTopologyTarget"})
public class ArrayOfHostScsiTopologyTarget {
  @XmlElement(name = "HostScsiTopologyTarget")
  protected List<HostScsiTopologyTarget> hostScsiTopologyTarget;
  
  public List<HostScsiTopologyTarget> getHostScsiTopologyTarget() {
    if (this.hostScsiTopologyTarget == null)
      this.hostScsiTopologyTarget = new ArrayList<>(); 
    return this.hostScsiTopologyTarget;
  }
}
