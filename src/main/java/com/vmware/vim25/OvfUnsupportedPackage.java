package com.vmware.vim25;

import com.vmware.vim25.OvfFault;
import com.vmware.vim25.OvfInvalidVmName;
import com.vmware.vim25.OvfNoHostNic;
import com.vmware.vim25.OvfNoSupportedHardwareFamily;
import com.vmware.vim25.OvfUnsupportedAttribute;
import com.vmware.vim25.OvfUnsupportedElement;
import com.vmware.vim25.OvfUnsupportedPackage;
import com.vmware.vim25.OvfUnsupportedSubType;
import com.vmware.vim25.OvfUnsupportedType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedPackage", propOrder = {"lineNumber"})
@XmlSeeAlso({OvfNoHostNic.class, OvfInvalidVmName.class, OvfUnsupportedAttribute.class, OvfUnsupportedElement.class, OvfUnsupportedSubType.class, OvfUnsupportedType.class, OvfNoSupportedHardwareFamily.class})
public class OvfUnsupportedPackage extends OvfFault {
  protected Integer lineNumber;
  
  public Integer getLineNumber() {
    return this.lineNumber;
  }
  
  public void setLineNumber(Integer paramInteger) {
    this.lineNumber = paramInteger;
  }
}
