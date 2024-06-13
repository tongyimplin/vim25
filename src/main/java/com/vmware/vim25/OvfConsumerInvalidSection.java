package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerInvalidSection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerInvalidSection", propOrder = {"lineNumber", "description"})
public class OvfConsumerInvalidSection extends OvfConsumerCallbackFault {
  protected int lineNumber;
  
  @XmlElement(required = true)
  protected String description;
  
  public int getLineNumber() {
    return this.lineNumber;
  }
  
  public void setLineNumber(int paramInt) {
    this.lineNumber = paramInt;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
