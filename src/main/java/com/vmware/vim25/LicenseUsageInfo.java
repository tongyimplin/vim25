package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.LicenseReservationInfo;
import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.LicenseUsageInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseUsageInfo", propOrder = {"source", "sourceAvailable", "reservationInfo", "featureInfo"})
public class LicenseUsageInfo extends DynamicData {
  @XmlElement(required = true)
  protected LicenseSource source;
  
  protected boolean sourceAvailable;
  
  protected List<LicenseReservationInfo> reservationInfo;
  
  protected List<LicenseFeatureInfo> featureInfo;
  
  public LicenseSource getSource() {
    return this.source;
  }
  
  public void setSource(LicenseSource paramLicenseSource) {
    this.source = paramLicenseSource;
  }
  
  public boolean isSourceAvailable() {
    return this.sourceAvailable;
  }
  
  public void setSourceAvailable(boolean paramBoolean) {
    this.sourceAvailable = paramBoolean;
  }
  
  public List<LicenseReservationInfo> getReservationInfo() {
    if (this.reservationInfo == null)
      this.reservationInfo = new ArrayList<>(); 
    return this.reservationInfo;
  }
  
  public List<LicenseFeatureInfo> getFeatureInfo() {
    if (this.featureInfo == null)
      this.featureInfo = new ArrayList<>(); 
    return this.featureInfo;
  }
}
