package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkResourceRuntime;
import com.vmware.vim25.HostRuntimeInfoNetStackInstanceRuntimeInfo;
import com.vmware.vim25.HostRuntimeInfoNetworkRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfoNetworkRuntimeInfo", propOrder = {"netStackInstanceRuntimeInfo", "networkResourceRuntime"})
public class HostRuntimeInfoNetworkRuntimeInfo extends DynamicData {
  protected List<HostRuntimeInfoNetStackInstanceRuntimeInfo> netStackInstanceRuntimeInfo;
  
  protected HostNetworkResourceRuntime networkResourceRuntime;
  
  public List<HostRuntimeInfoNetStackInstanceRuntimeInfo> getNetStackInstanceRuntimeInfo() {
    if (this.netStackInstanceRuntimeInfo == null)
      this.netStackInstanceRuntimeInfo = new ArrayList<>(); 
    return this.netStackInstanceRuntimeInfo;
  }
  
  public HostNetworkResourceRuntime getNetworkResourceRuntime() {
    return this.networkResourceRuntime;
  }
  
  public void setNetworkResourceRuntime(HostNetworkResourceRuntime paramHostNetworkResourceRuntime) {
    this.networkResourceRuntime = paramHostNetworkResourceRuntime;
  }
}
