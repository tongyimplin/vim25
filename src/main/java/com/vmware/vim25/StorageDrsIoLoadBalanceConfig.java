package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsIoLoadBalanceConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsIoLoadBalanceConfig", propOrder = {"reservablePercentThreshold", "reservableIopsThreshold", "reservableThresholdMode", "ioLatencyThreshold", "ioLoadImbalanceThreshold"})
public class StorageDrsIoLoadBalanceConfig extends DynamicData {
  protected Integer reservablePercentThreshold;
  
  protected Integer reservableIopsThreshold;
  
  protected String reservableThresholdMode;
  
  protected Integer ioLatencyThreshold;
  
  protected Integer ioLoadImbalanceThreshold;
  
  public Integer getReservablePercentThreshold() {
    return this.reservablePercentThreshold;
  }
  
  public void setReservablePercentThreshold(Integer paramInteger) {
    this.reservablePercentThreshold = paramInteger;
  }
  
  public Integer getReservableIopsThreshold() {
    return this.reservableIopsThreshold;
  }
  
  public void setReservableIopsThreshold(Integer paramInteger) {
    this.reservableIopsThreshold = paramInteger;
  }
  
  public String getReservableThresholdMode() {
    return this.reservableThresholdMode;
  }
  
  public void setReservableThresholdMode(String paramString) {
    this.reservableThresholdMode = paramString;
  }
  
  public Integer getIoLatencyThreshold() {
    return this.ioLatencyThreshold;
  }
  
  public void setIoLatencyThreshold(Integer paramInteger) {
    this.ioLatencyThreshold = paramInteger;
  }
  
  public Integer getIoLoadImbalanceThreshold() {
    return this.ioLoadImbalanceThreshold;
  }
  
  public void setIoLoadImbalanceThreshold(Integer paramInteger) {
    this.ioLoadImbalanceThreshold = paramInteger;
  }
}
