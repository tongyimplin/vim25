package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualNVDIMMBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMBackingInfo", propOrder = {"parent", "changeId"})
public class VirtualNVDIMMBackingInfo extends VirtualDeviceFileBackingInfo {
  protected VirtualNVDIMMBackingInfo parent;
  
  protected String changeId;
  
  public VirtualNVDIMMBackingInfo getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualNVDIMMBackingInfo paramVirtualNVDIMMBackingInfo) {
    this.parent = paramVirtualNVDIMMBackingInfo;
  }
  
  public String getChangeId() {
    return this.changeId;
  }
  
  public void setChangeId(String paramString) {
    this.changeId = paramString;
  }
}
