package com.vmware.vim25;

import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import com.vmware.vim25.VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue", propOrder = {"uuids"})
public class VsanUpgradeSystemV2ObjectsPresentDuringDowngradeIssue extends VsanUpgradeSystemPreflightCheckIssue {
  @XmlElement(required = true)
  protected List<String> uuids;
  
  public List<String> getUuids() {
    if (this.uuids == null)
      this.uuids = new ArrayList<>(); 
    return this.uuids;
  }
}
