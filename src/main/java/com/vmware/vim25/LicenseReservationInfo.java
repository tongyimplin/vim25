package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LicenseReservationInfo;
import com.vmware.vim25.LicenseReservationInfoState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseReservationInfo", propOrder = {"key", "state", "required"})
public class LicenseReservationInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected LicenseReservationInfoState state;
  
  protected int required;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public LicenseReservationInfoState getState() {
    return this.state;
  }
  
  public void setState(LicenseReservationInfoState paramLicenseReservationInfoState) {
    this.state = paramLicenseReservationInfoState;
  }
  
  public int getRequired() {
    return this.required;
  }
  
  public void setRequired(int paramInt) {
    this.required = paramInt;
  }
}
