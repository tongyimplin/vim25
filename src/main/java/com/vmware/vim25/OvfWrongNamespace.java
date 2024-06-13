package com.vmware.vim25;

import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfWrongNamespace;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfWrongNamespace", propOrder = {"namespaceName"})
public class OvfWrongNamespace extends OvfInvalidPackage {
  @XmlElement(required = true)
  protected String namespaceName;
  
  public String getNamespaceName() {
    return this.namespaceName;
  }
  
  public void setNamespaceName(String paramString) {
    this.namespaceName = paramString;
  }
}
