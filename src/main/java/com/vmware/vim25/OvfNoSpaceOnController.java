package com.vmware.vim25;

import com.vmware.vim25.OvfNoSpaceOnController;
import com.vmware.vim25.OvfUnsupportedElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfNoSpaceOnController", propOrder = {"parent"})
public class OvfNoSpaceOnController extends OvfUnsupportedElement {
  @XmlElement(required = true)
  protected String parent;
  
  public String getParent() {
    return this.parent;
  }
  
  public void setParent(String paramString) {
    this.parent = paramString;
  }
}
