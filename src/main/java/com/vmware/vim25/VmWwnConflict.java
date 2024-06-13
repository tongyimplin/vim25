package com.vmware.vim25;

import com.vmware.vim25.InvalidVmConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmWwnConflict;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmWwnConflict", propOrder = {"vm", "host", "name", "wwn"})
public class VmWwnConflict extends InvalidVmConfig {
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference host;
  
  protected String name;
  
  protected Long wwn;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Long getWwn() {
    return this.wwn;
  }
  
  public void setWwn(Long paramLong) {
    this.wwn = paramLong;
  }
}
