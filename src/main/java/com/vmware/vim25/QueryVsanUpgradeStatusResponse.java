package com.vmware.vim25;

import com.vmware.vim25.QueryVsanUpgradeStatusResponse;
import com.vmware.vim25.VsanUpgradeSystemUpgradeStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryVsanUpgradeStatusResponse")
public class QueryVsanUpgradeStatusResponse {
  @XmlElement(required = true)
  protected VsanUpgradeSystemUpgradeStatus returnval;
  
  public VsanUpgradeSystemUpgradeStatus getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VsanUpgradeSystemUpgradeStatus paramVsanUpgradeSystemUpgradeStatus) {
    this.returnval = paramVsanUpgradeSystemUpgradeStatus;
  }
}
