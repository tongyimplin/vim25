package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.NoLicenseEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoLicenseEvent", propOrder = {"feature"})
public class NoLicenseEvent extends LicenseEvent {
  @XmlElement(required = true)
  protected LicenseFeatureInfo feature;
  
  public LicenseFeatureInfo getFeature() {
    return this.feature;
  }
  
  public void setFeature(LicenseFeatureInfo paramLicenseFeatureInfo) {
    this.feature = paramLicenseFeatureInfo;
  }
}
