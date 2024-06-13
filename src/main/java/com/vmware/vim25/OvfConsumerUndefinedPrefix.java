package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerUndefinedPrefix;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerUndefinedPrefix", propOrder = {"prefix"})
public class OvfConsumerUndefinedPrefix extends OvfConsumerCallbackFault {
  @XmlElement(required = true)
  protected String prefix;
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public void setPrefix(String paramString) {
    this.prefix = paramString;
  }
}
