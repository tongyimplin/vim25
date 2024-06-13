package com.vmware.vim25;

import com.vmware.vim25.AnswerFileStatusError;
import com.vmware.vim25.ArrayOfAnswerFileStatusError;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnswerFileStatusError", propOrder = {"answerFileStatusError"})
public class ArrayOfAnswerFileStatusError {
  @XmlElement(name = "AnswerFileStatusError")
  protected List<AnswerFileStatusError> answerFileStatusError;
  
  public List<AnswerFileStatusError> getAnswerFileStatusError() {
    if (this.answerFileStatusError == null)
      this.answerFileStatusError = new ArrayList<>(); 
    return this.answerFileStatusError;
  }
}
