package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualSriovEthernetCard;
import com.vmware.vim25.VirtualSriovEthernetCardSriovBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSriovEthernetCard", propOrder = {"allowGuestOSMtuChange", "sriovBacking"})
public class VirtualSriovEthernetCard extends VirtualEthernetCard {
  protected Boolean allowGuestOSMtuChange;
  
  protected VirtualSriovEthernetCardSriovBackingInfo sriovBacking;
  
  public Boolean isAllowGuestOSMtuChange() {
    return this.allowGuestOSMtuChange;
  }
  
  public void setAllowGuestOSMtuChange(Boolean paramBoolean) {
    this.allowGuestOSMtuChange = paramBoolean;
  }
  
  public VirtualSriovEthernetCardSriovBackingInfo getSriovBacking() {
    return this.sriovBacking;
  }
  
  public void setSriovBacking(VirtualSriovEthernetCardSriovBackingInfo paramVirtualSriovEthernetCardSriovBackingInfo) {
    this.sriovBacking = paramVirtualSriovEthernetCardSriovBackingInfo;
  }
}
