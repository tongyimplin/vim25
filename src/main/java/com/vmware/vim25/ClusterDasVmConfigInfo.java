package com.vmware.vim25;

import com.vmware.vim25.ClusterDasVmConfigInfo;
import com.vmware.vim25.ClusterDasVmSettings;
import com.vmware.vim25.DasVmPriority;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmConfigInfo", propOrder = {"key", "restartPriority", "powerOffOnIsolation", "dasSettings"})
public class ClusterDasVmConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected DasVmPriority restartPriority;
  
  protected Boolean powerOffOnIsolation;
  
  protected ClusterDasVmSettings dasSettings;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public DasVmPriority getRestartPriority() {
    return this.restartPriority;
  }
  
  public void setRestartPriority(DasVmPriority paramDasVmPriority) {
    this.restartPriority = paramDasVmPriority;
  }
  
  public Boolean isPowerOffOnIsolation() {
    return this.powerOffOnIsolation;
  }
  
  public void setPowerOffOnIsolation(Boolean paramBoolean) {
    this.powerOffOnIsolation = paramBoolean;
  }
  
  public ClusterDasVmSettings getDasSettings() {
    return this.dasSettings;
  }
  
  public void setDasSettings(ClusterDasVmSettings paramClusterDasVmSettings) {
    this.dasSettings = paramClusterDasVmSettings;
  }
}
