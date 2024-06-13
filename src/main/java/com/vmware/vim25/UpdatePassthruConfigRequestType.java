package com.vmware.vim25;

import com.vmware.vim25.HostPciPassthruConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdatePassthruConfigRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePassthruConfigRequestType", propOrder = {"_this", "config"})
public class UpdatePassthruConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<HostPciPassthruConfig> config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostPciPassthruConfig> getConfig() {
    if (this.config == null)
      this.config = new ArrayList<>(); 
    return this.config;
  }
}
