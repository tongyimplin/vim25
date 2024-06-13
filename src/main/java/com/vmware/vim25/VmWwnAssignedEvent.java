package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmWwnAssignedEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmWwnAssignedEvent", propOrder = {"nodeWwns", "portWwns"})
public class VmWwnAssignedEvent extends VmEvent {
  @XmlElement(type = Long.class)
  protected List<Long> nodeWwns;
  
  @XmlElement(type = Long.class)
  protected List<Long> portWwns;
  
  public List<Long> getNodeWwns() {
    if (this.nodeWwns == null)
      this.nodeWwns = new ArrayList<>(); 
    return this.nodeWwns;
  }
  
  public List<Long> getPortWwns() {
    if (this.portWwns == null)
      this.portWwns = new ArrayList<>(); 
    return this.portWwns;
  }
}
