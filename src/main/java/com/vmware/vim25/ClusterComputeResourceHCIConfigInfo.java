package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDVSSetting;
import com.vmware.vim25.ClusterComputeResourceHCIConfigInfo;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHCIConfigInfo", propOrder = {"workflowState", "dvsSetting", "configuredHosts", "hostConfigProfile"})
public class ClusterComputeResourceHCIConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String workflowState;
  
  protected List<ClusterComputeResourceDVSSetting> dvsSetting;
  
  protected List<ManagedObjectReference> configuredHosts;
  
  protected ClusterComputeResourceHostConfigurationProfile hostConfigProfile;
  
  public String getWorkflowState() {
    return this.workflowState;
  }
  
  public void setWorkflowState(String paramString) {
    this.workflowState = paramString;
  }
  
  public List<ClusterComputeResourceDVSSetting> getDvsSetting() {
    if (this.dvsSetting == null)
      this.dvsSetting = new ArrayList<>(); 
    return this.dvsSetting;
  }
  
  public List<ManagedObjectReference> getConfiguredHosts() {
    if (this.configuredHosts == null)
      this.configuredHosts = new ArrayList<>(); 
    return this.configuredHosts;
  }
  
  public ClusterComputeResourceHostConfigurationProfile getHostConfigProfile() {
    return this.hostConfigProfile;
  }
  
  public void setHostConfigProfile(ClusterComputeResourceHostConfigurationProfile paramClusterComputeResourceHostConfigurationProfile) {
    this.hostConfigProfile = paramClusterComputeResourceHostConfigurationProfile;
  }
}
