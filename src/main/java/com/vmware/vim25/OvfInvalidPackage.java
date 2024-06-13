package com.vmware.vim25;

import com.vmware.vim25.OvfAttribute;
import com.vmware.vim25.OvfConstraint;
import com.vmware.vim25.OvfElement;
import com.vmware.vim25.OvfFault;
import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfProperty;
import com.vmware.vim25.OvfWrongNamespace;
import com.vmware.vim25.OvfXmlFormat;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfInvalidPackage", propOrder = {"lineNumber"})
@XmlSeeAlso({OvfXmlFormat.class, OvfWrongNamespace.class, OvfConstraint.class, OvfElement.class, OvfProperty.class, OvfAttribute.class})
public class OvfInvalidPackage extends OvfFault {
  protected int lineNumber;
  
  public int getLineNumber() {
    return this.lineNumber;
  }
  
  public void setLineNumber(int paramInt) {
    this.lineNumber = paramInt;
  }
}
