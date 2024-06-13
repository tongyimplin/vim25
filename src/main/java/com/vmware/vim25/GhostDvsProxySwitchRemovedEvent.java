package com.vmware.vim25;

import com.vmware.vim25.GhostDvsProxySwitchRemovedEvent;
import com.vmware.vim25.HostEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GhostDvsProxySwitchRemovedEvent", propOrder = {"switchUuid"})
public class GhostDvsProxySwitchRemovedEvent extends HostEvent {
  @XmlElement(required = true)
  protected List<String> switchUuid;
  
  public List<String> getSwitchUuid() {
    if (this.switchUuid == null)
      this.switchUuid = new ArrayList<>(); 
    return this.switchUuid;
  }
}
