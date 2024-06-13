package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.OvfConsumerPowerOnFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerPowerOnFault", propOrder = {"extensionKey", "extensionName", "description"})
public class OvfConsumerPowerOnFault extends InvalidState {
  @XmlElement(required = true)
  protected String extensionKey;
  
  @XmlElement(required = true)
  protected String extensionName;
  
  @XmlElement(required = true)
  protected String description;
  
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
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
