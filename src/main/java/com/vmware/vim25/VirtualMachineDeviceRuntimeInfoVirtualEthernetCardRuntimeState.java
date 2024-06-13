package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineDeviceRuntimeInfoDeviceRuntimeState;
import com.vmware.vim25.VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState;
import com.vmware.vim25.VirtualMachineFeatureRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState", propOrder = {"vmDirectPathGen2Active", "vmDirectPathGen2InactiveReasonVm", "vmDirectPathGen2InactiveReasonOther", "vmDirectPathGen2InactiveReasonExtended", "reservationStatus", "attachmentStatus", "featureRequirement"})
public class VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState extends VirtualMachineDeviceRuntimeInfoDeviceRuntimeState {
  protected boolean vmDirectPathGen2Active;
  
  protected List<String> vmDirectPathGen2InactiveReasonVm;
  
  protected List<String> vmDirectPathGen2InactiveReasonOther;
  
  protected String vmDirectPathGen2InactiveReasonExtended;
  
  protected String reservationStatus;
  
  protected String attachmentStatus;
  
  protected List<VirtualMachineFeatureRequirement> featureRequirement;
  
  public boolean isVmDirectPathGen2Active() {
    return this.vmDirectPathGen2Active;
  }
  
  public void setVmDirectPathGen2Active(boolean paramBoolean) {
    this.vmDirectPathGen2Active = paramBoolean;
  }
  
  public List<String> getVmDirectPathGen2InactiveReasonVm() {
    if (this.vmDirectPathGen2InactiveReasonVm == null)
      this.vmDirectPathGen2InactiveReasonVm = new ArrayList<>(); 
    return this.vmDirectPathGen2InactiveReasonVm;
  }
  
  public List<String> getVmDirectPathGen2InactiveReasonOther() {
    if (this.vmDirectPathGen2InactiveReasonOther == null)
      this.vmDirectPathGen2InactiveReasonOther = new ArrayList<>(); 
    return this.vmDirectPathGen2InactiveReasonOther;
  }
  
  public String getVmDirectPathGen2InactiveReasonExtended() {
    return this.vmDirectPathGen2InactiveReasonExtended;
  }
  
  public void setVmDirectPathGen2InactiveReasonExtended(String paramString) {
    this.vmDirectPathGen2InactiveReasonExtended = paramString;
  }
  
  public String getReservationStatus() {
    return this.reservationStatus;
  }
  
  public void setReservationStatus(String paramString) {
    this.reservationStatus = paramString;
  }
  
  public String getAttachmentStatus() {
    return this.attachmentStatus;
  }
  
  public void setAttachmentStatus(String paramString) {
    this.attachmentStatus = paramString;
  }
  
  public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
    if (this.featureRequirement == null)
      this.featureRequirement = new ArrayList<>(); 
    return this.featureRequirement;
  }
}
