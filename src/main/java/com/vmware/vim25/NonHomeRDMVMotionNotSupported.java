package com.vmware.vim25;

import com.vmware.vim25.MigrationFeatureNotSupported;
import com.vmware.vim25.NonHomeRDMVMotionNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonHomeRDMVMotionNotSupported", propOrder = {"device"})
public class NonHomeRDMVMotionNotSupported extends MigrationFeatureNotSupported {
  @XmlElement(required = true)
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
