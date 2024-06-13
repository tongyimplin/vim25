package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec;
import com.vmware.vim25.HostLowLevelProvisioningManagerSnapshotLayoutSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec", propOrder = {"hostLowLevelProvisioningManagerSnapshotLayoutSpec"})
public class ArrayOfHostLowLevelProvisioningManagerSnapshotLayoutSpec {
  @XmlElement(name = "HostLowLevelProvisioningManagerSnapshotLayoutSpec")
  protected List<HostLowLevelProvisioningManagerSnapshotLayoutSpec> hostLowLevelProvisioningManagerSnapshotLayoutSpec;
  
  public List<HostLowLevelProvisioningManagerSnapshotLayoutSpec> getHostLowLevelProvisioningManagerSnapshotLayoutSpec() {
    if (this.hostLowLevelProvisioningManagerSnapshotLayoutSpec == null)
      this.hostLowLevelProvisioningManagerSnapshotLayoutSpec = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerSnapshotLayoutSpec;
  }
}
