package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ProfilePropertyPath;
import com.vmware.vim25.ProfileUpdateFailedUpdateFailure;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileUpdateFailedUpdateFailure", propOrder = {"profilePath", "errMsg"})
public class ProfileUpdateFailedUpdateFailure extends DynamicData {
  @XmlElement(required = true)
  protected ProfilePropertyPath profilePath;
  
  @XmlElement(required = true)
  protected LocalizableMessage errMsg;
  
  public ProfilePropertyPath getProfilePath() {
    return this.profilePath;
  }
  
  public void setProfilePath(ProfilePropertyPath paramProfilePropertyPath) {
    this.profilePath = paramProfilePropertyPath;
  }
  
  public LocalizableMessage getErrMsg() {
    return this.errMsg;
  }
  
  public void setErrMsg(LocalizableMessage paramLocalizableMessage) {
    this.errMsg = paramLocalizableMessage;
  }
}
