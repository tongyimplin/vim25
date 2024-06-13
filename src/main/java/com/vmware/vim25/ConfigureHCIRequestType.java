package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHCIConfigSpec;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ConfigureHCIRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureHCIRequestType", propOrder = {"_this", "clusterSpec", "hostInputs"})
public class ConfigureHCIRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ClusterComputeResourceHCIConfigSpec clusterSpec;
  
  protected List<ClusterComputeResourceHostConfigurationInput> hostInputs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ClusterComputeResourceHCIConfigSpec getClusterSpec() {
    return this.clusterSpec;
  }
  
  public void setClusterSpec(ClusterComputeResourceHCIConfigSpec paramClusterComputeResourceHCIConfigSpec) {
    this.clusterSpec = paramClusterComputeResourceHCIConfigSpec;
  }
  
  public List<ClusterComputeResourceHostConfigurationInput> getHostInputs() {
    if (this.hostInputs == null)
      this.hostInputs = new ArrayList<>(); 
    return this.hostInputs;
  }
}
