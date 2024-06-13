package com.vmware.vim25;

import com.vmware.vim25.OvfDiskMappingNotFound;
import com.vmware.vim25.OvfSystemFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfDiskMappingNotFound", propOrder = {"diskName", "vmName"})
public class OvfDiskMappingNotFound extends OvfSystemFault {
  @XmlElement(required = true)
  protected String diskName;
  
  @XmlElement(required = true)
  protected String vmName;
  
  public String getDiskName() {
    return this.diskName;
  }
  
  public void setDiskName(String paramString) {
    this.diskName = paramString;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
}
