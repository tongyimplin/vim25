package com.vmware.vim25;

import com.vmware.vim25.VsanHostDiskMapping;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryDiskGroupOp;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeHistoryDiskGroupOp", propOrder = {"operation", "diskMapping"})
public class VsanUpgradeSystemUpgradeHistoryDiskGroupOp extends VsanUpgradeSystemUpgradeHistoryItem {
  @XmlElement(required = true)
  protected String operation;
  
  @XmlElement(required = true)
  protected VsanHostDiskMapping diskMapping;
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
  
  public VsanHostDiskMapping getDiskMapping() {
    return this.diskMapping;
  }
  
  public void setDiskMapping(VsanHostDiskMapping paramVsanHostDiskMapping) {
    this.diskMapping = paramVsanHostDiskMapping;
  }
}
