package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostRuntimeInfoDiskIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostRuntimeInfoDiskIssue", propOrder = {"diskId", "issue"})
public class VsanHostRuntimeInfoDiskIssue extends DynamicData {
  @XmlElement(required = true)
  protected String diskId;
  
  @XmlElement(required = true)
  protected String issue;
  
  public String getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(String paramString) {
    this.diskId = paramString;
  }
  
  public String getIssue() {
    return this.issue;
  }
  
  public void setIssue(String paramString) {
    this.issue = paramString;
  }
}
