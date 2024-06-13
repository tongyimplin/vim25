package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PowerOnFtSecondaryTimedout;
import com.vmware.vim25.Timedout;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOnFtSecondaryTimedout", propOrder = {"vm", "vmName", "timeout"})
public class PowerOnFtSecondaryTimedout extends Timedout {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String vmName;
  
  protected int timeout;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public int getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(int paramInt) {
    this.timeout = paramInt;
  }
}
