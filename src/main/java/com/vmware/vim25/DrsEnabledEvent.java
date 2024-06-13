package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.DrsEnabledEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrsEnabledEvent", propOrder = {"behavior"})
public class DrsEnabledEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected String behavior;
  
  public String getBehavior() {
    return this.behavior;
  }
  
  public void setBehavior(String paramString) {
    this.behavior = paramString;
  }
}
