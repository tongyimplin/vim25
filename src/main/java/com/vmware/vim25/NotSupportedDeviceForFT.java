package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotSupportedDeviceForFT;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedDeviceForFT", propOrder = {"host", "hostName", "vm", "vmName", "deviceType", "deviceLabel"})
public class NotSupportedDeviceForFT extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected String hostName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected String vmName;
  
  @XmlElement(required = true)
  protected String deviceType;
  
  protected String deviceLabel;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public String getDeviceType() {
    return this.deviceType;
  }
  
  public void setDeviceType(String paramString) {
    this.deviceType = paramString;
  }
  
  public String getDeviceLabel() {
    return this.deviceLabel;
  }
  
  public void setDeviceLabel(String paramString) {
    this.deviceLabel = paramString;
  }
}
