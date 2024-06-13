package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.StorageIORMConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageIORMConfigOption", propOrder = {"enabledOption", "congestionThresholdOption", "statsCollectionEnabledOption", "reservationEnabledOption"})
public class StorageIORMConfigOption extends DynamicData {
  @XmlElement(required = true)
  protected BoolOption enabledOption;
  
  @XmlElement(required = true)
  protected IntOption congestionThresholdOption;
  
  protected BoolOption statsCollectionEnabledOption;
  
  protected BoolOption reservationEnabledOption;
  
  public BoolOption getEnabledOption() {
    return this.enabledOption;
  }
  
  public void setEnabledOption(BoolOption paramBoolOption) {
    this.enabledOption = paramBoolOption;
  }
  
  public IntOption getCongestionThresholdOption() {
    return this.congestionThresholdOption;
  }
  
  public void setCongestionThresholdOption(IntOption paramIntOption) {
    this.congestionThresholdOption = paramIntOption;
  }
  
  public BoolOption getStatsCollectionEnabledOption() {
    return this.statsCollectionEnabledOption;
  }
  
  public void setStatsCollectionEnabledOption(BoolOption paramBoolOption) {
    this.statsCollectionEnabledOption = paramBoolOption;
  }
  
  public BoolOption getReservationEnabledOption() {
    return this.reservationEnabledOption;
  }
  
  public void setReservationEnabledOption(BoolOption paramBoolOption) {
    this.reservationEnabledOption = paramBoolOption;
  }
}
