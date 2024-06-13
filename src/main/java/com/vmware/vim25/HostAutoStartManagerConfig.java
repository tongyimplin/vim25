package com.vmware.vim25;

import com.vmware.vim25.AutoStartDefaults;
import com.vmware.vim25.AutoStartPowerInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAutoStartManagerConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAutoStartManagerConfig", propOrder = {"defaults", "powerInfo"})
public class HostAutoStartManagerConfig extends DynamicData {
  protected AutoStartDefaults defaults;
  
  protected List<AutoStartPowerInfo> powerInfo;
  
  public AutoStartDefaults getDefaults() {
    return this.defaults;
  }
  
  public void setDefaults(AutoStartDefaults paramAutoStartDefaults) {
    this.defaults = paramAutoStartDefaults;
  }
  
  public List<AutoStartPowerInfo> getPowerInfo() {
    if (this.powerInfo == null)
      this.powerInfo = new ArrayList<>(); 
    return this.powerInfo;
  }
}
