package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDvsProfile;
import com.vmware.vim25.ClusterComputeResourceHCIConfigSpec;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationProfile;
import com.vmware.vim25.ClusterComputeResourceVCProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SDDCBase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHCIConfigSpec", propOrder = {"dvsProf", "hostConfigProfile", "vSanConfigSpec", "vcProf"})
public class ClusterComputeResourceHCIConfigSpec extends DynamicData {
  protected List<ClusterComputeResourceDvsProfile> dvsProf;
  
  protected ClusterComputeResourceHostConfigurationProfile hostConfigProfile;
  
  protected SDDCBase vSanConfigSpec;
  
  protected ClusterComputeResourceVCProfile vcProf;
  
  public List<ClusterComputeResourceDvsProfile> getDvsProf() {
    if (this.dvsProf == null)
      this.dvsProf = new ArrayList<>(); 
    return this.dvsProf;
  }
  
  public ClusterComputeResourceHostConfigurationProfile getHostConfigProfile() {
    return this.hostConfigProfile;
  }
  
  public void setHostConfigProfile(ClusterComputeResourceHostConfigurationProfile paramClusterComputeResourceHostConfigurationProfile) {
    this.hostConfigProfile = paramClusterComputeResourceHostConfigurationProfile;
  }
  
  public SDDCBase getVSanConfigSpec() {
    return this.vSanConfigSpec;
  }
  
  public void setVSanConfigSpec(SDDCBase paramSDDCBase) {
    this.vSanConfigSpec = paramSDDCBase;
  }
  
  public ClusterComputeResourceVCProfile getVcProf() {
    return this.vcProf;
  }
  
  public void setVcProf(ClusterComputeResourceVCProfile paramClusterComputeResourceVCProfile) {
    this.vcProf = paramClusterComputeResourceVCProfile;
  }
}
