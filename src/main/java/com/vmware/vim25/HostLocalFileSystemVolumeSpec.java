package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLocalFileSystemVolumeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLocalFileSystemVolumeSpec", propOrder = {"device", "localPath"})
public class HostLocalFileSystemVolumeSpec extends DynamicData {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String localPath;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getLocalPath() {
    return this.localPath;
  }
  
  public void setLocalPath(String paramString) {
    this.localPath = paramString;
  }
}
