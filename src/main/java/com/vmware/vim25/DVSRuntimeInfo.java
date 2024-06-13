package com.vmware.vim25;

import com.vmware.vim25.DVSRuntimeInfo;
import com.vmware.vim25.DvsResourceRuntimeInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMemberRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRuntimeInfo", propOrder = {"hostMemberRuntime", "resourceRuntimeInfo"})
public class DVSRuntimeInfo extends DynamicData {
  protected List<HostMemberRuntimeInfo> hostMemberRuntime;
  
  protected DvsResourceRuntimeInfo resourceRuntimeInfo;
  
  public List<HostMemberRuntimeInfo> getHostMemberRuntime() {
    if (this.hostMemberRuntime == null)
      this.hostMemberRuntime = new ArrayList<>(); 
    return this.hostMemberRuntime;
  }
  
  public DvsResourceRuntimeInfo getResourceRuntimeInfo() {
    return this.resourceRuntimeInfo;
  }
  
  public void setResourceRuntimeInfo(DvsResourceRuntimeInfo paramDvsResourceRuntimeInfo) {
    this.resourceRuntimeInfo = paramDvsResourceRuntimeInfo;
  }
}
