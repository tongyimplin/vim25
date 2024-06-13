package com.vmware.vim25;

import com.vmware.vim25.AnswerFileUpdateFailure;
import com.vmware.vim25.ArrayOfAnswerFileUpdateFailure;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnswerFileUpdateFailure", propOrder = {"answerFileUpdateFailure"})
public class ArrayOfAnswerFileUpdateFailure {
  @XmlElement(name = "AnswerFileUpdateFailure")
  protected List<AnswerFileUpdateFailure> answerFileUpdateFailure;
  
  public List<AnswerFileUpdateFailure> getAnswerFileUpdateFailure() {
    if (this.answerFileUpdateFailure == null)
      this.answerFileUpdateFailure = new ArrayList<>(); 
    return this.answerFileUpdateFailure;
  }
}
