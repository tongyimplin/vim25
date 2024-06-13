package com.vmware.vim25;

import com.vmware.vim25.AnswerFileUpdateFailure;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ProfilePropertyPath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileUpdateFailure", propOrder = {"userInputPath", "errMsg"})
public class AnswerFileUpdateFailure extends DynamicData {
  @XmlElement(required = true)
  protected ProfilePropertyPath userInputPath;
  
  @XmlElement(required = true)
  protected LocalizableMessage errMsg;
  
  public ProfilePropertyPath getUserInputPath() {
    return this.userInputPath;
  }
  
  public void setUserInputPath(ProfilePropertyPath paramProfilePropertyPath) {
    this.userInputPath = paramProfilePropertyPath;
  }
  
  public LocalizableMessage getErrMsg() {
    return this.errMsg;
  }
  
  public void setErrMsg(LocalizableMessage paramLocalizableMessage) {
    this.errMsg = paramLocalizableMessage;
  }
}
