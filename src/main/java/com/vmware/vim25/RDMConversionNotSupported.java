package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.RDMConversionNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RDMConversionNotSupported", propOrder = {"device"})
public class RDMConversionNotSupported extends MigrationFault {
  @XmlElement(required = true)
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
