package com.vmware.vim25;

import com.vmware.vim25.DatacenterEventArgument;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmBeingRelocatedEvent;
import com.vmware.vim25.VmRelocateSpecEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingRelocatedEvent", propOrder = {"destHost", "destDatacenter", "destDatastore"})
public class VmBeingRelocatedEvent extends VmRelocateSpecEvent {
  @XmlElement(required = true)
  protected HostEventArgument destHost;
  
  protected DatacenterEventArgument destDatacenter;
  
  protected DatastoreEventArgument destDatastore;
  
  public HostEventArgument getDestHost() {
    return this.destHost;
  }
  
  public void setDestHost(HostEventArgument paramHostEventArgument) {
    this.destHost = paramHostEventArgument;
  }
  
  public DatacenterEventArgument getDestDatacenter() {
    return this.destDatacenter;
  }
  
  public void setDestDatacenter(DatacenterEventArgument paramDatacenterEventArgument) {
    this.destDatacenter = paramDatacenterEventArgument;
  }
  
  public DatastoreEventArgument getDestDatastore() {
    return this.destDatastore;
  }
  
  public void setDestDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.destDatastore = paramDatastoreEventArgument;
  }
}
