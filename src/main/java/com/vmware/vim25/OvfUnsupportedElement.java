package com.vmware.vim25;

import com.vmware.vim25.OvfNoSpaceOnController;
import com.vmware.vim25.OvfUnsupportedElement;
import com.vmware.vim25.OvfUnsupportedElementValue;
import com.vmware.vim25.OvfUnsupportedPackage;
import com.vmware.vim25.OvfUnsupportedSection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedElement", propOrder = {"name"})
@XmlSeeAlso({OvfUnsupportedSection.class, OvfUnsupportedElementValue.class, OvfNoSpaceOnController.class})
public class OvfUnsupportedElement extends OvfUnsupportedPackage {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
