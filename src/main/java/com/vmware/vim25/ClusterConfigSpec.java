package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpec;
import com.vmware.vim25.ClusterDasConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigSpec;
import com.vmware.vim25.ClusterDrsConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigSpec;
import com.vmware.vim25.ClusterRuleSpec;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigSpec", propOrder = {"dasConfig", "dasVmConfigSpec", "drsConfig", "drsVmConfigSpec", "rulesSpec"})
public class ClusterConfigSpec extends DynamicData {
  protected ClusterDasConfigInfo dasConfig;
  
  protected List<ClusterDasVmConfigSpec> dasVmConfigSpec;
  
  protected ClusterDrsConfigInfo drsConfig;
  
  protected List<ClusterDrsVmConfigSpec> drsVmConfigSpec;
  
  protected List<ClusterRuleSpec> rulesSpec;
  
  public ClusterDasConfigInfo getDasConfig() {
    return this.dasConfig;
  }
  
  public void setDasConfig(ClusterDasConfigInfo paramClusterDasConfigInfo) {
    this.dasConfig = paramClusterDasConfigInfo;
  }
  
  public List<ClusterDasVmConfigSpec> getDasVmConfigSpec() {
    if (this.dasVmConfigSpec == null)
      this.dasVmConfigSpec = new ArrayList<>(); 
    return this.dasVmConfigSpec;
  }
  
  public ClusterDrsConfigInfo getDrsConfig() {
    return this.drsConfig;
  }
  
  public void setDrsConfig(ClusterDrsConfigInfo paramClusterDrsConfigInfo) {
    this.drsConfig = paramClusterDrsConfigInfo;
  }
  
  public List<ClusterDrsVmConfigSpec> getDrsVmConfigSpec() {
    if (this.drsVmConfigSpec == null)
      this.drsVmConfigSpec = new ArrayList<>(); 
    return this.drsVmConfigSpec;
  }
  
  public List<ClusterRuleSpec> getRulesSpec() {
    if (this.rulesSpec == null)
      this.rulesSpec = new ArrayList<>(); 
    return this.rulesSpec;
  }
}
