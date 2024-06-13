package com.vmware.vim25;

import com.vmware.vim25.DatastoreNotWritableOnHost;
import com.vmware.vim25.InvalidDatastore;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SwapDatastoreNotWritableOnHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreNotWritableOnHost", propOrder = {"host"})
@XmlSeeAlso({SwapDatastoreNotWritableOnHost.class})
public class DatastoreNotWritableOnHost extends InvalidDatastore {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
