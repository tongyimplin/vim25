package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanClusterConfigInfo;
import com.vmware.vim25.VsanClusterConfigInfoHostDefaultInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanClusterConfigInfo", propOrder = {"enabled", "defaultConfig"})
public class VsanClusterConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected VsanClusterConfigInfoHostDefaultInfo defaultConfig;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public VsanClusterConfigInfoHostDefaultInfo getDefaultConfig() {
    return this.defaultConfig;
  }
  
  public void setDefaultConfig(VsanClusterConfigInfoHostDefaultInfo paramVsanClusterConfigInfoHostDefaultInfo) {
    this.defaultConfig = paramVsanClusterConfigInfoHostDefaultInfo;
  }
}
