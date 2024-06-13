package com.vmware.vim25;

import com.vmware.vim25.DatastoreHostMount;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMountInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreHostMount", propOrder = {"key", "mountInfo"})
public class DatastoreHostMount extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  @XmlElement(required = true)
  protected HostMountInfo mountInfo;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public HostMountInfo getMountInfo() {
    return this.mountInfo;
  }
  
  public void setMountInfo(HostMountInfo paramHostMountInfo) {
    this.mountInfo = paramHostMountInfo;
  }
}
