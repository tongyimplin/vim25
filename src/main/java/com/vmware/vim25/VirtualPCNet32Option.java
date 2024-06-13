package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCardOption;
import com.vmware.vim25.VirtualPCNet32Option;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCNet32Option", propOrder = {"supportsMorphing"})
public class VirtualPCNet32Option extends VirtualEthernetCardOption {
  protected boolean supportsMorphing;
  
  public boolean isSupportsMorphing() {
    return this.supportsMorphing;
  }
  
  public void setSupportsMorphing(boolean paramBoolean) {
    this.supportsMorphing = paramBoolean;
  }
}
