package com.vmware.vim25;

import com.vmware.vim25.InvalidEditionEvent;
import com.vmware.vim25.LicenseEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidEditionEvent", propOrder = {"feature"})
public class InvalidEditionEvent extends LicenseEvent {
  @XmlElement(required = true)
  protected String feature;
  
  public String getFeature() {
    return this.feature;
  }
  
  public void setFeature(String paramString) {
    this.feature = paramString;
  }
}
