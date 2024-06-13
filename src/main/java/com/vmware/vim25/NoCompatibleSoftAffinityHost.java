package com.vmware.vim25;

import com.vmware.vim25.NoCompatibleSoftAffinityHost;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoCompatibleSoftAffinityHost", propOrder = {"vmName"})
public class NoCompatibleSoftAffinityHost extends VmConfigFault {
  @XmlElement(required = true)
  protected String vmName;
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
}
