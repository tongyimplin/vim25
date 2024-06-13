package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IoFilterHostIssue;
import com.vmware.vim25.IoFilterQueryIssueResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IoFilterQueryIssueResult", propOrder = {"opType", "hostIssue"})
public class IoFilterQueryIssueResult extends DynamicData {
  @XmlElement(required = true)
  protected String opType;
  
  protected List<IoFilterHostIssue> hostIssue;
  
  public String getOpType() {
    return this.opType;
  }
  
  public void setOpType(String paramString) {
    this.opType = paramString;
  }
  
  public List<IoFilterHostIssue> getHostIssue() {
    if (this.hostIssue == null)
      this.hostIssue = new ArrayList<>(); 
    return this.hostIssue;
  }
}
