package com.vmware.vim25;

import com.vmware.vim25.ExtendedEvent;
import com.vmware.vim25.ExtendedEventPair;
import com.vmware.vim25.GeneralEvent;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedEvent", propOrder = {"eventTypeId", "managedObject", "data"})
public class ExtendedEvent extends GeneralEvent {
  @XmlElement(required = true)
  protected String eventTypeId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference managedObject;
  
  protected List<ExtendedEventPair> data;
  
  public String getEventTypeId() {
    return this.eventTypeId;
  }
  
  public void setEventTypeId(String paramString) {
    this.eventTypeId = paramString;
  }
  
  public ManagedObjectReference getManagedObject() {
    return this.managedObject;
  }
  
  public void setManagedObject(ManagedObjectReference paramManagedObjectReference) {
    this.managedObject = paramManagedObjectReference;
  }
  
  public List<ExtendedEventPair> getData() {
    if (this.data == null)
      this.data = new ArrayList<>(); 
    return this.data;
  }
}
