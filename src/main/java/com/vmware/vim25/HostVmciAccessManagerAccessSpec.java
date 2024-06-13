package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVmciAccessManagerAccessSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVmciAccessManagerAccessSpec", propOrder = {"vm", "services", "mode"})
public class HostVmciAccessManagerAccessSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected List<String> services;
  
  @XmlElement(required = true)
  protected String mode;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public List<String> getServices() {
    if (this.services == null)
      this.services = new ArrayList<>(); 
    return this.services;
  }
  
  public String getMode() {
    return this.mode;
  }
  
  public void setMode(String paramString) {
    this.mode = paramString;
  }
}
