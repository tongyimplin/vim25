package com.vmware.vim25;

import com.vmware.vim25.VsanUpgradeSystemPreflightCheckResult;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryPreflightFail;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeHistoryPreflightFail", propOrder = {"preflightResult"})
public class VsanUpgradeSystemUpgradeHistoryPreflightFail extends VsanUpgradeSystemUpgradeHistoryItem {
  @XmlElement(required = true)
  protected VsanUpgradeSystemPreflightCheckResult preflightResult;
  
  public VsanUpgradeSystemPreflightCheckResult getPreflightResult() {
    return this.preflightResult;
  }
  
  public void setPreflightResult(VsanUpgradeSystemPreflightCheckResult paramVsanUpgradeSystemPreflightCheckResult) {
    this.preflightResult = paramVsanUpgradeSystemPreflightCheckResult;
  }
}
