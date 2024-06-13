package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerCommunicationError;
import com.vmware.vim25.OvfConsumerFault;
import com.vmware.vim25.OvfConsumerInvalidSection;
import com.vmware.vim25.OvfConsumerUndeclaredSection;
import com.vmware.vim25.OvfConsumerUndefinedPrefix;
import com.vmware.vim25.OvfFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerCallbackFault", propOrder = {"extensionKey", "extensionName"})
@XmlSeeAlso({OvfConsumerUndefinedPrefix.class, OvfConsumerInvalidSection.class, OvfConsumerCommunicationError.class, OvfConsumerUndeclaredSection.class, OvfConsumerFault.class})
public class OvfConsumerCallbackFault extends OvfFault {
  @XmlElement(required = true)
  protected String extensionKey;
  
  @XmlElement(required = true)
  protected String extensionName;
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public String getExtensionName() {
    return this.extensionName;
  }
  
  public void setExtensionName(String paramString) {
    this.extensionName = paramString;
  }
}
