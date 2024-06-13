package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.VmVnicPoolReservationViolationClearEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmVnicPoolReservationViolationClearEvent", propOrder = {"vmVnicResourcePoolKey", "vmVnicResourcePoolName"})
public class VmVnicPoolReservationViolationClearEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String vmVnicResourcePoolKey;
  
  protected String vmVnicResourcePoolName;
  
  public String getVmVnicResourcePoolKey() {
    return this.vmVnicResourcePoolKey;
  }
  
  public void setVmVnicResourcePoolKey(String paramString) {
    this.vmVnicResourcePoolKey = paramString;
  }
  
  public String getVmVnicResourcePoolName() {
    return this.vmVnicResourcePoolName;
  }
  
  public void setVmVnicResourcePoolName(String paramString) {
    this.vmVnicResourcePoolName = paramString;
  }
}
