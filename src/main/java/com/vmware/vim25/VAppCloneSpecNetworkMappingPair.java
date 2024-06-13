package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VAppCloneSpecNetworkMappingPair;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppCloneSpecNetworkMappingPair", propOrder = {"source", "destination"})
public class VAppCloneSpecNetworkMappingPair extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  @XmlElement(required = true)
  protected ManagedObjectReference destination;
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDestination() {
    return this.destination;
  }
  
  public void setDestination(ManagedObjectReference paramManagedObjectReference) {
    this.destination = paramManagedObjectReference;
  }
}
