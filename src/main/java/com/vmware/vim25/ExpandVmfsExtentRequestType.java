package com.vmware.vim25;

import com.vmware.vim25.ExpandVmfsExtentRequestType;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpandVmfsExtentRequestType", propOrder = {"_this", "vmfsPath", "extent"})
public class ExpandVmfsExtentRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vmfsPath;
  
  @XmlElement(required = true)
  protected HostScsiDiskPartition extent;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVmfsPath() {
    return this.vmfsPath;
  }
  
  public void setVmfsPath(String paramString) {
    this.vmfsPath = paramString;
  }
  
  public HostScsiDiskPartition getExtent() {
    return this.extent;
  }
  
  public void setExtent(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.extent = paramHostScsiDiskPartition;
  }
}
