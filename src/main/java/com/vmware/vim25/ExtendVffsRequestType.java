package com.vmware.vim25;

import com.vmware.vim25.ExtendVffsRequestType;
import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendVffsRequestType", propOrder = {"_this", "vffsPath", "devicePath", "spec"})
public class ExtendVffsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vffsPath;
  
  @XmlElement(required = true)
  protected String devicePath;
  
  protected HostDiskPartitionSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVffsPath() {
    return this.vffsPath;
  }
  
  public void setVffsPath(String paramString) {
    this.vffsPath = paramString;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public HostDiskPartitionSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.spec = paramHostDiskPartitionSpec;
  }
}
