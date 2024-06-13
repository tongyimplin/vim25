package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostImageProfileSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostImageProfileSummary", propOrder = {"name", "vendor"})
public class HostImageProfileSummary extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String vendor;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
}
