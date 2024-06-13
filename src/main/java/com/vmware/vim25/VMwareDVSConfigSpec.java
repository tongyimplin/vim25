package com.vmware.vim25;

import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.LinkDiscoveryProtocolConfig;
import com.vmware.vim25.VMwareDVSConfigSpec;
import com.vmware.vim25.VMwareDVSPvlanConfigSpec;
import com.vmware.vim25.VMwareDVSVspanConfigSpec;
import com.vmware.vim25.VMwareIpfixConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSConfigSpec", propOrder = {"pvlanConfigSpec", "vspanConfigSpec", "maxMtu", "linkDiscoveryProtocolConfig", "ipfixConfig", "lacpApiVersion", "multicastFilteringMode"})
public class VMwareDVSConfigSpec extends DVSConfigSpec {
  protected List<VMwareDVSPvlanConfigSpec> pvlanConfigSpec;
  
  protected List<VMwareDVSVspanConfigSpec> vspanConfigSpec;
  
  protected Integer maxMtu;
  
  protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
  
  protected VMwareIpfixConfig ipfixConfig;
  
  protected String lacpApiVersion;
  
  protected String multicastFilteringMode;
  
  public List<VMwareDVSPvlanConfigSpec> getPvlanConfigSpec() {
    if (this.pvlanConfigSpec == null)
      this.pvlanConfigSpec = new ArrayList<>(); 
    return this.pvlanConfigSpec;
  }
  
  public List<VMwareDVSVspanConfigSpec> getVspanConfigSpec() {
    if (this.vspanConfigSpec == null)
      this.vspanConfigSpec = new ArrayList<>(); 
    return this.vspanConfigSpec;
  }
  
  public Integer getMaxMtu() {
    return this.maxMtu;
  }
  
  public void setMaxMtu(Integer paramInteger) {
    this.maxMtu = paramInteger;
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
