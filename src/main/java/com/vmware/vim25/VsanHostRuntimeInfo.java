package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostMembershipInfo;
import com.vmware.vim25.VsanHostRuntimeInfo;
import com.vmware.vim25.VsanHostRuntimeInfoDiskIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostRuntimeInfo", propOrder = {"membershipList", "diskIssues", "accessGenNo"})
public class VsanHostRuntimeInfo extends DynamicData {
  protected List<VsanHostMembershipInfo> membershipList;
  
  protected List<VsanHostRuntimeInfoDiskIssue> diskIssues;
  
  protected Integer accessGenNo;
  
  public List<VsanHostMembershipInfo> getMembershipList() {
    if (this.membershipList == null)
      this.membershipList = new ArrayList<>(); 
    return this.membershipList;
  }
  
  public List<VsanHostRuntimeInfoDiskIssue> getDiskIssues() {
    if (this.diskIssues == null)
      this.diskIssues = new ArrayList<>(); 
    return this.diskIssues;
  }
  
  public Integer getAccessGenNo() {
    return this.accessGenNo;
  }
  
  public void setAccessGenNo(Integer paramInteger) {
    this.accessGenNo = paramInteger;
  }
}
