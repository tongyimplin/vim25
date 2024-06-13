package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanUpgradeSystemNetworkPartitionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemNetworkPartitionInfo", propOrder = {"hosts"})
public class VsanUpgradeSystemNetworkPartitionInfo extends DynamicData {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> hosts;
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
