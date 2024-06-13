package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerFileDeleteSpec;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileDeleteSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerFileDeleteSpec", propOrder = {"hostLowLevelProvisioningManagerFileDeleteSpec"})
public class ArrayOfHostLowLevelProvisioningManagerFileDeleteSpec {
  @XmlElement(name = "HostLowLevelProvisioningManagerFileDeleteSpec")
  protected List<HostLowLevelProvisioningManagerFileDeleteSpec> hostLowLevelProvisioningManagerFileDeleteSpec;
  
  public List<HostLowLevelProvisioningManagerFileDeleteSpec> getHostLowLevelProvisioningManagerFileDeleteSpec() {
    if (this.hostLowLevelProvisioningManagerFileDeleteSpec == null)
      this.hostLowLevelProvisioningManagerFileDeleteSpec = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerFileDeleteSpec;
  }
}
