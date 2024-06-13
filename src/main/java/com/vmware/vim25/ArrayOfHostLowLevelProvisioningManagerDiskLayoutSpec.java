package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec;
import com.vmware.vim25.HostLowLevelProvisioningManagerDiskLayoutSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec", propOrder = {"hostLowLevelProvisioningManagerDiskLayoutSpec"})
public class ArrayOfHostLowLevelProvisioningManagerDiskLayoutSpec {
  @XmlElement(name = "HostLowLevelProvisioningManagerDiskLayoutSpec")
  protected List<HostLowLevelProvisioningManagerDiskLayoutSpec> hostLowLevelProvisioningManagerDiskLayoutSpec;
  
  public List<HostLowLevelProvisioningManagerDiskLayoutSpec> getHostLowLevelProvisioningManagerDiskLayoutSpec() {
    if (this.hostLowLevelProvisioningManagerDiskLayoutSpec == null)
      this.hostLowLevelProvisioningManagerDiskLayoutSpec = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerDiskLayoutSpec;
  }
}
