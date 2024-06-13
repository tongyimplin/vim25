package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostDiskMapping;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemPreflightCheckResult", propOrder = {"issues", "diskMappingToRestore"})
public class VsanUpgradeSystemPreflightCheckResult extends DynamicData {
  protected List<VsanUpgradeSystemPreflightCheckIssue> issues;
  
  protected VsanHostDiskMapping diskMappingToRestore;
  
  public List<VsanUpgradeSystemPreflightCheckIssue> getIssues() {
    if (this.issues == null)
      this.issues = new ArrayList<>(); 
    return this.issues;
  }
  
  public VsanHostDiskMapping getDiskMappingToRestore() {
    return this.diskMappingToRestore;
  }
  
  public void setDiskMappingToRestore(VsanHostDiskMapping paramVsanHostDiskMapping) {
    this.diskMappingToRestore = paramVsanHostDiskMapping;
  }
}
