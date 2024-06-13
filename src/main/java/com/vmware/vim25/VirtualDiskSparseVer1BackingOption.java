package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceFileBackingOption;
import com.vmware.vim25.VirtualDiskSparseVer1BackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSparseVer1BackingOption", propOrder = {"diskModes", "split", "writeThrough", "growable"})
public class VirtualDiskSparseVer1BackingOption extends VirtualDeviceFileBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption diskModes;
  
  @XmlElement(required = true)
  protected BoolOption split;
  
  @XmlElement(required = true)
  protected BoolOption writeThrough;
  
  protected boolean growable;
  
  public ChoiceOption getDiskModes() {
    return this.diskModes;
  }
  
  public void setDiskModes(ChoiceOption paramChoiceOption) {
    this.diskModes = paramChoiceOption;
  }
  
  public BoolOption getSplit() {
    return this.split;
  }
  
  public void setSplit(BoolOption paramBoolOption) {
    this.split = paramBoolOption;
  }
  
  public BoolOption getWriteThrough() {
    return this.writeThrough;
  }
  
  public void setWriteThrough(BoolOption paramBoolOption) {
    this.writeThrough = paramBoolOption;
  }
  
  public boolean isGrowable() {
    return this.growable;
  }
  
  public void setGrowable(boolean paramBoolean) {
    this.growable = paramBoolean;
  }
}
