package com.vmware.vim25;

import com.vmware.vim25.VsanUpgradeSystemNotEnoughFreeCapacityIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemNotEnoughFreeCapacityIssue", propOrder = {"reducedRedundancyUpgradePossible"})
public class VsanUpgradeSystemNotEnoughFreeCapacityIssue extends VsanUpgradeSystemPreflightCheckIssue {
  protected boolean reducedRedundancyUpgradePossible;
  
  public boolean isReducedRedundancyUpgradePossible() {
    return this.reducedRedundancyUpgradePossible;
  }
  
  public void setReducedRedundancyUpgradePossible(boolean paramBoolean) {
    this.reducedRedundancyUpgradePossible = paramBoolean;
  }
}
