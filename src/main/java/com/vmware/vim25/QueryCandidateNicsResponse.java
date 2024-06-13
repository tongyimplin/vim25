package com.vmware.vim25;

import com.vmware.vim25.IscsiPortInfo;
import com.vmware.vim25.QueryCandidateNicsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryCandidateNicsResponse")
public class QueryCandidateNicsResponse {
  protected List<IscsiPortInfo> returnval;
  
  public List<IscsiPortInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
