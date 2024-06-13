package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.VAppCloneSpecResourceMap;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppCloneSpecResourceMap", propOrder = {"source", "parent", "resourceSpec", "location"})
public class VAppCloneSpecResourceMap extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  protected ManagedObjectReference parent;
  
  protected ResourceConfigSpec resourceSpec;
  
  protected ManagedObjectReference location;
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getParent() {
    return this.parent;
  }
  
  public void setParent(ManagedObjectReference paramManagedObjectReference) {
    this.parent = paramManagedObjectReference;
  }
  
  public ResourceConfigSpec getResourceSpec() {
    return this.resourceSpec;
  }
  
  public void setResourceSpec(ResourceConfigSpec paramResourceConfigSpec) {
    this.resourceSpec = paramResourceConfigSpec;
  }
  
  public ManagedObjectReference getLocation() {
    return this.location;
  }
  
  public void setLocation(ManagedObjectReference paramManagedObjectReference) {
    this.location = paramManagedObjectReference;
  }
}
