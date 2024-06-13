package com.vmware.vim25;

import com.vmware.vim25.MismatchedBundle;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedBundle", propOrder = {"bundleUuid", "hostUuid", "bundleBuildNumber", "hostBuildNumber"})
public class MismatchedBundle extends VimFault {
  @XmlElement(required = true)
  protected String bundleUuid;
  
  @XmlElement(required = true)
  protected String hostUuid;
  
  protected int bundleBuildNumber;
  
  protected int hostBuildNumber;
  
  public String getBundleUuid() {
    return this.bundleUuid;
  }
  
  public void setBundleUuid(String paramString) {
    this.bundleUuid = paramString;
  }
  
  public String getHostUuid() {
    return this.hostUuid;
  }
  
  public void setHostUuid(String paramString) {
    this.hostUuid = paramString;
  }
  
  public int getBundleBuildNumber() {
    return this.bundleBuildNumber;
  }
  
  public void setBundleBuildNumber(int paramInt) {
    this.bundleBuildNumber = paramInt;
  }
  
  public int getHostBuildNumber() {
    return this.hostBuildNumber;
  }
  
  public void setHostBuildNumber(int paramInt) {
    this.hostBuildNumber = paramInt;
  }
}
