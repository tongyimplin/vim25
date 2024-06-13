package com.vmware.vim25;

import com.vmware.vim25.VsanUpgradeSystemNetworkPartitionInfo;
import com.vmware.vim25.VsanUpgradeSystemNetworkPartitionIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemNetworkPartitionIssue", propOrder = {"partitions"})
public class VsanUpgradeSystemNetworkPartitionIssue extends VsanUpgradeSystemPreflightCheckIssue {
  @XmlElement(required = true)
  protected List<VsanUpgradeSystemNetworkPartitionInfo> partitions;
  
  public List<VsanUpgradeSystemNetworkPartitionInfo> getPartitions() {
    if (this.partitions == null)
      this.partitions = new ArrayList<>(); 
    return this.partitions;
  }
}
