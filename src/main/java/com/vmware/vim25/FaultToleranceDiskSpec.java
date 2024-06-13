package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceDiskSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceDiskSpec", propOrder = {"disk", "datastore"})
public class FaultToleranceDiskSpec extends DynamicData {
  @XmlElement(required = true)
  protected VirtualDevice disk;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  public VirtualDevice getDisk() {
    return this.disk;
  }
  
  public void setDisk(VirtualDevice paramVirtualDevice) {
    this.disk = paramVirtualDevice;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
