package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerUndeclaredSection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerUndeclaredSection", propOrder = {"qualifiedSectionType"})
public class OvfConsumerUndeclaredSection extends OvfConsumerCallbackFault {
  @XmlElement(required = true)
  protected String qualifiedSectionType;
  
  public String getQualifiedSectionType() {
    return this.qualifiedSectionType;
  }
  
  public void setQualifiedSectionType(String paramString) {
    this.qualifiedSectionType = paramString;
  }
}
