package com.vmware.vim25;

import com.vmware.vim25.OvfDuplicateElement;
import com.vmware.vim25.OvfDuplicatedElementBoundary;
import com.vmware.vim25.OvfElement;
import com.vmware.vim25.OvfElementInvalidValue;
import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfMissingElement;
import com.vmware.vim25.OvfUnexpectedElement;
import com.vmware.vim25.OvfWrongElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfElement", propOrder = {"name"})
@XmlSeeAlso({OvfDuplicateElement.class, OvfUnexpectedElement.class, OvfElementInvalidValue.class, OvfWrongElement.class, OvfDuplicatedElementBoundary.class, OvfMissingElement.class})
public class OvfElement extends OvfInvalidPackage {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
