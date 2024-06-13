package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerFileReserveResult;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileReserveResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerFileReserveResult", propOrder = {"hostLowLevelProvisioningManagerFileReserveResult"})
public class ArrayOfHostLowLevelProvisioningManagerFileReserveResult {
  @XmlElement(name = "HostLowLevelProvisioningManagerFileReserveResult")
  protected List<HostLowLevelProvisioningManagerFileReserveResult> hostLowLevelProvisioningManagerFileReserveResult;
  
  public List<HostLowLevelProvisioningManagerFileReserveResult> getHostLowLevelProvisioningManagerFileReserveResult() {
    if (this.hostLowLevelProvisioningManagerFileReserveResult == null)
      this.hostLowLevelProvisioningManagerFileReserveResult = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerFileReserveResult;
  }
}
