package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.HostLowLevelProvisioningManagerVmRecoveryInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerVmRecoveryInfo", propOrder = {"version", "biosUUID", "instanceUUID", "ftInfo"})
public class HostLowLevelProvisioningManagerVmRecoveryInfo extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String biosUUID;
  
  @XmlElement(required = true)
  protected String instanceUUID;
  
  protected FaultToleranceConfigInfo ftInfo;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getBiosUUID() {
    return this.biosUUID;
  }
  
  public void setBiosUUID(String paramString) {
    this.biosUUID = paramString;
  }
  
  public String getInstanceUUID() {
    return this.instanceUUID;
  }
  
  public void setInstanceUUID(String paramString) {
    this.instanceUUID = paramString;
  }
  
  public FaultToleranceConfigInfo getFtInfo() {
    return this.ftInfo;
  }
  
  public void setFtInfo(FaultToleranceConfigInfo paramFaultToleranceConfigInfo) {
    this.ftInfo = paramFaultToleranceConfigInfo;
  }
}
