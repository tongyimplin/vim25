package com.vmware.vim25;

import com.vmware.vim25.InvalidEditionLicense;
import com.vmware.vim25.NotEnoughLicenses;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidEditionLicense", propOrder = {"feature"})
public class InvalidEditionLicense extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected String feature;
  
  public String getFeature() {
    return this.feature;
  }
  
  public void setFeature(String paramString) {
    this.feature = paramString;
  }
}
