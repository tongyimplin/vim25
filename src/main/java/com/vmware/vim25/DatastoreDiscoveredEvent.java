package com.vmware.vim25;

import com.vmware.vim25.DatastoreDiscoveredEvent;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreDiscoveredEvent", propOrder = {"datastore"})
public class DatastoreDiscoveredEvent extends HostEvent {
  @XmlElement(required = true)
  protected DatastoreEventArgument datastore;
  
  public DatastoreEventArgument getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.datastore = paramDatastoreEventArgument;
  }
}
