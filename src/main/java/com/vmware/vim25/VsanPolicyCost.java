package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanPolicyCost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanPolicyCost", propOrder = {"changeDataSize", "currentDataSize", "tempDataSize", "copyDataSize", "changeFlashReadCacheSize", "currentFlashReadCacheSize", "currentDiskSpaceToAddressSpaceRatio", "diskSpaceToAddressSpaceRatio"})
public class VsanPolicyCost extends DynamicData {
  protected Long changeDataSize;
  
  protected Long currentDataSize;
  
  protected Long tempDataSize;
  
  protected Long copyDataSize;
  
  protected Long changeFlashReadCacheSize;
  
  protected Long currentFlashReadCacheSize;
  
  protected Float currentDiskSpaceToAddressSpaceRatio;
  
  protected Float diskSpaceToAddressSpaceRatio;
  
  public Long getChangeDataSize() {
    return this.changeDataSize;
  }
  
  public void setChangeDataSize(Long paramLong) {
    this.changeDataSize = paramLong;
  }
  
  public Long getCurrentDataSize() {
    return this.currentDataSize;
  }
  
  public void setCurrentDataSize(Long paramLong) {
    this.currentDataSize = paramLong;
  }
  
  public Long getTempDataSize() {
    return this.tempDataSize;
  }
  
  public void setTempDataSize(Long paramLong) {
    this.tempDataSize = paramLong;
  }
  
  public Long getCopyDataSize() {
    return this.copyDataSize;
  }
  
  public void setCopyDataSize(Long paramLong) {
    this.copyDataSize = paramLong;
  }
  
  public Long getChangeFlashReadCacheSize() {
    return this.changeFlashReadCacheSize;
  }
  
  public void setChangeFlashReadCacheSize(Long paramLong) {
    this.changeFlashReadCacheSize = paramLong;
  }
  
  public Long getCurrentFlashReadCacheSize() {
    return this.currentFlashReadCacheSize;
  }
  
  public void setCurrentFlashReadCacheSize(Long paramLong) {
    this.currentFlashReadCacheSize = paramLong;
  }
  
  public Float getCurrentDiskSpaceToAddressSpaceRatio() {
    return this.currentDiskSpaceToAddressSpaceRatio;
  }
  
  public void setCurrentDiskSpaceToAddressSpaceRatio(Float paramFloat) {
    this.currentDiskSpaceToAddressSpaceRatio = paramFloat;
  }
  
  public Float getDiskSpaceToAddressSpaceRatio() {
    return this.diskSpaceToAddressSpaceRatio;
  }
  
  public void setDiskSpaceToAddressSpaceRatio(Float paramFloat) {
    this.diskSpaceToAddressSpaceRatio = paramFloat;
  }
}
