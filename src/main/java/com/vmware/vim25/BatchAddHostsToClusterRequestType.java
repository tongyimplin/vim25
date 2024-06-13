package com.vmware.vim25;

import com.vmware.vim25.BatchAddHostsToClusterRequestType;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.FolderNewHostSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchAddHostsToClusterRequestType", propOrder = {"_this", "cluster", "newHosts", "existingHosts", "compResSpec", "desiredState"})
public class BatchAddHostsToClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference cluster;
  
  protected List<FolderNewHostSpec> newHosts;
  
  protected List<ManagedObjectReference> existingHosts;
  
  protected ComputeResourceConfigSpec compResSpec;
  
  protected String desiredState;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCluster() {
    return this.cluster;
  }
  
  public void setCluster(ManagedObjectReference paramManagedObjectReference) {
    this.cluster = paramManagedObjectReference;
  }
  
  public List<FolderNewHostSpec> getNewHosts() {
    if (this.newHosts == null)
      this.newHosts = new ArrayList<>(); 
    return this.newHosts;
  }
  
  public List<ManagedObjectReference> getExistingHosts() {
    if (this.existingHosts == null)
      this.existingHosts = new ArrayList<>(); 
    return this.existingHosts;
  }
  
  public ComputeResourceConfigSpec getCompResSpec() {
    return this.compResSpec;
  }
  
  public void setCompResSpec(ComputeResourceConfigSpec paramComputeResourceConfigSpec) {
    this.compResSpec = paramComputeResourceConfigSpec;
  }
  
  public String getDesiredState() {
    return this.desiredState;
  }
  
  public void setDesiredState(String paramString) {
    this.desiredState = paramString;
  }
}
