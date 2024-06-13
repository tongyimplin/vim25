package com.vmware.vim25;

import com.vmware.vim25.BatchAddStandaloneHostsRequestType;
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
@XmlType(name = "BatchAddStandaloneHostsRequestType", propOrder = {"_this", "newHosts", "compResSpec", "addConnected"})
public class BatchAddStandaloneHostsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<FolderNewHostSpec> newHosts;
  
  protected ComputeResourceConfigSpec compResSpec;
  
  protected boolean addConnected;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<FolderNewHostSpec> getNewHosts() {
    if (this.newHosts == null)
      this.newHosts = new ArrayList<>(); 
    return this.newHosts;
  }
  
  public ComputeResourceConfigSpec getCompResSpec() {
    return this.compResSpec;
  }
  
  public void setCompResSpec(ComputeResourceConfigSpec paramComputeResourceConfigSpec) {
    this.compResSpec = paramComputeResourceConfigSpec;
  }
  
  public boolean isAddConnected() {
    return this.addConnected;
  }
  
  public void setAddConnected(boolean paramBoolean) {
    this.addConnected = paramBoolean;
  }
}
