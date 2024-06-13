package com.vmware.vim25;

import com.vmware.vim25.DatacenterEventArgument;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmRelocateSpecEvent;
import com.vmware.vim25.VmRelocatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmRelocatedEvent", propOrder = {"sourceHost", "sourceDatacenter", "sourceDatastore"})
public class VmRelocatedEvent extends VmRelocateSpecEvent {
  @XmlElement(required = true)
  protected HostEventArgument sourceHost;
  
  protected DatacenterEventArgument sourceDatacenter;
  
  protected DatastoreEventArgument sourceDatastore;
  
  public HostEventArgument getSourceHost() {
    return this.sourceHost;
  }
  
  public void setSourceHost(HostEventArgument paramHostEventArgument) {
    this.sourceHost = paramHostEventArgument;
  }
  
  public DatacenterEventArgument getSourceDatacenter() {
    return this.sourceDatacenter;
  }
  
  public void setSourceDatacenter(DatacenterEventArgument paramDatacenterEventArgument) {
    this.sourceDatacenter = paramDatacenterEventArgument;
  }
  
  public DatastoreEventArgument getSourceDatastore() {
    return this.sourceDatastore;
  }
  
  public void setSourceDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.sourceDatastore = paramDatastoreEventArgument;
  }
}
