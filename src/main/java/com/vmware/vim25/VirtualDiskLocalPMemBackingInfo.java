package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskLocalPMemBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskLocalPMemBackingInfo", propOrder = {"diskMode", "uuid", "volumeUUID", "contentId"})
public class VirtualDiskLocalPMemBackingInfo extends VirtualDeviceFileBackingInfo {
  @XmlElement(required = true)
  protected String diskMode;
  
  protected String uuid;
  
  protected String volumeUUID;
  
  protected String contentId;
  
  public String getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(String paramString) {
    this.diskMode = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getVolumeUUID() {
    return this.volumeUUID;
  }
  
  public void setVolumeUUID(String paramString) {
    this.volumeUUID = paramString;
  }
  
  public String getContentId() {
    return this.contentId;
  }
  
  public void setContentId(String paramString) {
    this.contentId = paramString;
  }
}
