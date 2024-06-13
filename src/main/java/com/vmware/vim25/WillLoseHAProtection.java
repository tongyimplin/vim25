package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.WillLoseHAProtection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WillLoseHAProtection", propOrder = {"resolution"})
public class WillLoseHAProtection extends MigrationFault {
  @XmlElement(required = true)
  protected String resolution;
  
  public String getResolution() {
    return this.resolution;
  }
  
  public void setResolution(String paramString) {
    this.resolution = paramString;
  }
}
