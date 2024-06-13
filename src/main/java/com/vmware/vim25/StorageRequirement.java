package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageRequirement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageRequirement", propOrder = {"datastore", "freeSpaceRequiredInKb"})
public class StorageRequirement extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected long freeSpaceRequiredInKb;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public long getFreeSpaceRequiredInKb() {
    return this.freeSpaceRequiredInKb;
  }
  
  public void setFreeSpaceRequiredInKb(long paramLong) {
    this.freeSpaceRequiredInKb = paramLong;
  }
}
