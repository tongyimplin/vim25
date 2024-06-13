package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LicenseAvailabilityInfo;
import com.vmware.vim25.LicenseFeatureInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseAvailabilityInfo", propOrder = {"feature", "total", "available"})
public class LicenseAvailabilityInfo extends DynamicData {
  @XmlElement(required = true)
  protected LicenseFeatureInfo feature;
  
  protected int total;
  
  protected int available;
  
  public LicenseFeatureInfo getFeature() {
    return this.feature;
  }
  
  public void setFeature(LicenseFeatureInfo paramLicenseFeatureInfo) {
    this.feature = paramLicenseFeatureInfo;
  }
  
  public int getTotal() {
    return this.total;
  }
  
  public void setTotal(int paramInt) {
    this.total = paramInt;
  }
  
  public int getAvailable() {
    return this.available;
  }
  
  public void setAvailable(int paramInt) {
    this.available = paramInt;
  }
}
