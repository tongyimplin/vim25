package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ProfileExecuteError;
import com.vmware.vim25.ProfilePropertyPath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExecuteError", propOrder = {"path", "message"})
public class ProfileExecuteError extends DynamicData {
  protected ProfilePropertyPath path;
  
  @XmlElement(required = true)
  protected LocalizableMessage message;
  
  public ProfilePropertyPath getPath() {
    return this.path;
  }
  
  public void setPath(ProfilePropertyPath paramProfilePropertyPath) {
    this.path = paramProfilePropertyPath;
  }
  
  public LocalizableMessage getMessage() {
    return this.message;
  }
  
  public void setMessage(LocalizableMessage paramLocalizableMessage) {
    this.message = paramLocalizableMessage;
  }
}
