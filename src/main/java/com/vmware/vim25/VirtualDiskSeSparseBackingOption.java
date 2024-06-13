package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceFileBackingOption;
import com.vmware.vim25.VirtualDiskDeltaDiskFormatsSupported;
import com.vmware.vim25.VirtualDiskSeSparseBackingOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSeSparseBackingOption", propOrder = {"diskMode", "writeThrough", "growable", "hotGrowable", "uuid", "deltaDiskFormatsSupported"})
public class VirtualDiskSeSparseBackingOption extends VirtualDeviceFileBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption diskMode;
  
  @XmlElement(required = true)
  protected BoolOption writeThrough;
  
  protected boolean growable;
  
  protected boolean hotGrowable;
  
  protected boolean uuid;
  
  @XmlElement(required = true)
  protected List<VirtualDiskDeltaDiskFormatsSupported> deltaDiskFormatsSupported;
  
  public ChoiceOption getDiskMode() {
    return this.diskMode;
  }
  
  public void setDiskMode(ChoiceOption paramChoiceOption) {
    this.diskMode = paramChoiceOption;
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
  
  public List<VirtualDiskDeltaDiskFormatsSupported> getDeltaDiskFormatsSupported() {
    if (this.deltaDiskFormatsSupported == null)
      this.deltaDiskFormatsSupported = new ArrayList<>(); 
    return this.deltaDiskFormatsSupported;
  }
}
