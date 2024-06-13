package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanUpgradeSystemUpgradeHistoryItem;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanUpgradeSystemUpgradeHistoryItem", propOrder = {"vsanUpgradeSystemUpgradeHistoryItem"})
public class ArrayOfVsanUpgradeSystemUpgradeHistoryItem {
  @XmlElement(name = "VsanUpgradeSystemUpgradeHistoryItem")
  protected List<VsanUpgradeSystemUpgradeHistoryItem> vsanUpgradeSystemUpgradeHistoryItem;
  
  public List<VsanUpgradeSystemUpgradeHistoryItem> getVsanUpgradeSystemUpgradeHistoryItem() {
    if (this.vsanUpgradeSystemUpgradeHistoryItem == null)
      this.vsanUpgradeSystemUpgradeHistoryItem = new ArrayList<>(); 
    return this.vsanUpgradeSystemUpgradeHistoryItem;
  }
}
