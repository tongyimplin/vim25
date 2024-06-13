package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPciPassthruInfo;
import com.vmware.vim25.HostSriovInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPciPassthruInfo", propOrder = {"id", "dependentDevice", "passthruEnabled", "passthruCapable", "passthruActive"})
@XmlSeeAlso({HostSriovInfo.class})
public class HostPciPassthruInfo extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String dependentDevice;
  
  protected boolean passthruEnabled;
  
  protected boolean passthruCapable;
  
  protected boolean passthruActive;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getDependentDevice() {
    return this.dependentDevice;
  }
  
  public void setDependentDevice(String paramString) {
    this.dependentDevice = paramString;
  }
  
  public boolean isPassthruEnabled() {
    return this.passthruEnabled;
  }
  
  public void setPassthruEnabled(boolean paramBoolean) {
    this.passthruEnabled = paramBoolean;
  }
  
  public boolean isPassthruCapable() {
    return this.passthruCapable;
  }
  
  public void setPassthruCapable(boolean paramBoolean) {
    this.passthruCapable = paramBoolean;
  }
  
  public boolean isPassthruActive() {
    return this.passthruActive;
  }
  
  public void setPassthruActive(boolean paramBoolean) {
    this.passthruActive = paramBoolean;
  }
}
