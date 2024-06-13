package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ProfileMetadataProfileOperationMessage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadataProfileOperationMessage", propOrder = {"operationName", "message"})
public class ProfileMetadataProfileOperationMessage extends DynamicData {
  @XmlElement(required = true)
  protected String operationName;
  
  @XmlElement(required = true)
  protected LocalizableMessage message;
  
  public String getOperationName() {
    return this.operationName;
  }
  
  public void setOperationName(String paramString) {
    this.operationName = paramString;
  }
  
  public LocalizableMessage getMessage() {
    return this.message;
  }
  
  public void setMessage(LocalizableMessage paramLocalizableMessage) {
    this.message = paramLocalizableMessage;
  }
}
