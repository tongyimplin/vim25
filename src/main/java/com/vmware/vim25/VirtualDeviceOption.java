package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualCdromOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceBusSlotOption;
import com.vmware.vim25.VirtualDeviceConnectOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualDiskOption;
import com.vmware.vim25.VirtualEthernetCardOption;
import com.vmware.vim25.VirtualFloppyOption;
import com.vmware.vim25.VirtualKeyboardOption;
import com.vmware.vim25.VirtualMachineVMCIDeviceOption;
import com.vmware.vim25.VirtualNVDIMMOption;
import com.vmware.vim25.VirtualPCIPassthroughOption;
import com.vmware.vim25.VirtualParallelPortOption;
import com.vmware.vim25.VirtualPointingDeviceOption;
import com.vmware.vim25.VirtualPrecisionClockOption;
import com.vmware.vim25.VirtualSCSIPassthroughOption;
import com.vmware.vim25.VirtualSerialPortOption;
import com.vmware.vim25.VirtualSoundCardOption;
import com.vmware.vim25.VirtualTPMOption;
import com.vmware.vim25.VirtualUSBOption;
import com.vmware.vim25.VirtualVMIROMOption;
import com.vmware.vim25.VirtualVideoCardOption;
import com.vmware.vim25.VirtualWDTOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceOption", propOrder = {"type", "connectOption", "busSlotOption", "controllerType", "autoAssignController", "backingOption", "defaultBackingOptionIndex", "licensingLimit", "deprecated", "plugAndPlay", "hotRemoveSupported"})
@XmlSeeAlso({VirtualKeyboardOption.class, VirtualSerialPortOption.class, VirtualVMIROMOption.class, VirtualParallelPortOption.class, VirtualVideoCardOption.class, VirtualTPMOption.class, VirtualNVDIMMOption.class, VirtualFloppyOption.class, VirtualMachineVMCIDeviceOption.class, VirtualPointingDeviceOption.class, VirtualCdromOption.class, VirtualWDTOption.class, VirtualUSBOption.class, VirtualPCIPassthroughOption.class, VirtualEthernetCardOption.class, VirtualPrecisionClockOption.class, VirtualDiskOption.class, VirtualSCSIPassthroughOption.class, VirtualSoundCardOption.class, VirtualControllerOption.class})
public class VirtualDeviceOption extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected VirtualDeviceConnectOption connectOption;
  
  protected VirtualDeviceBusSlotOption busSlotOption;
  
  protected String controllerType;
  
  protected BoolOption autoAssignController;
  
  protected List<VirtualDeviceBackingOption> backingOption;
  
  protected Integer defaultBackingOptionIndex;
  
  protected List<String> licensingLimit;
  
  protected boolean deprecated;
  
  protected boolean plugAndPlay;
  
  protected Boolean hotRemoveSupported;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public VirtualDeviceConnectOption getConnectOption() {
    return this.connectOption;
  }
  
  public void setConnectOption(VirtualDeviceConnectOption paramVirtualDeviceConnectOption) {
    this.connectOption = paramVirtualDeviceConnectOption;
  }
  
  public VirtualDeviceBusSlotOption getBusSlotOption() {
    return this.busSlotOption;
  }
  
  public void setBusSlotOption(VirtualDeviceBusSlotOption paramVirtualDeviceBusSlotOption) {
    this.busSlotOption = paramVirtualDeviceBusSlotOption;
  }
  
  public String getControllerType() {
    return this.controllerType;
  }
  
  public void setControllerType(String paramString) {
    this.controllerType = paramString;
  }
  
  public BoolOption getAutoAssignController() {
    return this.autoAssignController;
  }
  
  public void setAutoAssignController(BoolOption paramBoolOption) {
    this.autoAssignController = paramBoolOption;
  }
  
  public List<VirtualDeviceBackingOption> getBackingOption() {
    if (this.backingOption == null)
      this.backingOption = new ArrayList<>(); 
    return this.backingOption;
  }
  
  public Integer getDefaultBackingOptionIndex() {
    return this.defaultBackingOptionIndex;
  }
  
  public void setDefaultBackingOptionIndex(Integer paramInteger) {
    this.defaultBackingOptionIndex = paramInteger;
  }
  
  public List<String> getLicensingLimit() {
    if (this.licensingLimit == null)
      this.licensingLimit = new ArrayList<>(); 
    return this.licensingLimit;
  }
  
  public boolean isDeprecated() {
    return this.deprecated;
  }
  
  public void setDeprecated(boolean paramBoolean) {
    this.deprecated = paramBoolean;
  }
  
  public boolean isPlugAndPlay() {
    return this.plugAndPlay;
  }
  
  public void setPlugAndPlay(boolean paramBoolean) {
    this.plugAndPlay = paramBoolean;
  }
  
  public Boolean isHotRemoveSupported() {
    return this.hotRemoveSupported;
  }
  
  public void setHotRemoveSupported(Boolean paramBoolean) {
    this.hotRemoveSupported = paramBoolean;
  }
}
