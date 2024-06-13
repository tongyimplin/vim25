package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceFileBackingOption;
import com.vmware.vim25.VirtualDiskSparseVer2BackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSparseVer2BackingOption", propOrder = {"diskMode", "split", "writeThrough", "growable", "hotGrowable", "uuid"})
public class VirtualDiskSparseVer2BackingOption extends VirtualDeviceFileBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption diskMode;
  
  @XmlElement(required = true)
  protected BoolOption split;
  
  @XmlElement(required = true)
  protected BoolOption writeThrough;
  
  protected boolean growable;
  
  protected boolean hotGrowable;
  
  protected boolean uuid;
  
  public ChoiceOption getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(ChoiceOption paramChoiceOption) {
    this.diskMode = paramChoiceOption;
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
  
  public boolean isHotGrowable() {
    return this.hotGrowable;
  }
  
  public void setHotGrowable(boolean paramBoolean) {
    this.hotGrowable = paramBoolean;
  }
  
  public boolean isUuid() {
    return this.uuid;
  }
  
  public void setUuid(boolean paramBoolean) {
    this.uuid = paramBoolean;
  }
}
