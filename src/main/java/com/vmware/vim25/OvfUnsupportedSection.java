package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedElement;
import com.vmware.vim25.OvfUnsupportedSection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedSection", propOrder = {"info"})
public class OvfUnsupportedSection extends OvfUnsupportedElement {
  @XmlElement(required = true)
  protected String info;
  
  public String getInfo() {
    return this.info;
  }
  
  public void setInfo(String paramString) {
    this.info = paramString;
  }
}
