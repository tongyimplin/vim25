package com.vmware.vim25;

import com.vmware.vim25.BatchQueryConnectInfoRequestType;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchQueryConnectInfoRequestType", propOrder = {"_this", "hostSpecs"})
public class BatchQueryConnectInfoRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<HostConnectSpec> hostSpecs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostConnectSpec> getHostSpecs() {
    if (this.hostSpecs == null)
      this.hostSpecs = new ArrayList<>(); 
    return this.hostSpecs;
  }
}
