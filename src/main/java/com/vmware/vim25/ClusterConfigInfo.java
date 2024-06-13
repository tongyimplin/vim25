package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigInfo;
import com.vmware.vim25.ClusterDasConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigInfo;
import com.vmware.vim25.ClusterDrsConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigInfo;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigInfo", propOrder = {"dasConfig", "dasVmConfig", "drsConfig", "drsVmConfig", "rule"})
public class ClusterConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ClusterDasConfigInfo dasConfig;
  
  protected List<ClusterDasVmConfigInfo> dasVmConfig;
  
  @XmlElement(required = true)
  protected ClusterDrsConfigInfo drsConfig;
  
  protected List<ClusterDrsVmConfigInfo> drsVmConfig;
  
  protected List<ClusterRuleInfo> rule;
  
  public ClusterDasConfigInfo getDasConfig() {
    return this.dasConfig;
  }
  
  public void setDasConfig(ClusterDasConfigInfo paramClusterDasConfigInfo) {
    this.dasConfig = paramClusterDasConfigInfo;
  }
  
  public List<ClusterDasVmConfigInfo> getDasVmConfig() {
    if (this.dasVmConfig == null)
      this.dasVmConfig = new ArrayList<>(); 
    return this.dasVmConfig;
  }
  
  public ClusterDrsConfigInfo getDrsConfig() {
    return this.drsConfig;
  }
  
  public void setDrsConfig(ClusterDrsConfigInfo paramClusterDrsConfigInfo) {
    this.drsConfig = paramClusterDrsConfigInfo;
  }
  
  public List<ClusterDrsVmConfigInfo> getDrsVmConfig() {
    if (this.drsVmConfig == null)
      this.drsVmConfig = new ArrayList<>(); 
    return this.drsVmConfig;
  }
  
  public List<ClusterRuleInfo> getRule() {
    if (this.rule == null)
      this.rule = new ArrayList<>(); 
    return this.rule;
  }
}
