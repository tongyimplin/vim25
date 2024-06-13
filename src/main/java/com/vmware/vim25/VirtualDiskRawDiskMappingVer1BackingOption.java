package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskMappingVer1BackingOption", propOrder = {"descriptorFileNameExtensions", "compatibilityMode", "diskMode", "uuid"})
public class VirtualDiskRawDiskMappingVer1BackingOption extends VirtualDeviceDeviceBackingOption {
  protected ChoiceOption descriptorFileNameExtensions;
  
  @XmlElement(required = true)
  protected ChoiceOption compatibilityMode;
  
  @XmlElement(required = true)
  protected ChoiceOption diskMode;
  
  protected boolean uuid;
  
  public ChoiceOption getDescriptorFileNameExtensions() {
    return this.descriptorFileNameExtensions;
  }
  
  public void setDescriptorFileNameExtensions(ChoiceOption paramChoiceOption) {
    this.descriptorFileNameExtensions = paramChoiceOption;
  }
  
  public ChoiceOption getCompatibilityMode() {
    return this.compatibilityMode;
  }
  
  public void setCompatibilityMode(ChoiceOption paramChoiceOption) {
    this.compatibilityMode = paramChoiceOption;
  }
  
  public ChoiceOption getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(ChoiceOption paramChoiceOption) {
    this.diskMode = paramChoiceOption;
  }
  
  public boolean isUuid() {
    return this.uuid;
  }
  
  public void setUuid(boolean paramBoolean) {
    this.uuid = paramBoolean;
  }
}
