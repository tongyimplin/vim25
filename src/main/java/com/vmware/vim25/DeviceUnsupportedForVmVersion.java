package com.vmware.vim25;

import com.vmware.vim25.DeviceUnsupportedForVmVersion;
import com.vmware.vim25.InvalidDeviceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceUnsupportedForVmVersion", propOrder = {"currentVersion", "expectedVersion"})
public class DeviceUnsupportedForVmVersion extends InvalidDeviceSpec {
  @XmlElement(required = true)
  protected String currentVersion;
  
  @XmlElement(required = true)
  protected String expectedVersion;
  
  public String getCurrentVersion() {
    return this.currentVersion;
  }
  
  public void setCurrentVersion(String paramString) {
    this.currentVersion = paramString;
  }
  
  public String getExpectedVersion() {
    return this.expectedVersion;
  }
  
  public void setExpectedVersion(String paramString) {
    this.expectedVersion = paramString;
  }
}
