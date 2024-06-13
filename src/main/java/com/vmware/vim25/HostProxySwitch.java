package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberTransportZoneInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProxySwitch;
import com.vmware.vim25.HostProxySwitchHostLagConfig;
import com.vmware.vim25.HostProxySwitchSpec;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitch", propOrder = {"dvsUuid", "dvsName", "key", "numPorts", "configNumPorts", "numPortsAvailable", "uplinkPort", "mtu", "pnic", "spec", "hostLag", "networkReservationSupported", "nsxtEnabled", "ensEnabled", "ensInterruptEnabled", "transportZones", "nsxUsedUplinkPort", "nsxtStatus", "nsxtStatusDetail"})
public class HostProxySwitch extends DynamicData {
  @XmlElement(required = true)
  protected String dvsUuid;
  
  @XmlElement(required = true)
  protected String dvsName;
  
  @XmlElement(required = true)
  protected String key;
  
  protected int numPorts;
  
  protected Integer configNumPorts;
  
  protected int numPortsAvailable;
  
  protected List<KeyValue> uplinkPort;
  
  protected Integer mtu;
  
  protected List<String> pnic;
  
  @XmlElement(required = true)
  protected HostProxySwitchSpec spec;
  
  protected List<HostProxySwitchHostLagConfig> hostLag;
  
  protected Boolean networkReservationSupported;
  
  protected Boolean nsxtEnabled;
  
  protected Boolean ensEnabled;
  
  protected Boolean ensInterruptEnabled;
  
  protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones;
  
  protected List<String> nsxUsedUplinkPort;
  
  protected String nsxtStatus;
  
  protected String nsxtStatusDetail;
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
  
  public String getDvsName() {
    return this.dvsName;
  }
  
  public void setDvsName(String paramString) {
    this.dvsName = paramString;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public Integer getConfigNumPorts() {
    return this.configNumPorts;
  }
  
  public void setConfigNumPorts(Integer paramInteger) {
    this.configNumPorts = paramInteger;
  }
  
  public int getNumPortsAvailable() {
    return this.numPortsAvailable;
  }
  
  public void setNumPortsAvailable(int paramInt) {
    this.numPortsAvailable = paramInt;
  }
  
  public List<KeyValue> getUplinkPort() {
    if (this.uplinkPort == null)
      this.uplinkPort = new ArrayList<>(); 
    return this.uplinkPort;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public List<String> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public HostProxySwitchSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostProxySwitchSpec paramHostProxySwitchSpec) {
    this.spec = paramHostProxySwitchSpec;
  }
  
  public List<HostProxySwitchHostLagConfig> getHostLag() {
    if (this.hostLag == null)
      this.hostLag = new ArrayList<>(); 
    return this.hostLag;
  }
  
  public Boolean isNetworkReservationSupported() {
    return this.networkReservationSupported;
  }
  
  public void setNetworkReservationSupported(Boolean paramBoolean) {
    this.networkReservationSupported = paramBoolean;
  }
  
  public Boolean isNsxtEnabled() {
    return this.nsxtEnabled;
  }
  
  public void setNsxtEnabled(Boolean paramBoolean) {
    this.nsxtEnabled = paramBoolean;
  }
  
  public Boolean isEnsEnabled() {
    return this.ensEnabled;
  }
  
  public void setEnsEnabled(Boolean paramBoolean) {
    this.ensEnabled = paramBoolean;
  }
  
  public Boolean isEnsInterruptEnabled() {
    return this.ensInterruptEnabled;
  }
  
  public void setEnsInterruptEnabled(Boolean paramBoolean) {
    this.ensInterruptEnabled = paramBoolean;
  }
  
  public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
    if (this.transportZones == null)
      this.transportZones = new ArrayList<>(); 
    return this.transportZones;
  }
  
  public List<String> getNsxUsedUplinkPort() {
    if (this.nsxUsedUplinkPort == null)
      this.nsxUsedUplinkPort = new ArrayList<>(); 
    return this.nsxUsedUplinkPort;
  }
  
  public String getNsxtStatus() {
    return this.nsxtStatus;
  }
  
  public void setNsxtStatus(String paramString) {
    this.nsxtStatus = paramString;
  }
  
  public String getNsxtStatusDetail() {
    return this.nsxtStatusDetail;
  }
  
  public void setNsxtStatusDetail(String paramString) {
    this.nsxtStatusDetail = paramString;
  }
}
