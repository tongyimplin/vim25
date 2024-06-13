package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestDiskInfo;
import com.vmware.vim25.GuestInfo;
import com.vmware.vim25.GuestInfoNamespaceGenerationInfo;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.GuestScreenInfo;
import com.vmware.vim25.GuestStackInfo;
import com.vmware.vim25.VirtualMachineToolsStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfo", propOrder = {"toolsStatus", "toolsVersionStatus", "toolsVersionStatus2", "toolsRunningStatus", "toolsVersion", "toolsInstallType", "guestId", "guestFamily", "guestFullName", "hostName", "ipAddress", "net", "ipStack", "disk", "screen", "guestState", "appHeartbeatStatus", "guestKernelCrashed", "appState", "guestOperationsReady", "interactiveGuestOperationsReady", "guestStateChangeSupported", "generationInfo", "hwVersion"})
public class GuestInfo extends DynamicData {
  protected VirtualMachineToolsStatus toolsStatus;
  
  protected String toolsVersionStatus;
  
  protected String toolsVersionStatus2;
  
  protected String toolsRunningStatus;
  
  protected String toolsVersion;
  
  protected String toolsInstallType;
  
  protected String guestId;
  
  protected String guestFamily;
  
  protected String guestFullName;
  
  protected String hostName;
  
  protected String ipAddress;
  
  protected List<GuestNicInfo> net;
  
  protected List<GuestStackInfo> ipStack;
  
  protected List<GuestDiskInfo> disk;
  
  protected GuestScreenInfo screen;
  
  @XmlElement(required = true)
  protected String guestState;
  
  protected String appHeartbeatStatus;
  
  protected Boolean guestKernelCrashed;
  
  protected String appState;
  
  protected Boolean guestOperationsReady;
  
  protected Boolean interactiveGuestOperationsReady;
  
  protected Boolean guestStateChangeSupported;
  
  protected List<GuestInfoNamespaceGenerationInfo> generationInfo;
  
  protected String hwVersion;
  
  public VirtualMachineToolsStatus getToolsStatus() {
    return this.toolsStatus;
  }
  
  public void setToolsStatus(VirtualMachineToolsStatus paramVirtualMachineToolsStatus) {
    this.toolsStatus = paramVirtualMachineToolsStatus;
  }
  
  public String getToolsVersionStatus() {
    return this.toolsVersionStatus;
  }
  
  public void setToolsVersionStatus(String paramString) {
    this.toolsVersionStatus = paramString;
  }
  
  public String getToolsVersionStatus2() {
    return this.toolsVersionStatus2;
  }
  
  public void setToolsVersionStatus2(String paramString) {
    this.toolsVersionStatus2 = paramString;
  }
  
  public String getToolsRunningStatus() {
    return this.toolsRunningStatus;
  }
  
  public void setToolsRunningStatus(String paramString) {
    this.toolsRunningStatus = paramString;
  }
  
  public String getToolsVersion() {
    return this.toolsVersion;
  }
  
  public void setToolsVersion(String paramString) {
    this.toolsVersion = paramString;
  }
  
  public String getToolsInstallType() {
    return this.toolsInstallType;
  }
  
  public void setToolsInstallType(String paramString) {
    this.toolsInstallType = paramString;
  }
  
  public String getGuestId() {
    return this.guestId;
  }
  
  public void setGuestId(String paramString) {
    this.guestId = paramString;
  }
  
  public String getGuestFamily() {
    return this.guestFamily;
  }
  
  public void setGuestFamily(String paramString) {
    this.guestFamily = paramString;
  }
  
  public String getGuestFullName() {
    return this.guestFullName;
  }
  
  public void setGuestFullName(String paramString) {
    this.guestFullName = paramString;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public List<GuestNicInfo> getNet() {
    if (this.net == null)
      this.net = new ArrayList<>(); 
    return this.net;
  }
  
  public List<GuestStackInfo> getIpStack() {
    if (this.ipStack == null)
      this.ipStack = new ArrayList<>(); 
    return this.ipStack;
  }
  
  public List<GuestDiskInfo> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public GuestScreenInfo getScreen() {
    return this.screen;
  }
  
  public void setScreen(GuestScreenInfo paramGuestScreenInfo) {
    this.screen = paramGuestScreenInfo;
  }
  
  public String getGuestState() {
    return this.guestState;
  }
  
  public void setGuestState(String paramString) {
    this.guestState = paramString;
  }
  
  public String getAppHeartbeatStatus() {
    return this.appHeartbeatStatus;
  }
  
  public void setAppHeartbeatStatus(String paramString) {
    this.appHeartbeatStatus = paramString;
  }
  
  public Boolean isGuestKernelCrashed() {
    return this.guestKernelCrashed;
  }
  
  public void setGuestKernelCrashed(Boolean paramBoolean) {
    this.guestKernelCrashed = paramBoolean;
  }
  
  public String getAppState() {
    return this.appState;
  }
  
  public void setAppState(String paramString) {
    this.appState = paramString;
  }
  
  public Boolean isGuestOperationsReady() {
    return this.guestOperationsReady;
  }
  
  public void setGuestOperationsReady(Boolean paramBoolean) {
    this.guestOperationsReady = paramBoolean;
  }
  
  public Boolean isInteractiveGuestOperationsReady() {
    return this.interactiveGuestOperationsReady;
  }
  
  public void setInteractiveGuestOperationsReady(Boolean paramBoolean) {
    this.interactiveGuestOperationsReady = paramBoolean;
  }
  
  public Boolean isGuestStateChangeSupported() {
    return this.guestStateChangeSupported;
  }
  
  public void setGuestStateChangeSupported(Boolean paramBoolean) {
    this.guestStateChangeSupported = paramBoolean;
  }
  
  public List<GuestInfoNamespaceGenerationInfo> getGenerationInfo() {
    if (this.generationInfo == null)
      this.generationInfo = new ArrayList<>(); 
    return this.generationInfo;
  }
  
  public String getHwVersion() {
    return this.hwVersion;
  }
  
  public void setHwVersion(String paramString) {
    this.hwVersion = paramString;
  }
}
