package com.vmware.vim25;

import com.vmware.vim25.AddVirtualNicRequestType;
import com.vmware.vim25.HostVirtualNicSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVirtualNicRequestType", propOrder = {"_this", "portgroup", "nic"})
public class AddVirtualNicRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String portgroup;
  
  @XmlElement(required = true)
  protected HostVirtualNicSpec nic;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getPortgroup() {
    return this.portgroup;
  }
  
  public void setPortgroup(String paramString) {
    this.portgroup = paramString;
  }
  
  public HostVirtualNicSpec getNic() {
    return this.nic;
  }
  
  public void setNic(HostVirtualNicSpec paramHostVirtualNicSpec) {
    this.nic = paramHostVirtualNicSpec;
  }
}
