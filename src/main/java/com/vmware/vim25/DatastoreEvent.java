package com.vmware.vim25;

import com.vmware.vim25.DatastoreCapacityIncreasedEvent;
import com.vmware.vim25.DatastoreDestroyedEvent;
import com.vmware.vim25.DatastoreDuplicatedEvent;
import com.vmware.vim25.DatastoreEvent;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.DatastoreFileEvent;
import com.vmware.vim25.DatastoreIORMReconfiguredEvent;
import com.vmware.vim25.DatastoreRenamedEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.NonVIWorkloadDetectedOnDatastoreEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreEvent", propOrder = {"datastore"})
@XmlSeeAlso({DatastoreCapacityIncreasedEvent.class, DatastoreRenamedEvent.class, DatastoreIORMReconfiguredEvent.class, NonVIWorkloadDetectedOnDatastoreEvent.class, DatastoreDestroyedEvent.class, DatastoreFileEvent.class, DatastoreDuplicatedEvent.class})
public class DatastoreEvent extends Event {
  protected DatastoreEventArgument datastore;
  
  public DatastoreEventArgument getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.datastore = paramDatastoreEventArgument;
  }
}
