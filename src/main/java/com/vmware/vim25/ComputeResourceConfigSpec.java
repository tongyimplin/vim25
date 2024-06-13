package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.ComputeResourceConfigSpec;
import com.vmware.vim25.DesiredSoftwareSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceConfigSpec", propOrder = {"vmSwapPlacement", "spbmEnabled", "defaultHardwareVersionKey", "desiredSoftwareSpec"})
@XmlSeeAlso({ClusterConfigSpecEx.class})
public class ComputeResourceConfigSpec extends DynamicData {
  protected String vmSwapPlacement;
  
  protected Boolean spbmEnabled;
  
  protected String defaultHardwareVersionKey;
  
  protected DesiredSoftwareSpec desiredSoftwareSpec;
  
  public String getVmSwapPlacement() {
    return this.vmSwapPlacement;
  }
  
  public void setVmSwapPlacement(String paramString) {
    this.vmSwapPlacement = paramString;
  }
  
  public Boolean isSpbmEnabled() {
    return this.spbmEnabled;
  }
  
  public void setSpbmEnabled(Boolean paramBoolean) {
    this.spbmEnabled = paramBoolean;
  }
  
  public String getDefaultHardwareVersionKey() {
    return this.defaultHardwareVersionKey;
  }
  
  public void setDefaultHardwareVersionKey(String paramString) {
    this.defaultHardwareVersionKey = paramString;
  }
  
  public DesiredSoftwareSpec getDesiredSoftwareSpec() {
    return this.desiredSoftwareSpec;
  }
  
  public void setDesiredSoftwareSpec(DesiredSoftwareSpec paramDesiredSoftwareSpec) {
    this.desiredSoftwareSpec = paramDesiredSoftwareSpec;
  }
}
