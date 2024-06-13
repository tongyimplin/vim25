package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageVmotionIncompatible;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageVmotionIncompatible", propOrder = {"datastore"})
public class StorageVmotionIncompatible extends VirtualHardwareCompatibilityIssue {
  protected ManagedObjectReference datastore;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
