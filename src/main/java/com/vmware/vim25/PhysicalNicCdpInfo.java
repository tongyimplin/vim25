package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PhysicalNicCdpDeviceCapability;
import com.vmware.vim25.PhysicalNicCdpInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicCdpInfo", propOrder = {"cdpVersion", "timeout", "ttl", "samples", "devId", "address", "portId", "deviceCapability", "softwareVersion", "hardwarePlatform", "ipPrefix", "ipPrefixLen", "vlan", "fullDuplex", "mtu", "systemName", "systemOID", "mgmtAddr", "location"})
public class PhysicalNicCdpInfo extends DynamicData {
  protected Integer cdpVersion;
  
  protected Integer timeout;
  
  protected Integer ttl;
  
  protected Integer samples;
  
  protected String devId;
  
  protected String address;
  
  protected String portId;
  
  protected PhysicalNicCdpDeviceCapability deviceCapability;
  
  protected String softwareVersion;
  
  protected String hardwarePlatform;
  
  protected String ipPrefix;
  
  protected Integer ipPrefixLen;
  
  protected Integer vlan;
  
  protected Boolean fullDuplex;
  
  protected Integer mtu;
  
  protected String systemName;
  
  protected String systemOID;
  
  protected String mgmtAddr;
  
  protected String location;
  
  public Integer getCdpVersion() {
    return this.cdpVersion;
  }
  
  public void setCdpVersion(Integer paramInteger) {
    this.cdpVersion = paramInteger;
  }
  
  public Integer getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(Integer paramInteger) {
    this.timeout = paramInteger;
  }
  
  public Integer getTtl() {
    return this.ttl;
  }
  
  public void setTtl(Integer paramInteger) {
    this.ttl = paramInteger;
  }
  
  public Integer getSamples() {
    return this.samples;
  }
  
  public void setSamples(Integer paramInteger) {
    this.samples = paramInteger;
  }
  
  public String getDevId() {
    return this.devId;
  }
  
  public void setDevId(String paramString) {
    this.devId = paramString;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public String getPortId() {
    return this.portId;
  }
  
  public void setPortId(String paramString) {
    this.portId = paramString;
  }
  
  public PhysicalNicCdpDeviceCapability getDeviceCapability() {
    return this.deviceCapability;
  }
  
  public void setDeviceCapability(PhysicalNicCdpDeviceCapability paramPhysicalNicCdpDeviceCapability) {
    this.deviceCapability = paramPhysicalNicCdpDeviceCapability;
  }
  
  public String getSoftwareVersion() {
    return this.softwareVersion;
  }
  
  public void setSoftwareVersion(String paramString) {
    this.softwareVersion = paramString;
  }
  
  public String getHardwarePlatform() {
    return this.hardwarePlatform;
  }
  
  public void setHardwarePlatform(String paramString) {
    this.hardwarePlatform = paramString;
  }
  
  public String getIpPrefix() {
    return this.ipPrefix;
  }
  
  public void setIpPrefix(String paramString) {
    this.ipPrefix = paramString;
  }
  
  public Integer getIpPrefixLen() {
    return this.ipPrefixLen;
  }
  
  public void setIpPrefixLen(Integer paramInteger) {
    this.ipPrefixLen = paramInteger;
  }
  
  public Integer getVlan() {
    return this.vlan;
  }
  
  public void setVlan(Integer paramInteger) {
    this.vlan = paramInteger;
  }
  
  public Boolean isFullDuplex() {
    return this.fullDuplex;
  }
  
  public void setFullDuplex(Boolean paramBoolean) {
    this.fullDuplex = paramBoolean;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public String getSystemName() {
    return this.systemName;
  }
  
  public void setSystemName(String paramString) {
    this.systemName = paramString;
  }
  
  public String getSystemOID() {
    return this.systemOID;
  }
  
  public void setSystemOID(String paramString) {
    this.systemOID = paramString;
  }
  
  public String getMgmtAddr() {
    return this.mgmtAddr;
  }
  
  public void setMgmtAddr(String paramString) {
    this.mgmtAddr = paramString;
  }
  
  public String getLocation() {
    return this.location;
  }
  
  public void setLocation(String paramString) {
    this.location = paramString;
  }
}
