package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskVFlashCacheConfigInfo", propOrder = {"vFlashModule", "reservationInMB", "cacheConsistencyType", "cacheMode", "blockSizeInKB"})
public class VirtualDiskVFlashCacheConfigInfo extends DynamicData {
  protected String vFlashModule;
  
  protected Long reservationInMB;
  
  protected String cacheConsistencyType;
  
  protected String cacheMode;
  
  protected Long blockSizeInKB;
  
  public String getVFlashModule() {
    return this.vFlashModule;
  }
  
  public void setVFlashModule(String paramString) {
    this.vFlashModule = paramString;
  }
  
  public Long getReservationInMB() {
    return this.reservationInMB;
  }
  
  public void setReservationInMB(Long paramLong) {
    this.reservationInMB = paramLong;
  }
  
  public String getCacheConsistencyType() {
    return this.cacheConsistencyType;
  }
  
  public void setCacheConsistencyType(String paramString) {
    this.cacheConsistencyType = paramString;
  }
  
  public String getCacheMode() {
    return this.cacheMode;
  }
  
  public void setCacheMode(String paramString) {
    this.cacheMode = paramString;
  }
  
  public Long getBlockSizeInKB() {
    return this.blockSizeInKB;
  }
  
  public void setBlockSizeInKB(Long paramLong) {
    this.blockSizeInKB = paramLong;
  }
}
