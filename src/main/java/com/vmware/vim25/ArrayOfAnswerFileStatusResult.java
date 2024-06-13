package com.vmware.vim25;

import com.vmware.vim25.AnswerFileStatusResult;
import com.vmware.vim25.ArrayOfAnswerFileStatusResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnswerFileStatusResult", propOrder = {"answerFileStatusResult"})
public class ArrayOfAnswerFileStatusResult {
  @XmlElement(name = "AnswerFileStatusResult")
  protected List<AnswerFileStatusResult> answerFileStatusResult;
  
  public List<AnswerFileStatusResult> getAnswerFileStatusResult() {
    if (this.answerFileStatusResult == null)
      this.answerFileStatusResult = new ArrayList<>(); 
    return this.answerFileStatusResult;
  }
}
