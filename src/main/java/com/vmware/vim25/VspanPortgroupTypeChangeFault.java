package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.VspanPortgroupTypeChangeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VspanPortgroupTypeChangeFault", propOrder = {"portgroupName"})
public class VspanPortgroupTypeChangeFault extends DvsFault {
  @XmlElement(required = true)
  protected String portgroupName;
  
  public String getPortgroupName() {
    return this.portgroupName;
  }
  
  public void setPortgroupName(String paramString) {
    this.portgroupName = paramString;
  }
}
