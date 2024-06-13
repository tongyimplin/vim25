package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import com.vmware.vim25.VirtualDiskPartitionedRawDiskVer2BackingOption;
import com.vmware.vim25.VirtualDiskRawDiskVer2BackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskVer2BackingOption", propOrder = {"descriptorFileNameExtensions", "uuid"})
@XmlSeeAlso({VirtualDiskPartitionedRawDiskVer2BackingOption.class})
public class VirtualDiskRawDiskVer2BackingOption extends VirtualDeviceDeviceBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption descriptorFileNameExtensions;
  
  protected boolean uuid;
  
  public ChoiceOption getDescriptorFileNameExtensions() {
    return this.descriptorFileNameExtensions;
  }
  
  public void setDescriptorFileNameExtensions(ChoiceOption paramChoiceOption) {
    this.descriptorFileNameExtensions = paramChoiceOption;
  }
  
  public boolean isUuid() {
    return this.uuid;
  }
  
  public void setUuid(boolean paramBoolean) {
    this.uuid = paramBoolean;
  }
}
