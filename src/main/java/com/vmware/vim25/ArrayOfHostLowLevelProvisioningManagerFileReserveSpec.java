package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerFileReserveSpec;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileReserveSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerFileReserveSpec", propOrder = {"hostLowLevelProvisioningManagerFileReserveSpec"})
public class ArrayOfHostLowLevelProvisioningManagerFileReserveSpec {
  @XmlElement(name = "HostLowLevelProvisioningManagerFileReserveSpec")
  protected List<HostLowLevelProvisioningManagerFileReserveSpec> hostLowLevelProvisioningManagerFileReserveSpec;
  
  public List<HostLowLevelProvisioningManagerFileReserveSpec> getHostLowLevelProvisioningManagerFileReserveSpec() {
    if (this.hostLowLevelProvisioningManagerFileReserveSpec == null)
      this.hostLowLevelProvisioningManagerFileReserveSpec = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerFileReserveSpec;
  }
}
