package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCloneSpec", propOrder = {"location", "template", "config", "customization", "powerOn", "snapshot", "memory"})
public class VirtualMachineCloneSpec extends DynamicData {
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec location;
  
  protected boolean template;
  
  protected VirtualMachineConfigSpec config;
  
  protected CustomizationSpec customization;
  
  protected boolean powerOn;
  
  protected ManagedObjectReference snapshot;
  
  protected Boolean memory;
  
  public VirtualMachineRelocateSpec getLocation() {
    return this.location;
  }
  
  public void setLocation(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.location = paramVirtualMachineRelocateSpec;
  }
  
  public boolean isTemplate() {
    return this.template;
  }
  
  public void setTemplate(boolean paramBoolean) {
    this.template = paramBoolean;
  }
  
  public VirtualMachineConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.config = paramVirtualMachineConfigSpec;
  }
  
  public CustomizationSpec getCustomization() {
    return this.customization;
  }
  
  public void setCustomization(CustomizationSpec paramCustomizationSpec) {
    this.customization = paramCustomizationSpec;
  }
  
  public boolean isPowerOn() {
    return this.powerOn;
  }
  
  public void setPowerOn(boolean paramBoolean) {
    this.powerOn = paramBoolean;
  }
  
  public ManagedObjectReference getSnapshot() {
    return this.snapshot;
  }
  
  public void setSnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.snapshot = paramManagedObjectReference;
  }
  
  public Boolean isMemory() {
    return this.memory;
  }
  
  public void setMemory(Boolean paramBoolean) {
    this.memory = paramBoolean;
  }
}
