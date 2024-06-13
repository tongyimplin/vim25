package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicManagerInfo;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicManagerInfo", propOrder = {"netConfig"})
public class HostVirtualNicManagerInfo extends DynamicData {
  protected List<VirtualNicManagerNetConfig> netConfig;
  
  public List<VirtualNicManagerNetConfig> getNetConfig() {
    if (this.netConfig == null)
      this.netConfig = new ArrayList<>(); 
    return this.netConfig;
  }
}
