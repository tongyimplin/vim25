package com.vmware.vim25;

import com.vmware.vim25.FcoeFault;
import com.vmware.vim25.FcoeFaultPnicHasNoPortSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeFaultPnicHasNoPortSet", propOrder = {"nicDevice"})
public class FcoeFaultPnicHasNoPortSet extends FcoeFault {
  @XmlElement(required = true)
  protected String nicDevice;
  
  public String getNicDevice() {
    return this.nicDevice;
  }
  
  public void setNicDevice(String paramString) {
    this.nicDevice = paramString;
  }
}
