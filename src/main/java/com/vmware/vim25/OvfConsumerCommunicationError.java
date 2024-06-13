package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerCommunicationError;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerCommunicationError", propOrder = {"description"})
public class OvfConsumerCommunicationError extends OvfConsumerCallbackFault {
  @XmlElement(required = true)
  protected String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
