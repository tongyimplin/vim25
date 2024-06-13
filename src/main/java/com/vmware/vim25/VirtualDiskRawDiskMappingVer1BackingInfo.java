package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskMappingVer1BackingInfo", propOrder = {"lunUuid", "deviceName", "compatibilityMode", "diskMode", "uuid", "contentId", "changeId", "parent", "deltaDiskFormat", "deltaGrainSize", "sharing"})
public class VirtualDiskRawDiskMappingVer1BackingInfo extends VirtualDeviceFileBackingInfo {
  protected String lunUuid;
  
  protected String deviceName;
  
  protected String compatibilityMode;
  
  protected String diskMode;
  
  protected String uuid;
  
  protected String contentId;
  
  protected String changeId;
  
  protected VirtualDiskRawDiskMappingVer1BackingInfo parent;
  
  protected String deltaDiskFormat;
  
  protected Integer deltaGrainSize;
  
  protected String sharing;
  
  public String getLunUuid() {
    return this.lunUuid;
  }
  
  public void setLunUuid(String paramString) {
    this.lunUuid = paramString;
  }
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public String getCompatibilityMode() {
    return this.compatibilityMode;
  }
  
  public void setCompatibilityMode(String paramString) {
    this.compatibilityMode = paramString;
  }
  
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
  
  public String getContentId() {
    return this.contentId;
  }
  
  public void setContentId(String paramString) {
    this.contentId = paramString;
  }
  
  public String getChangeId() {
    return this.changeId;
  }
  
  public void setChangeId(String paramString) {
    this.changeId = paramString;
  }
  
  public VirtualDiskRawDiskMappingVer1BackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDiskRawDiskMappingVer1BackingInfo paramVirtualDiskRawDiskMappingVer1BackingInfo) {
    this.parent = paramVirtualDiskRawDiskMappingVer1BackingInfo;
  }
  
  public String getDeltaDiskFormat() {
    return this.deltaDiskFormat;
  }
  
  public void setDeltaDiskFormat(String paramString) {
    this.deltaDiskFormat = paramString;
  }
  
  public Integer getDeltaGrainSize() {
    return this.deltaGrainSize;
  }
  
  public void setDeltaGrainSize(Integer paramInteger) {
    this.deltaGrainSize = paramInteger;
  }
  
  public String getSharing() {
    return this.sharing;
  }
  
  public void setSharing(String paramString) {
    this.sharing = paramString;
  }
}
