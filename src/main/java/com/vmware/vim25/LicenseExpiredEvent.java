package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.LicenseExpiredEvent;
import com.vmware.vim25.LicenseFeatureInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseExpiredEvent", propOrder = {"feature"})
public class LicenseExpiredEvent extends Event {
  @XmlElement(required = true)
  protected LicenseFeatureInfo feature;
  
  public LicenseFeatureInfo getFeature() {
    return this.feature;
  }
  
  public void setFeature(LicenseFeatureInfo paramLicenseFeatureInfo) {
    this.feature = paramLicenseFeatureInfo;
  }
}
