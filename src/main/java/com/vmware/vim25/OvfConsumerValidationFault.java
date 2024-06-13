package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerValidationFault;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerValidationFault", propOrder = {"extensionKey", "extensionName", "message"})
public class OvfConsumerValidationFault extends VmConfigFault {
  @XmlElement(required = true)
  protected String extensionKey;
  
  @XmlElement(required = true)
  protected String extensionName;
  
  @XmlElement(required = true)
  protected String message;
  
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
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
}
