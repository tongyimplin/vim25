package com.vmware.vim25;

import com.vmware.vim25.ID;
import com.vmware.vim25.SharesInfo;
import com.vmware.vim25.StorageIOAllocationInfo;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDisk", propOrder = {"capacityInKB", "capacityInBytes", "shares", "storageIOAllocation", "diskObjectId", "vFlashCacheConfigInfo", "iofilter", "vDiskId", "nativeUnmanagedLinkedClone"})
public class VirtualDisk extends VirtualDevice {
  protected long capacityInKB;
  
  protected Long capacityInBytes;
  
  protected SharesInfo shares;
  
  protected StorageIOAllocationInfo storageIOAllocation;
  
  protected String diskObjectId;
  
  protected VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
  
  protected List<String> iofilter;
  
  protected ID vDiskId;
  
  protected Boolean nativeUnmanagedLinkedClone;
  
  public long getCapacityInKB() {
    return this.capacityInKB;
  }
  
  public void setCapacityInKB(long paramLong) {
    this.capacityInKB = paramLong;
  }
  
  public Long getCapacityInBytes() {
    return this.capacityInBytes;
  }
  
  public void setCapacityInBytes(Long paramLong) {
    this.capacityInBytes = paramLong;
  }
  
  public SharesInfo getShares() {
    return this.shares;
  }
  
  public void setShares(SharesInfo paramSharesInfo) {
    this.shares = paramSharesInfo;
  }
  
  public StorageIOAllocationInfo getStorageIOAllocation() {
    return this.storageIOAllocation;
  }
  
  public void setStorageIOAllocation(StorageIOAllocationInfo paramStorageIOAllocationInfo) {
    this.storageIOAllocation = paramStorageIOAllocationInfo;
  }
  
  public String getDiskObjectId() {
    return this.diskObjectId;
  }
  
  public void setDiskObjectId(String paramString) {
    this.diskObjectId = paramString;
  }
  
  public VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
    return this.vFlashCacheConfigInfo;
  }
  
  public void setVFlashCacheConfigInfo(VirtualDiskVFlashCacheConfigInfo paramVirtualDiskVFlashCacheConfigInfo) {
    this.vFlashCacheConfigInfo = paramVirtualDiskVFlashCacheConfigInfo;
  }
  
  public List<String> getIofilter() {
    if (this.iofilter == null)
      this.iofilter = new ArrayList<>(); 
    return this.iofilter;
  }
  
  public ID getVDiskId() {
    return this.vDiskId;
  }
  
  public void setVDiskId(ID paramID) {
    this.vDiskId = paramID;
  }
  
  public Boolean isNativeUnmanagedLinkedClone() {
    return this.nativeUnmanagedLinkedClone;
  }
  
  public void setNativeUnmanagedLinkedClone(Boolean paramBoolean) {
    this.nativeUnmanagedLinkedClone = paramBoolean;
  }
}
