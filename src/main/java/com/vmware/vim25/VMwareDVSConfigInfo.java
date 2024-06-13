package com.vmware.vim25;

import com.vmware.vim25.DVSConfigInfo;
import com.vmware.vim25.LinkDiscoveryProtocolConfig;
import com.vmware.vim25.VMwareDVSConfigInfo;
import com.vmware.vim25.VMwareDVSPvlanMapEntry;
import com.vmware.vim25.VMwareDvsLacpGroupConfig;
import com.vmware.vim25.VMwareIpfixConfig;
import com.vmware.vim25.VMwareVspanSession;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSConfigInfo", propOrder = {"vspanSession", "pvlanConfig", "maxMtu", "linkDiscoveryProtocolConfig", "ipfixConfig", "lacpGroupConfig", "lacpApiVersion", "multicastFilteringMode"})
public class VMwareDVSConfigInfo extends DVSConfigInfo {
  protected List<VMwareVspanSession> vspanSession;
  
  protected List<VMwareDVSPvlanMapEntry> pvlanConfig;
  
  protected int maxMtu;
  
  protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
  
  protected VMwareIpfixConfig ipfixConfig;
  
  protected List<VMwareDvsLacpGroupConfig> lacpGroupConfig;
  
  protected String lacpApiVersion;
  
  protected String multicastFilteringMode;
  
  public List<VMwareVspanSession> getVspanSession() {
    if (this.vspanSession == null)
      this.vspanSession = new ArrayList<>(); 
    return this.vspanSession;
  }
  
  public List<VMwareDVSPvlanMapEntry> getPvlanConfig() {
    if (this.pvlanConfig == null)
      this.pvlanConfig = new ArrayList<>(); 
    return this.pvlanConfig;
  }
  
  public int getMaxMtu() {
    return this.maxMtu;
  }
  
  public void setMaxMtu(int paramInt) {
    this.maxMtu = paramInt;
  }
  
  public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
    return this.linkDiscoveryProtocolConfig;
  }
  
  public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig paramLinkDiscoveryProtocolConfig) {
    this.linkDiscoveryProtocolConfig = paramLinkDiscoveryProtocolConfig;
  }
  
  public VMwareIpfixConfig getIpfixConfig() {
    return this.ipfixConfig;
  }
  
  public void setIpfixConfig(VMwareIpfixConfig paramVMwareIpfixConfig) {
    this.ipfixConfig = paramVMwareIpfixConfig;
  }
  
  public List<VMwareDvsLacpGroupConfig> getLacpGroupConfig() {
    if (this.lacpGroupConfig == null)
      this.lacpGroupConfig = new ArrayList<>(); 
    return this.lacpGroupConfig;
  }
  
  public String getLacpApiVersion() {
    return this.lacpApiVersion;
  }
  
  public void setLacpApiVersion(String paramString) {
    this.lacpApiVersion = paramString;
  }
  
  public String getMulticastFilteringMode() {
    return this.multicastFilteringMode;
  }
  
  public void setMulticastFilteringMode(String paramString) {
    this.multicastFilteringMode = paramString;
  }
}
