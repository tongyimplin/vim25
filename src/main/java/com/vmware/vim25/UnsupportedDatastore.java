package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MemoryFileFormatNotSupportedByDatastore;
import com.vmware.vim25.UnSupportedDatastoreForVFlash;
import com.vmware.vim25.UnsupportedDatastore;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedDatastore", propOrder = {"datastore"})
@XmlSeeAlso({UnSupportedDatastoreForVFlash.class, MemoryFileFormatNotSupportedByDatastore.class})
public class UnsupportedDatastore extends VmConfigFault {
  protected ManagedObjectReference datastore;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
