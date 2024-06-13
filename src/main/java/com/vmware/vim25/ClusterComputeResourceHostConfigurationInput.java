package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ClusterComputeResourceHostVmkNicInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationInput", propOrder = {"host", "hostVmkNics", "allowedInNonMaintenanceMode"})
public class ClusterComputeResourceHostConfigurationInput extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<ClusterComputeResourceHostVmkNicInfo> hostVmkNics;
  
  protected Boolean allowedInNonMaintenanceMode;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<ClusterComputeResourceHostVmkNicInfo> getHostVmkNics() {
    if (this.hostVmkNics == null)
      this.hostVmkNics = new ArrayList<>(); 
    return this.hostVmkNics;
  }
  
  public Boolean isAllowedInNonMaintenanceMode() {
    return this.allowedInNonMaintenanceMode;
  }
  
  public void setAllowedInNonMaintenanceMode(Boolean paramBoolean) {
    this.allowedInNonMaintenanceMode = paramBoolean;
  }
}
