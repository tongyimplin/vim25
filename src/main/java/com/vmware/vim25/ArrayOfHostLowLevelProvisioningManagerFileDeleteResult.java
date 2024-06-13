package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostLowLevelProvisioningManagerFileDeleteResult;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileDeleteResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostLowLevelProvisioningManagerFileDeleteResult", propOrder = {"hostLowLevelProvisioningManagerFileDeleteResult"})
public class ArrayOfHostLowLevelProvisioningManagerFileDeleteResult {
  @XmlElement(name = "HostLowLevelProvisioningManagerFileDeleteResult")
  protected List<HostLowLevelProvisioningManagerFileDeleteResult> hostLowLevelProvisioningManagerFileDeleteResult;
  
  public List<HostLowLevelProvisioningManagerFileDeleteResult> getHostLowLevelProvisioningManagerFileDeleteResult() {
    if (this.hostLowLevelProvisioningManagerFileDeleteResult == null)
      this.hostLowLevelProvisioningManagerFileDeleteResult = new ArrayList<>(); 
    return this.hostLowLevelProvisioningManagerFileDeleteResult;
  }
}
