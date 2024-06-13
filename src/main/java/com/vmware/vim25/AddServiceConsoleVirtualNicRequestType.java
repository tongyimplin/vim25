package com.vmware.vim25;

import com.vmware.vim25.AddServiceConsoleVirtualNicRequestType;
import com.vmware.vim25.HostVirtualNicSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddServiceConsoleVirtualNicRequestType", propOrder = {"_this", "portgroup", "nic"})
public class AddServiceConsoleVirtualNicRequestType {
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
