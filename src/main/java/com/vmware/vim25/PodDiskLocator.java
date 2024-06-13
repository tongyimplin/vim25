package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PodDiskLocator;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PodDiskLocator", propOrder = {"diskId", "diskMoveType", "diskBackingInfo", "profile"})
public class PodDiskLocator extends DynamicData {
  protected int diskId;
  
  protected String diskMoveType;
  
  protected VirtualDeviceBackingInfo diskBackingInfo;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  public int getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(int paramInt) {
    this.diskId = paramInt;
  }
  
  public String getDiskMoveType() {
    return this.diskMoveType;
  }
  
  public void setDiskMoveType(String paramString) {
    this.diskMoveType = paramString;
  }
  
  public VirtualDeviceBackingInfo getDiskBackingInfo() {
    return this.diskBackingInfo;
  }
  
  public void setDiskBackingInfo(VirtualDeviceBackingInfo paramVirtualDeviceBackingInfo) {
    this.diskBackingInfo = paramVirtualDeviceBackingInfo;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
}
