package com.vmware.vim25;

import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.Event;
import com.vmware.vim25.LockerReconfiguredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockerReconfiguredEvent", propOrder = {"oldDatastore", "newDatastore"})
public class LockerReconfiguredEvent extends Event {
  protected DatastoreEventArgument oldDatastore;
  
  protected DatastoreEventArgument newDatastore;
  
  public DatastoreEventArgument getOldDatastore() {
    return this.oldDatastore;
  }
  
  public void setOldDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.oldDatastore = paramDatastoreEventArgument;
  }
  
  public DatastoreEventArgument getNewDatastore() {
    return this.newDatastore;
  }
  
  public void setNewDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.newDatastore = paramDatastoreEventArgument;
  }
}
