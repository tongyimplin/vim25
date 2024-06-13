package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
import com.vmware.vim25.LongOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption", propOrder = {"vFlashModule", "vFlashModuleVersion", "minSupportedModuleVersion", "cacheConsistencyType", "cacheMode", "blockSizeInKBOption", "reservationInMBOption", "maxDiskSizeInKB"})
public class HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption extends DynamicData {
  @XmlElement(required = true)
  protected String vFlashModule;
  
  @XmlElement(required = true)
  protected String vFlashModuleVersion;
  
  @XmlElement(required = true)
  protected String minSupportedModuleVersion;
  
  @XmlElement(required = true)
  protected ChoiceOption cacheConsistencyType;
  
  @XmlElement(required = true)
  protected ChoiceOption cacheMode;
  
  @XmlElement(required = true)
  protected LongOption blockSizeInKBOption;
  
  @XmlElement(required = true)
  protected LongOption reservationInMBOption;
  
  protected long maxDiskSizeInKB;
  
  public String getVFlashModule() {
    return this.vFlashModule;
  }
  
  public void setVFlashModule(String paramString) {
    this.vFlashModule = paramString;
  }
  
  public String getVFlashModuleVersion() {
    return this.vFlashModuleVersion;
  }
  
  public void setVFlashModuleVersion(String paramString) {
    this.vFlashModuleVersion = paramString;
  }
  
  public String getMinSupportedModuleVersion() {
    return this.minSupportedModuleVersion;
  }
  
  public void setMinSupportedModuleVersion(String paramString) {
    this.minSupportedModuleVersion = paramString;
  }
  
  public ChoiceOption getCacheConsistencyType() {
    return this.cacheConsistencyType;
  }
  
  public void setCacheConsistencyType(ChoiceOption paramChoiceOption) {
    this.cacheConsistencyType = paramChoiceOption;
  }
  
  public ChoiceOption getCacheMode() {
    return this.cacheMode;
  }
  
  public void setCacheMode(ChoiceOption paramChoiceOption) {
    this.cacheMode = paramChoiceOption;
  }
  
  public LongOption getBlockSizeInKBOption() {
    return this.blockSizeInKBOption;
  }
  
  public void setBlockSizeInKBOption(LongOption paramLongOption) {
    this.blockSizeInKBOption = paramLongOption;
  }
  
  public LongOption getReservationInMBOption() {
    return this.reservationInMBOption;
  }
  
  public void setReservationInMBOption(LongOption paramLongOption) {
    this.reservationInMBOption = paramLongOption;
  }
  
  public long getMaxDiskSizeInKB() {
    return this.maxDiskSizeInKB;
  }
  
  public void setMaxDiskSizeInKB(long paramLong) {
    this.maxDiskSizeInKB = paramLong;
  }
}
