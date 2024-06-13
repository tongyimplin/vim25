package com.vmware.vim25;

import com.vmware.vim25.ParaVirtualSCSIController;
import com.vmware.vim25.VirtualBusLogicController;
import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualLsiLogicController;
import com.vmware.vim25.VirtualLsiLogicSASController;
import com.vmware.vim25.VirtualSCSIController;
import com.vmware.vim25.VirtualSCSISharing;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSCSIController", propOrder = {"hotAddRemove", "sharedBus", "scsiCtlrUnitNumber"})
@XmlSeeAlso({VirtualLsiLogicController.class, ParaVirtualSCSIController.class, VirtualBusLogicController.class, VirtualLsiLogicSASController.class})
public class VirtualSCSIController extends VirtualController {
  protected Boolean hotAddRemove;
  
  @XmlElement(required = true)
  protected VirtualSCSISharing sharedBus;
  
  protected Integer scsiCtlrUnitNumber;
  
  public Boolean isHotAddRemove() {
    return this.hotAddRemove;
  }
  
  public void setHotAddRemove(Boolean paramBoolean) {
    this.hotAddRemove = paramBoolean;
  }
  
  public VirtualSCSISharing getSharedBus() {
    return this.sharedBus;
  }
  
  public void setSharedBus(VirtualSCSISharing paramVirtualSCSISharing) {
    this.sharedBus = paramVirtualSCSISharing;
  }
  
  public Integer getScsiCtlrUnitNumber() {
    return this.scsiCtlrUnitNumber;
  }
  
  public void setScsiCtlrUnitNumber(Integer paramInteger) {
    this.scsiCtlrUnitNumber = paramInteger;
  }
}
