package com.vmware.vim25;

import com.vmware.vim25.EVCAdmissionFailed;
import com.vmware.vim25.EVCAdmissionFailedCPUFeaturesForMode;
import com.vmware.vim25.EVCAdmissionFailedCPUModel;
import com.vmware.vim25.EVCAdmissionFailedCPUModelForMode;
import com.vmware.vim25.EVCAdmissionFailedCPUVendor;
import com.vmware.vim25.EVCAdmissionFailedCPUVendorUnknown;
import com.vmware.vim25.EVCAdmissionFailedHostDisconnected;
import com.vmware.vim25.EVCAdmissionFailedHostSoftware;
import com.vmware.vim25.EVCAdmissionFailedHostSoftwareForMode;
import com.vmware.vim25.EVCAdmissionFailedVmActive;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.NotSupportedHostInCluster;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCAdmissionFailed", propOrder = {"faults"})
@XmlSeeAlso({EVCAdmissionFailedHostSoftwareForMode.class, EVCAdmissionFailedCPUModelForMode.class, EVCAdmissionFailedCPUFeaturesForMode.class, EVCAdmissionFailedCPUModel.class, EVCAdmissionFailedCPUVendorUnknown.class, EVCAdmissionFailedHostDisconnected.class, EVCAdmissionFailedCPUVendor.class, EVCAdmissionFailedVmActive.class, EVCAdmissionFailedHostSoftware.class})
public class EVCAdmissionFailed extends NotSupportedHostInCluster {
  protected List<LocalizedMethodFault> faults;
  
  public List<LocalizedMethodFault> getFaults() {
    if (this.faults == null)
      this.faults = new ArrayList<>(); 
    return this.faults;
  }
}
