package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanUpgradeSystemAPIBrokenIssue;
import com.vmware.vim25.VsanUpgradeSystemAutoClaimEnabledOnHostsIssue;
import com.vmware.vim25.VsanUpgradeSystemHostsDisconnectedIssue;
import com.vmware.vim25.VsanUpgradeSystemMissingHostsInClusterIssue;
import com.vmware.vim25.VsanUpgradeSystemNetworkPartitionIssue;
import com.vmware.vim25.VsanUpgradeSystemNotEnoughFreeCapacityIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import com.vmware.vim25.VsanUpgradeSystemRogueHostsInClusterIssue;
import com.vmware.vim25.VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue;
import com.vmware.vim25.VsanUpgradeSystemWrongEsxVersionIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemPreflightCheckIssue", propOrder = {"msg"})
@XmlSeeAlso({VsanUpgradeSystemNotEnoughFreeCapacityIssue.class, VsanUpgradeSystemHostsDisconnectedIssue.class, VsanUpgradeSystemWrongEsxVersionIssue.class, VsanUpgradeSystemNetworkPartitionIssue.class, VsanUpgradeSystemRogueHostsInClusterIssue.class, VsanUpgradeSystemAPIBrokenIssue.class, VsanUpgradeSystemMissingHostsInClusterIssue.class, VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue.class, VsanUpgradeSystemAutoClaimEnabledOnHostsIssue.class})
public class VsanUpgradeSystemPreflightCheckIssue extends DynamicData {
  @XmlElement(required = true)
  protected String msg;
  
  public String getMsg() {
    return this.msg;
  }
  
  public void setMsg(String paramString) {
    this.msg = paramString;
  }
}
