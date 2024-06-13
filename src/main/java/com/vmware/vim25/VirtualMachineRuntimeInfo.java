package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFeatureMask;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineConnectionState;
import com.vmware.vim25.VirtualMachineDeviceRuntimeInfo;
import com.vmware.vim25.VirtualMachineFaultToleranceState;
import com.vmware.vim25.VirtualMachineFeatureRequirement;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineQuestionInfo;
import com.vmware.vim25.VirtualMachineRecordReplayState;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.VirtualMachineRuntimeInfoDasProtectionState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRuntimeInfo", propOrder = {"device", "host", "connectionState", "powerState", "faultToleranceState", "dasVmProtection", "toolsInstallerMounted", "suspendTime", "bootTime", "suspendInterval", "question", "memoryOverhead", "maxCpuUsage", "maxMemoryUsage", "numMksConnections", "recordReplayState", "cleanPowerOff", "needSecondaryReason", "onlineStandby", "minRequiredEVCModeKey", "consolidationNeeded", "offlineFeatureRequirement", "featureRequirement", "featureMask", "vFlashCacheAllocation", "paused", "snapshotInBackground", "quiescedForkParent", "instantCloneFrozen", "cryptoState"})
public class VirtualMachineRuntimeInfo extends DynamicData {
  protected List<VirtualMachineDeviceRuntimeInfo> device;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected VirtualMachineConnectionState connectionState;
  
  @XmlElement(required = true)
  protected VirtualMachinePowerState powerState;
  
  protected VirtualMachineFaultToleranceState faultToleranceState;
  
  protected VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
  
  protected boolean toolsInstallerMounted;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar suspendTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bootTime;
  
  protected Long suspendInterval;
  
  protected VirtualMachineQuestionInfo question;
  
  protected Long memoryOverhead;
  
  protected Integer maxCpuUsage;
  
  protected Integer maxMemoryUsage;
  
  protected int numMksConnections;
  
  protected VirtualMachineRecordReplayState recordReplayState;
  
  protected Boolean cleanPowerOff;
  
  protected String needSecondaryReason;
  
  protected Boolean onlineStandby;
  
  protected String minRequiredEVCModeKey;
  
  protected Boolean consolidationNeeded;
  
  protected List<VirtualMachineFeatureRequirement> offlineFeatureRequirement;
  
  protected List<VirtualMachineFeatureRequirement> featureRequirement;
  
  protected List<HostFeatureMask> featureMask;
  
  protected Long vFlashCacheAllocation;
  
  protected Boolean paused;
  
  protected Boolean snapshotInBackground;
  
  protected Boolean quiescedForkParent;
  
  protected Boolean instantCloneFrozen;
  
  protected String cryptoState;
  
  public List<VirtualMachineDeviceRuntimeInfo> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public VirtualMachineConnectionState getConnectionState() {
    return this.connectionState;
  }
  
  public void setConnectionState(VirtualMachineConnectionState paramVirtualMachineConnectionState) {
    this.connectionState = paramVirtualMachineConnectionState;
  }
  
  public VirtualMachinePowerState getPowerState() {
    return this.powerState;
  }
  
