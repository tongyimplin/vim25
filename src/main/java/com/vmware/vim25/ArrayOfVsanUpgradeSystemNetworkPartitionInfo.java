package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanUpgradeSystemNetworkPartitionInfo;
import com.vmware.vim25.VsanUpgradeSystemNetworkPartitionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanUpgradeSystemNetworkPartitionInfo", propOrder = {"vsanUpgradeSystemNetworkPartitionInfo"})
public class ArrayOfVsanUpgradeSystemNetworkPartitionInfo {
  @XmlElement(name = "VsanUpgradeSystemNetworkPartitionInfo")
  protected List<VsanUpgradeSystemNetworkPartitionInfo> vsanUpgradeSystemNetworkPartitionInfo;
  
  public List<VsanUpgradeSystemNetworkPartitionInfo> getVsanUpgradeSystemNetworkPartitionInfo() {
    if (this.vsanUpgradeSystemNetworkPartitionInfo == null)
      this.vsanUpgradeSystemNetworkPartitionInfo = new ArrayList<>(); 
    return this.vsanUpgradeSystemNetworkPartitionInfo;
  }
}
