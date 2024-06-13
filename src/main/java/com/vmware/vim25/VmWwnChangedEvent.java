package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmWwnChangedEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmWwnChangedEvent", propOrder = {"oldNodeWwns", "oldPortWwns", "newNodeWwns", "newPortWwns"})
public class VmWwnChangedEvent extends VmEvent {
  @XmlElement(type = Long.class)
  protected List<Long> oldNodeWwns;
  
  @XmlElement(type = Long.class)
  protected List<Long> oldPortWwns;
  
  @XmlElement(type = Long.class)
  protected List<Long> newNodeWwns;
  
  @XmlElement(type = Long.class)
  protected List<Long> newPortWwns;
  
  public List<Long> getOldNodeWwns() {
    if (this.oldNodeWwns == null)
      this.oldNodeWwns = new ArrayList<>(); 
    return this.oldNodeWwns;
  }
  
  public List<Long> getOldPortWwns() {
    if (this.oldPortWwns == null)
      this.oldPortWwns = new ArrayList<>(); 
    return this.oldPortWwns;
  }
  
  public List<Long> getNewNodeWwns() {
    if (this.newNodeWwns == null)
      this.newNodeWwns = new ArrayList<>(); 
    return this.newNodeWwns;
  }
  
  public List<Long> getNewPortWwns() {
    if (this.newPortWwns == null)
      this.newPortWwns = new ArrayList<>(); 
    return this.newPortWwns;
  }
}
