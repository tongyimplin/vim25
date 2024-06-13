package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineGuestSummary;
import com.vmware.vim25.VirtualMachineToolsStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestSummary", propOrder = {"guestId", "guestFullName", "toolsStatus", "toolsVersionStatus", "toolsVersionStatus2", "toolsRunningStatus", "hostName", "ipAddress", "hwVersion"})
public class VirtualMachineGuestSummary extends DynamicData {
  protected String guestId;
  
  protected String guestFullName;
  
  protected VirtualMachineToolsStatus toolsStatus;
  
  protected String toolsVersionStatus;
  
  protected String toolsVersionStatus2;
  
  protected String toolsRunningStatus;
  
  protected String hostName;
  
  protected String ipAddress;
  
  protected String hwVersion;
  
  public String getGuestId() {
    return this.guestId;
  }
  
  public void setGuestId(String paramString) {
    this.guestId = paramString;
  }
  
  public String getGuestFullName() {
    return this.guestFullName;
  }
  
  public void setGuestFullName(String paramString) {
    this.guestFullName = paramString;
  }
  
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
  
  public String getHwVersion() {
    return this.hwVersion;
  }
  
  public void setHwVersion(String paramString) {
    this.hwVersion = paramString;
  }
}
