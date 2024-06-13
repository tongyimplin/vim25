package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsSpaceLoadBalanceConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsSpaceLoadBalanceConfig", propOrder = {"spaceThresholdMode", "spaceUtilizationThreshold", "freeSpaceThresholdGB", "minSpaceUtilizationDifference"})
public class StorageDrsSpaceLoadBalanceConfig extends DynamicData {
  protected String spaceThresholdMode;
  
  protected Integer spaceUtilizationThreshold;
  
  protected Integer freeSpaceThresholdGB;
  
  protected Integer minSpaceUtilizationDifference;
  
  public String getSpaceThresholdMode() {
    return this.spaceThresholdMode;
  }
  
  public void setSpaceThresholdMode(String paramString) {
    this.spaceThresholdMode = paramString;
  }
  
  public Integer getSpaceUtilizationThreshold() {
    return this.spaceUtilizationThreshold;
  }
  
  public void setSpaceUtilizationThreshold(Integer paramInteger) {
    this.spaceUtilizationThreshold = paramInteger;
  }
  
  public Integer getFreeSpaceThresholdGB() {
    return this.freeSpaceThresholdGB;
  }
  
  public void setFreeSpaceThresholdGB(Integer paramInteger) {
    this.freeSpaceThresholdGB = paramInteger;
  }
  
  public Integer getMinSpaceUtilizationDifference() {
    return this.minSpaceUtilizationDifference;
  }
  
  public void setMinSpaceUtilizationDifference(Integer paramInteger) {
    this.minSpaceUtilizationDifference = paramInteger;
  }
}
