package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskFilterSpecByEntity;
import com.vmware.vim25.TaskFilterSpecRecursionOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpecByEntity", propOrder = {"entity", "recursion"})
public class TaskFilterSpecByEntity extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected TaskFilterSpecRecursionOption recursion;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public TaskFilterSpecRecursionOption getRecursion() {
    return this.recursion;
  }
  
  public void setRecursion(TaskFilterSpecRecursionOption paramTaskFilterSpecRecursionOption) {
    this.recursion = paramTaskFilterSpecRecursionOption;
  }
}
