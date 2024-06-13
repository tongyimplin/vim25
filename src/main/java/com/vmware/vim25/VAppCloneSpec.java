package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.VAppCloneSpec;
import com.vmware.vim25.VAppCloneSpecNetworkMappingPair;
import com.vmware.vim25.VAppCloneSpecResourceMap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppCloneSpec", propOrder = {"location", "host", "resourceSpec", "vmFolder", "networkMapping", "property", "resourceMapping", "provisioning"})
public class VAppCloneSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference location;
  
  protected ManagedObjectReference host;
  
  protected ResourceConfigSpec resourceSpec;
  
  protected ManagedObjectReference vmFolder;
  
  protected List<VAppCloneSpecNetworkMappingPair> networkMapping;
  
  protected List<KeyValue> property;
  
  protected List<VAppCloneSpecResourceMap> resourceMapping;
  
  protected String provisioning;
  
  public ManagedObjectReference getLocation() {
    return this.location;
  }
  
  public void setLocation(ManagedObjectReference paramManagedObjectReference) {
    this.location = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ResourceConfigSpec getResourceSpec() {
    return this.resourceSpec;
  }
  
  public void setResourceSpec(ResourceConfigSpec paramResourceConfigSpec) {
    this.resourceSpec = paramResourceConfigSpec;
  }
  
  public ManagedObjectReference getVmFolder() {
    return this.vmFolder;
  }
  
  public void setVmFolder(ManagedObjectReference paramManagedObjectReference) {
    this.vmFolder = paramManagedObjectReference;
  }
  
  public List<VAppCloneSpecNetworkMappingPair> getNetworkMapping() {
    if (this.networkMapping == null)
      this.networkMapping = new ArrayList<>(); 
    return this.networkMapping;
  }
  
  public List<KeyValue> getProperty() {
    if (this.property == null)
      this.property = new ArrayList<>(); 
    return this.property;
  }
  
  public List<VAppCloneSpecResourceMap> getResourceMapping() {
    if (this.resourceMapping == null)
      this.resourceMapping = new ArrayList<>(); 
    return this.resourceMapping;
  }
  
  public String getProvisioning() {
    return this.provisioning;
  }
  
  public void setProvisioning(String paramString) {
    this.provisioning = paramString;
  }
}
