package com.vmware.vim25;

import com.vmware.vim25.OvfImport;
import com.vmware.vim25.OvfUnsupportedDiskProvisioning;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedDiskProvisioning", propOrder = {"diskProvisioning", "supportedDiskProvisioning"})
public class OvfUnsupportedDiskProvisioning extends OvfImport {
  @XmlElement(required = true)
  protected String diskProvisioning;
  
  @XmlElement(required = true)
  protected String supportedDiskProvisioning;
  
  public String getDiskProvisioning() {
    return this.diskProvisioning;
  }
  
  public void setDiskProvisioning(String paramString) {
    this.diskProvisioning = paramString;
  }
  
  public String getSupportedDiskProvisioning() {
    return this.supportedDiskProvisioning;
  }
  
  public void setSupportedDiskProvisioning(String paramString) {
    this.supportedDiskProvisioning = paramString;
  }
}
