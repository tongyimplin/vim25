package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostRuntimeInfoDiskIssue;
import com.vmware.vim25.VsanHostRuntimeInfoDiskIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostRuntimeInfoDiskIssue", propOrder = {"vsanHostRuntimeInfoDiskIssue"})
public class ArrayOfVsanHostRuntimeInfoDiskIssue {
  @XmlElement(name = "VsanHostRuntimeInfoDiskIssue")
  protected List<VsanHostRuntimeInfoDiskIssue> vsanHostRuntimeInfoDiskIssue;
  
  public List<VsanHostRuntimeInfoDiskIssue> getVsanHostRuntimeInfoDiskIssue() {
    if (this.vsanHostRuntimeInfoDiskIssue == null)
      this.vsanHostRuntimeInfoDiskIssue = new ArrayList<>(); 
    return this.vsanHostRuntimeInfoDiskIssue;
  }
}
