package com.vmware.vim25;

import com.vmware.vim25.HostMultipathInfoFixedLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoFixedLogicalUnitPolicy", propOrder = {"prefer"})
public class HostMultipathInfoFixedLogicalUnitPolicy extends HostMultipathInfoLogicalUnitPolicy {
  @XmlElement(required = true)
  protected String prefer;
  
  public String getPrefer() {
    return this.prefer;
  }
  
  public void setPrefer(String paramString) {
    this.prefer = paramString;
  }
}
