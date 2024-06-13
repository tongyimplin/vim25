package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualDiskPartitionedRawDiskVer2BackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskVer2BackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskVer2BackingInfo", propOrder = {"descriptorFileName", "uuid", "changeId", "sharing"})
@XmlSeeAlso({VirtualDiskPartitionedRawDiskVer2BackingInfo.class})
public class VirtualDiskRawDiskVer2BackingInfo extends VirtualDeviceDeviceBackingInfo {
  @XmlElement(required = true)
  protected String descriptorFileName;
  
  protected String uuid;
  
  protected String changeId;
  
  protected String sharing;
  
  public String getDescriptorFileName() {
    return this.descriptorFileName;
  }
  
  public void setDescriptorFileName(String paramString) {
    this.descriptorFileName = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getChangeId() {
    return this.changeId;
  }
  
  public void setChangeId(String paramString) {
    this.changeId = paramString;
  }
  
  public String getSharing() {
    return this.sharing;
  }
  
  public void setSharing(String paramString) {
    this.sharing = paramString;
  }
}
