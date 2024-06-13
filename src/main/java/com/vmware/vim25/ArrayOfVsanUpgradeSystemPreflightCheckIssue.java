package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanUpgradeSystemPreflightCheckIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanUpgradeSystemPreflightCheckIssue", propOrder = {"vsanUpgradeSystemPreflightCheckIssue"})
public class ArrayOfVsanUpgradeSystemPreflightCheckIssue {
  @XmlElement(name = "VsanUpgradeSystemPreflightCheckIssue")
  protected List<VsanUpgradeSystemPreflightCheckIssue> vsanUpgradeSystemPreflightCheckIssue;
  
  public List<VsanUpgradeSystemPreflightCheckIssue> getVsanUpgradeSystemPreflightCheckIssue() {
    if (this.vsanUpgradeSystemPreflightCheckIssue == null)
      this.vsanUpgradeSystemPreflightCheckIssue = new ArrayList<>(); 
    return this.vsanUpgradeSystemPreflightCheckIssue;
  }
}
