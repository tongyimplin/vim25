package com.vmware.vim25;

import com.vmware.vim25.ClusterConfigInfoEx;
import com.vmware.vim25.ComputeResourceConfigInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceConfigInfo", propOrder = {"vmSwapPlacement", "spbmEnabled", "defaultHardwareVersionKey"})
@XmlSeeAlso({ClusterConfigInfoEx.class})
public class ComputeResourceConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String vmSwapPlacement;
  
  protected Boolean spbmEnabled;
  
  protected String defaultHardwareVersionKey;
  
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
}
