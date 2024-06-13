package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHCIConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ValidateHCIConfigurationRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateHCIConfigurationRequestType", propOrder = {"_this", "hciConfigSpec", "hosts"})
public class ValidateHCIConfigurationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ClusterComputeResourceHCIConfigSpec hciConfigSpec;
  
  protected List<ManagedObjectReference> hosts;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ClusterComputeResourceHCIConfigSpec getHciConfigSpec() {
    return this.hciConfigSpec;
  }
  
  public void setHciConfigSpec(ClusterComputeResourceHCIConfigSpec paramClusterComputeResourceHCIConfigSpec) {
    this.hciConfigSpec = paramClusterComputeResourceHCIConfigSpec;
  }
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