  public void setPowerState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.powerState = paramVirtualMachinePowerState;
  }
  
  public VirtualMachineFaultToleranceState getFaultToleranceState() {
    return this.faultToleranceState;
  }
  
  public void setFaultToleranceState(VirtualMachineFaultToleranceState paramVirtualMachineFaultToleranceState) {
    this.faultToleranceState = paramVirtualMachineFaultToleranceState;
  }
  
  public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
    return this.dasVmProtection;
  }
  
  public void setDasVmProtection(VirtualMachineRuntimeInfoDasProtectionState paramVirtualMachineRuntimeInfoDasProtectionState) {
    this.dasVmProtection = paramVirtualMachineRuntimeInfoDasProtectionState;
  }
  
  public boolean isToolsInstallerMounted() {
    return this.toolsInstallerMounted;
  }
  
  public void setToolsInstallerMounted(boolean paramBoolean) {
    this.toolsInstallerMounted = paramBoolean;
  }
  
  public XMLGregorianCalendar getSuspendTime() {
    return this.suspendTime;
  }
  
  public void setSuspendTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.suspendTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getBootTime() {
    return this.bootTime;
  }
  
  public void setBootTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.bootTime = paramXMLGregorianCalendar;
  }
  
  public Long getSuspendInterval() {
    return this.suspendInterval;
  }
  
  public void setSuspendInterval(Long paramLong) {
    this.suspendInterval = paramLong;
  }
  
  public VirtualMachineQuestionInfo getQuestion() {
    return this.question;
  }
  
  public void setQuestion(VirtualMachineQuestionInfo paramVirtualMachineQuestionInfo) {
    this.question = paramVirtualMachineQuestionInfo;
  }
  
  public Long getMemoryOverhead() {
    return this.memoryOverhead;
  }
  
  public void setMemoryOverhead(Long paramLong) {
    this.memoryOverhead = paramLong;
  }
  
  public Integer getMaxCpuUsage() {
    return this.maxCpuUsage;
  }
  
  public void setMaxCpuUsage(Integer paramInteger) {
    this.maxCpuUsage = paramInteger;
  }
  
  public Integer getMaxMemoryUsage() {
    return this.maxMemoryUsage;
  }
  
  public void setMaxMemoryUsage(Integer paramInteger) {
    this.maxMemoryUsage = paramInteger;
  }
  
  public int getNumMksConnections() {
    return this.numMksConnections;
  }
  
  public void setNumMksConnections(int paramInt) {
    this.numMksConnections = paramInt;
  }
  
  public VirtualMachineRecordReplayState getRecordReplayState() {
    return this.recordReplayState;
  }
  
  public void setRecordReplayState(VirtualMachineRecordReplayState paramVirtualMachineRecordReplayState) {
    this.recordReplayState = paramVirtualMachineRecordReplayState;
  }
  
  public Boolean isCleanPowerOff() {
    return this.cleanPowerOff;
  }
  
  public void setCleanPowerOff(Boolean paramBoolean) {
    this.cleanPowerOff = paramBoolean;
  }
  
  public String getNeedSecondaryReason() {
    return this.needSecondaryReason;
  }
  
  public void setNeedSecondaryReason(String paramString) {
    this.needSecondaryReason = paramString;
  }
  
  public Boolean isOnlineStandby() {
    return this.onlineStandby;
  }
  
  public void setOnlineStandby(Boolean paramBoolean) {
    this.onlineStandby = paramBoolean;
  }
  
  public String getMinRequiredEVCModeKey() {
    return this.minRequiredEVCModeKey;
  }
  
  public void setMinRequiredEVCModeKey(String paramString) {
    this.minRequiredEVCModeKey = paramString;
  }
  
  public Boolean isConsolidationNeeded() {
    return this.consolidationNeeded;
  }
  
  public void setConsolidationNeeded(Boolean paramBoolean) {
    this.consolidationNeeded = paramBoolean;
  }
  
  public List<VirtualMachineFeatureRequirement> getOfflineFeatureRequirement() {
    if (this.offlineFeatureRequirement == null)
      this.offlineFeatureRequirement = new ArrayList<>(); 
    return this.offlineFeatureRequirement;
  }
  
  public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
    if (this.featureRequirement == null)
      this.featureRequirement = new ArrayList<>(); 
    return this.featureRequirement;
  }
  
  public List<HostFeatureMask> getFeatureMask() {
    if (this.featureMask == null)
      this.featureMask = new ArrayList<>(); 
    return this.featureMask;
  }
  
  public Long getVFlashCacheAllocation() {
    return this.vFlashCacheAllocation;
  }
  
  public void setVFlashCacheAllocation(Long paramLong) {
    this.vFlashCacheAllocation = paramLong;
  }
  
  public Boolean isPaused() {
    return this.paused;
  }
  
  public void setPaused(Boolean paramBoolean) {
    this.paused = paramBoolean;
  }
  
  public Boolean isSnapshotInBackground() {
    return this.snapshotInBackground;
  }
  
  public void setSnapshotInBackground(Boolean paramBoolean) {
    this.snapshotInBackground = paramBoolean;
  }
  
  public Boolean isQuiescedForkParent() {
    return this.quiescedForkParent;
  }
  
  public void setQuiescedForkParent(Boolean paramBoolean) {
    this.quiescedForkParent = paramBoolean;
  }
  
  public Boolean isInstantCloneFrozen() {
    return this.instantCloneFrozen;
  }
  
  public void setInstantCloneFrozen(Boolean paramBoolean) {
    this.instantCloneFrozen = paramBoolean;
  }
  
  public String getCryptoState() {
    return this.cryptoState;
  }
  
  public void setCryptoState(String paramString) {
    this.cryptoState = paramString;
  }
}
