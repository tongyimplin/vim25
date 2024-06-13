package com.vmware.vim25;

import com.vmware.vim25.VFlashModuleVersionIncompatible;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VFlashModuleVersionIncompatible", propOrder = {"moduleName", "vmRequestModuleVersion", "hostMinSupportedVerson", "hostModuleVersion"})
public class VFlashModuleVersionIncompatible extends VimFault {
  @XmlElement(required = true)
  protected String moduleName;
  
  @XmlElement(required = true)
  protected String vmRequestModuleVersion;
  
  @XmlElement(required = true)
  protected String hostMinSupportedVerson;
  
  @XmlElement(required = true)
  protected String hostModuleVersion;
  
  public String getModuleName() {
    return this.moduleName;
  }
  
  public void setModuleName(String paramString) {
    this.moduleName = paramString;
  }
  
  public String getVmRequestModuleVersion() {
    return this.vmRequestModuleVersion;
  }
  
  public void setVmRequestModuleVersion(String paramString) {
    this.vmRequestModuleVersion = paramString;
  }
  
  public String getHostMinSupportedVerson() {
    return this.hostMinSupportedVerson;
  }
  
  public void setHostMinSupportedVerson(String paramString) {
    this.hostMinSupportedVerson = paramString;
  }
  
  public String getHostModuleVersion() {
    return this.hostModuleVersion;
  }
  
  public void setHostModuleVersion(String paramString) {
    this.hostModuleVersion = paramString;
  }
}
