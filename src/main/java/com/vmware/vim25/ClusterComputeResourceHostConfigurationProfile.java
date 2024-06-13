package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHostConfigurationProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.HostLockdownMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationProfile", propOrder = {"dateTimeConfig", "lockdownMode"})
public class ClusterComputeResourceHostConfigurationProfile extends DynamicData {
  protected HostDateTimeConfig dateTimeConfig;
  
  protected HostLockdownMode lockdownMode;
  
  public HostDateTimeConfig getDateTimeConfig() {
    return this.dateTimeConfig;
  }
  
  public void setDateTimeConfig(HostDateTimeConfig paramHostDateTimeConfig) {
    this.dateTimeConfig = paramHostDateTimeConfig;
  }
  
  public HostLockdownMode getLockdownMode() {
    return this.lockdownMode;
  }
  
  public void setLockdownMode(HostLockdownMode paramHostLockdownMode) {
    this.lockdownMode = paramHostLockdownMode;
  }
}
