package com.vmware.vim25;

import com.vmware.vim25.IoFilterQueryIssueResult;
import com.vmware.vim25.QueryIoFilterIssuesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryIoFilterIssuesResponse")
public class QueryIoFilterIssuesResponse {
  @XmlElement(required = true)
  protected IoFilterQueryIssueResult returnval;
  
  public IoFilterQueryIssueResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(IoFilterQueryIssueResult paramIoFilterQueryIssueResult) {
    this.returnval = paramIoFilterQueryIssueResult;
  }
}
