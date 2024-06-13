package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostVMotionInfo;
import com.vmware.vim25.HostVMotionNetConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionInfo", propOrder = {"netConfig", "ipConfig"})
public class HostVMotionInfo extends DynamicData {
  protected HostVMotionNetConfig netConfig;
  
  protected HostIpConfig ipConfig;
  
  public HostVMotionNetConfig getNetConfig() {
    return this.netConfig;
  }
  
  public void setNetConfig(HostVMotionNetConfig paramHostVMotionNetConfig) {
    this.netConfig = paramHostVMotionNetConfig;
  }
  
  public HostIpConfig getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(HostIpConfig paramHostIpConfig) {
    this.ipConfig = paramHostIpConfig;
  }
}
