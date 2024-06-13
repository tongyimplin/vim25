package com.vmware.vim25;

import com.vmware.vim25.OvfSystemFault;
import com.vmware.vim25.OvfUnknownEntity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnknownEntity", propOrder = {"lineNumber"})
public class OvfUnknownEntity extends OvfSystemFault {
  protected int lineNumber;
  
  public int getLineNumber() {
    return this.lineNumber;
  }
  
  public void setLineNumber(int paramInt) {
    this.lineNumber = paramInt;
  }
}
