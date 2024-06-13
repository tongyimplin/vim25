package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.VirtualDiskOptionVFlashCacheConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskOptionVFlashCacheConfigOption", propOrder = {"cacheConsistencyType", "cacheMode", "reservationInMB", "blockSizeInKB"})
public class VirtualDiskOptionVFlashCacheConfigOption extends DynamicData {
  @XmlElement(required = true)
  protected ChoiceOption cacheConsistencyType;
  
  @XmlElement(required = true)
  protected ChoiceOption cacheMode;
  
  @XmlElement(required = true)
  protected LongOption reservationInMB;
  
  @XmlElement(required = true)
  protected LongOption blockSizeInKB;
  
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
  
  public LongOption getReservationInMB() {
    return this.reservationInMB;
  }
  
  public void setReservationInMB(LongOption paramLongOption) {
    this.reservationInMB = paramLongOption;
  }
  
  public LongOption getBlockSizeInKB() {
    return this.blockSizeInKB;
  }
  
  public void setBlockSizeInKB(LongOption paramLongOption) {
    this.blockSizeInKB = paramLongOption;
  }
}
