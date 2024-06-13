package com.vmware.vim25;

import com.vmware.vim25.CustomizationFailed;
import com.vmware.vim25.CustomizationSysprepFailed;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSysprepFailed", propOrder = {"sysprepVersion", "systemVersion"})
public class CustomizationSysprepFailed extends CustomizationFailed {
  @XmlElement(required = true)
  protected String sysprepVersion;
  
  @XmlElement(required = true)
  protected String systemVersion;
  
  public String getSysprepVersion() {
    return this.sysprepVersion;
  }
  
  public void setSysprepVersion(String paramString) {
    this.sysprepVersion = paramString;
  }
  
  public String getSystemVersion() {
    return this.systemVersion;
  }
  
  public void setSystemVersion(String paramString) {
    this.systemVersion = paramString;
  }
}
