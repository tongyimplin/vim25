package com.vmware.vim25;

import com.vmware.vim25.AnswerFileUpdateFailed;
import com.vmware.vim25.AnswerFileUpdateFailure;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileUpdateFailed", propOrder = {"failure"})
public class AnswerFileUpdateFailed extends VimFault {
  @XmlElement(required = true)
  protected List<AnswerFileUpdateFailure> failure;
  
  public List<AnswerFileUpdateFailure> getFailure() {
    if (this.failure == null)
      this.failure = new ArrayList<>(); 
    return this.failure;
  }
}
