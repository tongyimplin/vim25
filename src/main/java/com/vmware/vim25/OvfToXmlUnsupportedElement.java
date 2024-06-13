package com.vmware.vim25;

import com.vmware.vim25.OvfSystemFault;
import com.vmware.vim25.OvfToXmlUnsupportedElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfToXmlUnsupportedElement", propOrder = {"name"})
public class OvfToXmlUnsupportedElement extends OvfSystemFault {
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
