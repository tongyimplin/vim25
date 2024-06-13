package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFdmHostState;
import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HealthSystemRuntime;
import com.vmware.vim25.HostRuntimeInfo;
import com.vmware.vim25.HostRuntimeInfoNetworkRuntimeInfo;
import com.vmware.vim25.HostSystemConnectionState;
import com.vmware.vim25.HostSystemPowerState;
import com.vmware.vim25.HostTpmDigestInfo;
import com.vmware.vim25.HostVFlashManagerVFlashResourceRunTimeInfo;
import com.vmware.vim25.VsanHostRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfo", propOrder = {"connectionState", "powerState", "standbyMode", "inMaintenanceMode", "inQuarantineMode", "bootTime", "healthSystemRuntime", "dasHostState", "tpmPcrValues", "vsanRuntimeInfo", "networkRuntimeInfo", "vFlashResourceRuntimeInfo", "hostMaxVirtualDiskCapacity", "cryptoState", "cryptoKeyId"})
public class HostRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostSystemConnectionState connectionState;
  
  @XmlElement(required = true)
  protected HostSystemPowerState powerState;
  
  protected String standbyMode;
  
  protected boolean inMaintenanceMode;
  
  protected Boolean inQuarantineMode;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bootTime;
  
  protected HealthSystemRuntime healthSystemRuntime;
  
  protected ClusterDasFdmHostState dasHostState;
  
  protected List<HostTpmDigestInfo> tpmPcrValues;
  
  protected VsanHostRuntimeInfo vsanRuntimeInfo;
  
  protected HostRuntimeInfoNetworkRuntimeInfo networkRuntimeInfo;
  
  protected HostVFlashManagerVFlashResourceRunTimeInfo vFlashResourceRuntimeInfo;
  
  protected Long hostMaxVirtualDiskCapacity;
  
  protected String cryptoState;
  
  protected CryptoKeyId cryptoKeyId;
  
  public HostSystemConnectionState getConnectionState() {
    return this.connectionState;
  }
  
  public void setConnectionState(HostSystemConnectionState paramHostSystemConnectionState) {
    this.connectionState = paramHostSystemConnectionState;
  }
  
  public HostSystemPowerState getPowerState() {
    return this.powerState;
  }
  
  public void setPowerState(HostSystemPowerState paramHostSystemPowerState) {
    this.powerState = paramHostSystemPowerState;
  }
  
  public String getStandbyMode() {
    return this.standbyMode;
  }
  
  public void setStandbyMode(String paramString) {
    this.standbyMode = paramString;
  }
  
  public boolean isInMaintenanceMode() {
    return this.inMaintenanceMode;
  }
  
  public void setInMaintenanceMode(boolean paramBoolean) {
    this.inMaintenanceMode = paramBoolean;
  }
  
  public Boolean isInQuarantineMode() {
    return this.inQuarantineMode;
  }
  
  public void setInQuarantineMode(Boolean paramBoolean) {
    this.inQuarantineMode = paramBoolean;
  }
  
  public XMLGregorianCalendar getBootTime() {
    return this.bootTime;
  }
  
  public void setBootTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.bootTime = paramXMLGregorianCalendar;
  }
  
  public HealthSystemRuntime getHealthSystemRuntime() {
    return this.healthSystemRuntime;
  }
  
  public void setHealthSystemRuntime(HealthSystemRuntime paramHealthSystemRuntime) {
    this.healthSystemRuntime = paramHealthSystemRuntime;
  }
  
  public ClusterDasFdmHostState getDasHostState() {
    return this.dasHostState;
  }
  
  public void setDasHostState(ClusterDasFdmHostState paramClusterDasFdmHostState) {
    this.dasHostState = paramClusterDasFdmHostState;
  }
  
  public List<HostTpmDigestInfo> getTpmPcrValues() {
    if (this.tpmPcrValues == null)
      this.tpmPcrValues = new ArrayList<>(); 
    return this.tpmPcrValues;
  }
  
  public VsanHostRuntimeInfo getVsanRuntimeInfo() {
    return this.vsanRuntimeInfo;
  }
  
  public void setVsanRuntimeInfo(VsanHostRuntimeInfo paramVsanHostRuntimeInfo) {
    this.vsanRuntimeInfo = paramVsanHostRuntimeInfo;
  }
  
  public HostRuntimeInfoNetworkRuntimeInfo getNetworkRuntimeInfo() {
    return this.networkRuntimeInfo;
  }
  
  public void setNetworkRuntimeInfo(HostRuntimeInfoNetworkRuntimeInfo paramHostRuntimeInfoNetworkRuntimeInfo) {
    this.networkRuntimeInfo = paramHostRuntimeInfoNetworkRuntimeInfo;
  }
  
  public HostVFlashManagerVFlashResourceRunTimeInfo getVFlashResourceRuntimeInfo() {
    return this.vFlashResourceRuntimeInfo;
  }
  
  public void setVFlashResourceRuntimeInfo(HostVFlashManagerVFlashResourceRunTimeInfo paramHostVFlashManagerVFlashResourceRunTimeInfo) {
    this.vFlashResourceRuntimeInfo = paramHostVFlashManagerVFlashResourceRunTimeInfo;
  }
  
  public Long getHostMaxVirtualDiskCapacity() {
    return this.hostMaxVirtualDiskCapacity;
  }
  
  public void setHostMaxVirtualDiskCapacity(Long paramLong) {
    this.hostMaxVirtualDiskCapacity = paramLong;
  }
  
  public String getCryptoState() {
    return this.cryptoState;
  }
  
  public void setCryptoState(String paramString) {
    this.cryptoState = paramString;
  }
  
  public CryptoKeyId getCryptoKeyId() {
    return this.cryptoKeyId;
  }
  
  public void setCryptoKeyId(CryptoKeyId paramCryptoKeyId) {
    this.cryptoKeyId = paramCryptoKeyId;
  }
}
