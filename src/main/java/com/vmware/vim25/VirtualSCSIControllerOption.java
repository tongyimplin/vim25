package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.ParaVirtualSCSIControllerOption;
import com.vmware.vim25.VirtualBusLogicControllerOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualLsiLogicControllerOption;
import com.vmware.vim25.VirtualLsiLogicSASControllerOption;
import com.vmware.vim25.VirtualSCSIControllerOption;
import com.vmware.vim25.VirtualSCSISharing;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSCSIControllerOption", propOrder = {"numSCSIDisks", "numSCSICdroms", "numSCSIPassthrough", "sharing", "defaultSharedIndex", "hotAddRemove", "scsiCtlrUnitNumber"})
@XmlSeeAlso({ParaVirtualSCSIControllerOption.class, VirtualLsiLogicSASControllerOption.class, VirtualLsiLogicControllerOption.class, VirtualBusLogicControllerOption.class})
public class VirtualSCSIControllerOption extends VirtualControllerOption {
  @XmlElement(required = true)
  protected IntOption numSCSIDisks;
  
  @XmlElement(required = true)
  protected IntOption numSCSICdroms;
  
  @XmlElement(required = true)
  protected IntOption numSCSIPassthrough;
  
  @XmlElement(required = true)
  protected List<VirtualSCSISharing> sharing;
  
  protected int defaultSharedIndex;
  
  @XmlElement(required = true)
  protected BoolOption hotAddRemove;
  
  protected int scsiCtlrUnitNumber;
  
  public IntOption getNumSCSIDisks() {
    return this.numSCSIDisks;
  }
  
  public void setNumSCSIDisks(IntOption paramIntOption) {
    this.numSCSIDisks = paramIntOption;
  }
  
  public IntOption getNumSCSICdroms() {
    return this.numSCSICdroms;
  }
  
  public void setNumSCSICdroms(IntOption paramIntOption) {
    this.numSCSICdroms = paramIntOption;
  }
  
  public IntOption getNumSCSIPassthrough() {
    return this.numSCSIPassthrough;
  }
  
  public void setNumSCSIPassthrough(IntOption paramIntOption) {
    this.numSCSIPassthrough = paramIntOption;
  }
  
  public List<VirtualSCSISharing> getSharing() {
    if (this.sharing == null)
      this.sharing = new ArrayList<>(); 
    return this.sharing;
  }
  
  public int getDefaultSharedIndex() {
    return this.defaultSharedIndex;
  }
  
  public void setDefaultSharedIndex(int paramInt) {
    this.defaultSharedIndex = paramInt;
  }
  
  public BoolOption getHotAddRemove() {
    return this.hotAddRemove;
  }
  
  public void setHotAddRemove(BoolOption paramBoolOption) {
    this.hotAddRemove = paramBoolOption;
  }
  
  public int getScsiCtlrUnitNumber() {
    return this.scsiCtlrUnitNumber;
  }
  
  public void setScsiCtlrUnitNumber(int paramInt) {
    this.scsiCtlrUnitNumber = paramInt;
  }
}
