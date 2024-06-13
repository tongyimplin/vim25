package com.vmware.vim25;

import com.vmware.vim25.ComputeDiskPartitionInfoRequestType;
import com.vmware.vim25.HostDiskPartitionLayout;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeDiskPartitionInfoRequestType", propOrder = {"_this", "devicePath", "layout", "partitionFormat"})
public class ComputeDiskPartitionInfoRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String devicePath;
  
  @XmlElement(required = true)
  protected HostDiskPartitionLayout layout;
  
  protected String partitionFormat;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public HostDiskPartitionLayout getLayout() {
    return this.layout;
  }
  
  public void setLayout(HostDiskPartitionLayout paramHostDiskPartitionLayout) {
    this.layout = paramHostDiskPartitionLayout;
  }
  
  public String getPartitionFormat() {
    return this.partitionFormat;
  }
  
  public void setPartitionFormat(String paramString) {
    this.partitionFormat = paramString;
  }
}
