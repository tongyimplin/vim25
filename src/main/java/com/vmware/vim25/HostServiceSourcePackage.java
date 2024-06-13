package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostServiceSourcePackage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostServiceSourcePackage", propOrder = {"sourcePackageName", "description"})
public class HostServiceSourcePackage extends DynamicData {
  @XmlElement(required = true)
  protected String sourcePackageName;
  
  @XmlElement(required = true)
  protected String description;
  
  public String getSourcePackageName() {
    return this.sourcePackageName;
  }
  
  public void setSourcePackageName(String paramString) {
    this.sourcePackageName = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
