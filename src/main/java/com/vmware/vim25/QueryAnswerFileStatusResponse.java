package com.vmware.vim25;

import com.vmware.vim25.AnswerFileStatusResult;
import com.vmware.vim25.QueryAnswerFileStatusResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAnswerFileStatusResponse")
public class QueryAnswerFileStatusResponse {
  protected List<AnswerFileStatusResult> returnval;
  
  public List<AnswerFileStatusResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
