package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfResourceMap;
import com.vmware.vim25.ResourceConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfResourceMap", propOrder = {"source", "parent", "resourceSpec", "datastore"})
public class OvfResourceMap extends DynamicData {
  @XmlElement(required = true)
  protected String source;
  
  protected ManagedObjectReference parent;
  
  protected ResourceConfigSpec resourceSpec;
  
  protected ManagedObjectReference datastore;
  
  public String getSource() {
    return this.source;
  }
  
  public void setSource(String paramString) {
    this.source = paramString;
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
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
