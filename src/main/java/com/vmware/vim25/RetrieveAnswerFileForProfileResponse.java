package com.vmware.vim25;

import com.vmware.vim25.AnswerFile;
import com.vmware.vim25.RetrieveAnswerFileForProfileResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveAnswerFileForProfileResponse")
public class RetrieveAnswerFileForProfileResponse {
  protected AnswerFile returnval;
  
  public AnswerFile getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(AnswerFile paramAnswerFile) {
    this.returnval = paramAnswerFile;
  }
}
