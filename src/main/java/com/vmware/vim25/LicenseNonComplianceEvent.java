package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.LicenseNonComplianceEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseNonComplianceEvent", propOrder = {"url"})
public class LicenseNonComplianceEvent extends LicenseEvent {
  @XmlElement(required = true)
  protected String url;
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
