package com.vmware.vim25;

import com.vmware.vim25.ActiveVMsBlockingEVC;
import com.vmware.vim25.DisconnectedHostsBlockingEVC;
import com.vmware.vim25.EVCConfigFault;
import com.vmware.vim25.EVCModeIllegalByVendor;
import com.vmware.vim25.EVCModeUnsupportedByHosts;
import com.vmware.vim25.EVCUnsupportedByHostHardware;
import com.vmware.vim25.EVCUnsupportedByHostSoftware;
import com.vmware.vim25.HeterogenousHostsBlockingEVC;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCConfigFault", propOrder = {"faults"})
@XmlSeeAlso({EVCModeUnsupportedByHosts.class, EVCModeIllegalByVendor.class, EVCUnsupportedByHostSoftware.class, HeterogenousHostsBlockingEVC.class, EVCUnsupportedByHostHardware.class, DisconnectedHostsBlockingEVC.class, ActiveVMsBlockingEVC.class})
public class EVCConfigFault extends VimFault {
  protected List<LocalizedMethodFault> faults;
  
  public List<LocalizedMethodFault> getFaults() {
    if (this.faults == null)
      this.faults = new ArrayList<>(); 
    return this.faults;
  }
}
