package com.vmware.vim25;

import com.vmware.vim25.DatastoreNotWritableOnHost;
import com.vmware.vim25.InaccessibleDatastore;
import com.vmware.vim25.InvalidDatastore;
import com.vmware.vim25.InvalidDatastorePath;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDatastore", propOrder = {"datastore", "name"})
@XmlSeeAlso({InvalidDatastorePath.class, InaccessibleDatastore.class, DatastoreNotWritableOnHost.class})
public class InvalidDatastore extends VimFault {
  protected ManagedObjectReference datastore;
  
  protected String name;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
