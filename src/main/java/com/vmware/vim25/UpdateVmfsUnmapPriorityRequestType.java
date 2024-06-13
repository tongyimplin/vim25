package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVmfsUnmapPriorityRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVmfsUnmapPriorityRequestType", propOrder = {"_this", "vmfsUuid", "unmapPriority"})
public class UpdateVmfsUnmapPriorityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vmfsUuid;
  
  @XmlElement(required = true)
  protected String unmapPriority;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVmfsUuid() {
    return this.vmfsUuid;
  }
  
  public void setVmfsUuid(String paramString) {
    this.vmfsUuid = paramString;
  }
  
  public String getUnmapPriority() {
    return this.unmapPriority;
  }
  
  public void setUnmapPriority(String paramString) {
    this.unmapPriority = paramString;
  }
}
