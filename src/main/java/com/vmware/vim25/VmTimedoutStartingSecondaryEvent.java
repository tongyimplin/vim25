package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmTimedoutStartingSecondaryEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmTimedoutStartingSecondaryEvent", propOrder = {"timeout"})
public class VmTimedoutStartingSecondaryEvent extends VmEvent {
  protected Long timeout;
  
  public Long getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(Long paramLong) {
    this.timeout = paramLong;
  }
}
