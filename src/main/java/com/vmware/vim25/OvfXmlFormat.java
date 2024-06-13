package com.vmware.vim25;

import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfXmlFormat;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfXmlFormat", propOrder = {"description"})
public class OvfXmlFormat extends OvfInvalidPackage {
  @XmlElement(required = true)
  protected String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
