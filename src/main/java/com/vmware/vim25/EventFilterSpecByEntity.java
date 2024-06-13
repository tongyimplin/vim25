package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EventFilterSpecByEntity;
import com.vmware.vim25.EventFilterSpecRecursionOption;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterSpecByEntity", propOrder = {"entity", "recursion"})
public class EventFilterSpecByEntity extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected EventFilterSpecRecursionOption recursion;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public EventFilterSpecRecursionOption getRecursion() {
    return this.recursion;
  }
  
  public void setRecursion(EventFilterSpecRecursionOption paramEventFilterSpecRecursionOption) {
    this.recursion = paramEventFilterSpecRecursionOption;
  }
}
