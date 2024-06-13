package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageIORMConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageIORMConfigSpec", propOrder = {"enabled", "congestionThresholdMode", "congestionThreshold", "percentOfPeakThroughput", "statsCollectionEnabled", "reservationEnabled", "statsAggregationDisabled", "reservableIopsThreshold"})
public class StorageIORMConfigSpec extends DynamicData {
  protected Boolean enabled;
  
  protected String congestionThresholdMode;
  
  protected Integer congestionThreshold;
  
  protected Integer percentOfPeakThroughput;
  
  protected Boolean statsCollectionEnabled;
  
  protected Boolean reservationEnabled;
  
  protected Boolean statsAggregationDisabled;
  
  protected Integer reservableIopsThreshold;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getCongestionThresholdMode() {
    return this.congestionThresholdMode;
  }
  
  public void setCongestionThresholdMode(String paramString) {
    this.congestionThresholdMode = paramString;
  }
  
  public Integer getCongestionThreshold() {
    return this.congestionThreshold;
  }
  
  public void setCongestionThreshold(Integer paramInteger) {
    this.congestionThreshold = paramInteger;
  }
  
  public Integer getPercentOfPeakThroughput() {
    return this.percentOfPeakThroughput;
  }
  
  public void setPercentOfPeakThroughput(Integer paramInteger) {
    this.percentOfPeakThroughput = paramInteger;
  }
  
  public Boolean isStatsCollectionEnabled() {
    return this.statsCollectionEnabled;
  }
  
  public void setStatsCollectionEnabled(Boolean paramBoolean) {
    this.statsCollectionEnabled = paramBoolean;
  }
  
  public Boolean isReservationEnabled() {
    return this.reservationEnabled;
  }
  
  public void setReservationEnabled(Boolean paramBoolean) {
    this.reservationEnabled = paramBoolean;
  }
  
  public Boolean isStatsAggregationDisabled() {
    return this.statsAggregationDisabled;
  }
  
  public void setStatsAggregationDisabled(Boolean paramBoolean) {
    this.statsAggregationDisabled = paramBoolean;
  }
  
  public Integer getReservableIopsThreshold() {
    return this.reservableIopsThreshold;
  }
  
  public void setReservableIopsThreshold(Integer paramInteger) {
    this.reservableIopsThreshold = paramInteger;
  }
}
