package com.vmware.vim25;

import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.Event;
import com.vmware.vim25.LockerMisconfiguredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockerMisconfiguredEvent", propOrder = {"datastore"})
public class LockerMisconfiguredEvent extends Event {
  @XmlElement(required = true)
  protected DatastoreEventArgument datastore;
  
  public DatastoreEventArgument getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.datastore = paramDatastoreEventArgument;
  }
}
