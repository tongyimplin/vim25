package com.vmware.vim25;

import com.vmware.vim25.EvaluationLicenseSource;
import com.vmware.vim25.LicenseSource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationLicenseSource", propOrder = {"remainingHours"})
public class EvaluationLicenseSource extends LicenseSource {
  protected Long remainingHours;
  
  public Long getRemainingHours() {
    return this.remainingHours;
  }
  
  public void setRemainingHours(Long paramLong) {
    this.remainingHours = paramLong;
  }
}
