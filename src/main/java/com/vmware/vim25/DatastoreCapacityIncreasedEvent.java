package com.vmware.vim25;

import com.vmware.vim25.DatastoreCapacityIncreasedEvent;
import com.vmware.vim25.DatastoreEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreCapacityIncreasedEvent", propOrder = {"oldCapacity", "newCapacity"})
public class DatastoreCapacityIncreasedEvent extends DatastoreEvent {
  protected long oldCapacity;
  
  protected long newCapacity;
  
  public long getOldCapacity() {
    return this.oldCapacity;
  }
  
  public void setOldCapacity(long paramLong) {
    this.oldCapacity = paramLong;
  }
  
  public long getNewCapacity() {
    return this.newCapacity;
  }
  
  public void setNewCapacity(long paramLong) {
    this.newCapacity = paramLong;
  }
}
