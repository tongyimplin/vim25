package com.vmware.vim25;

import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.HostProfileHostBasedConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileHostBasedConfigSpec", propOrder = {"host", "useHostProfileEngine"})
public class HostProfileHostBasedConfigSpec extends HostProfileConfigSpec {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected Boolean useHostProfileEngine;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public Boolean isUseHostProfileEngine() {
    return this.useHostProfileEngine;
  }
  
  public void setUseHostProfileEngine(Boolean paramBoolean) {
    this.useHostProfileEngine = paramBoolean;
  }
}
