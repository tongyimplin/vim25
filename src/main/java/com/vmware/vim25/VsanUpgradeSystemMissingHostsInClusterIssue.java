package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanUpgradeSystemMissingHostsInClusterIssue;
import com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemMissingHostsInClusterIssue", propOrder = {"hosts"})
public class VsanUpgradeSystemMissingHostsInClusterIssue extends VsanUpgradeSystemPreflightCheckIssue {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> hosts;
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
