package com.vmware.vim25;

import com.vmware.vim25.ClusterVmComponentProtectionSettings;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmComponentProtectionSettings", propOrder = {"vmStorageProtectionForAPD", "enableAPDTimeoutForHosts", "vmTerminateDelayForAPDSec", "vmReactionOnAPDCleared", "vmStorageProtectionForPDL"})
public class ClusterVmComponentProtectionSettings extends DynamicData {
  protected String vmStorageProtectionForAPD;
  
  protected Boolean enableAPDTimeoutForHosts;
  
  protected Integer vmTerminateDelayForAPDSec;
  
  protected String vmReactionOnAPDCleared;
  
  protected String vmStorageProtectionForPDL;
  
  public String getVmStorageProtectionForAPD() {
    return this.vmStorageProtectionForAPD;
  }
  
  public void setVmStorageProtectionForAPD(String paramString) {
    this.vmStorageProtectionForAPD = paramString;
  }
  
  public Boolean isEnableAPDTimeoutForHosts() {
    return this.enableAPDTimeoutForHosts;
  }
  
  public void setEnableAPDTimeoutForHosts(Boolean paramBoolean) {
    this.enableAPDTimeoutForHosts = paramBoolean;
  }
  
  public Integer getVmTerminateDelayForAPDSec() {
    return this.vmTerminateDelayForAPDSec;
  }
  
  public void setVmTerminateDelayForAPDSec(Integer paramInteger) {
    this.vmTerminateDelayForAPDSec = paramInteger;
  }
  
  public String getVmReactionOnAPDCleared() {
    return this.vmReactionOnAPDCleared;
  }
  
  public void setVmReactionOnAPDCleared(String paramString) {
    this.vmReactionOnAPDCleared = paramString;
  }
  
  public String getVmStorageProtectionForPDL() {
    return this.vmStorageProtectionForPDL;
  }
  
  public void setVmStorageProtectionForPDL(String paramString) {
    this.vmStorageProtectionForPDL = paramString;
  }
}
