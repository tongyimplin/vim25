package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.NetBIOSConfigInfo;
import com.vmware.vim25.NetDnsConfigInfo;
import com.vmware.vim25.NetIpConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestNicInfo", propOrder = {"network", "ipAddress", "macAddress", "connected", "deviceConfigId", "dnsConfig", "ipConfig", "netBIOSConfig"})
public class GuestNicInfo extends DynamicData {
  protected String network;
  
  protected List<String> ipAddress;
  
  protected String macAddress;
  
  protected boolean connected;
  
  protected int deviceConfigId;
  
  protected NetDnsConfigInfo dnsConfig;
  
  protected NetIpConfigInfo ipConfig;
  
  protected NetBIOSConfigInfo netBIOSConfig;
  
  public String getNetwork() {
    return this.network;
  }
  
  public void setNetwork(String paramString) {
    this.network = paramString;
  }
  
  public List<String> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
  
  public String getMacAddress() {
    return this.macAddress;
  }
  
  public void setMacAddress(String paramString) {
    this.macAddress = paramString;
  }
  
  public boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(boolean paramBoolean) {
    this.connected = paramBoolean;
  }
  
  public int getDeviceConfigId() {
    return this.deviceConfigId;
  }
  
  public void setDeviceConfigId(int paramInt) {
    this.deviceConfigId = paramInt;
  }
  
  public NetDnsConfigInfo getDnsConfig() {
    return this.dnsConfig;
  }
  
  public void setDnsConfig(NetDnsConfigInfo paramNetDnsConfigInfo) {
    this.dnsConfig = paramNetDnsConfigInfo;
  }
  
  public NetIpConfigInfo getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(NetIpConfigInfo paramNetIpConfigInfo) {
    this.ipConfig = paramNetIpConfigInfo;
  }
  
  public NetBIOSConfigInfo getNetBIOSConfig() {
    return this.netBIOSConfig;
  }
  
  public void setNetBIOSConfig(NetBIOSConfigInfo paramNetBIOSConfigInfo) {
    this.netBIOSConfig = paramNetBIOSConfigInfo;
  }
}
