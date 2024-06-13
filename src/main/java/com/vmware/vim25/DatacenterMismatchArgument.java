package com.vmware.vim25;

import com.vmware.vim25.DatacenterMismatchArgument;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterMismatchArgument", propOrder = {"entity", "inputDatacenter"})
public class DatacenterMismatchArgument extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected ManagedObjectReference inputDatacenter;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getInputDatacenter() {
    return this.inputDatacenter;
  }
  
  public void setInputDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.inputDatacenter = paramManagedObjectReference;
  }
}
