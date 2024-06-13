package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocator;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocatorBackingSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocator", propOrder = {"diskId", "datastore", "diskMoveType", "diskBackingInfo", "profile", "backing"})
public class VirtualMachineRelocateSpecDiskLocator extends DynamicData {
  protected int diskId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected String diskMoveType;
  
  protected VirtualDeviceBackingInfo diskBackingInfo;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected VirtualMachineRelocateSpecDiskLocatorBackingSpec backing;
  
  public int getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(int paramInt) {
    this.diskId = paramInt;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
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
  
  public VirtualMachineRelocateSpecDiskLocatorBackingSpec getBacking() {
    return this.backing;
  }
  
  public void setBacking(VirtualMachineRelocateSpecDiskLocatorBackingSpec paramVirtualMachineRelocateSpecDiskLocatorBackingSpec) {
    this.backing = paramVirtualMachineRelocateSpecDiskLocatorBackingSpec;
  }
}
