package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.IntOption;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualVideoCardOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVideoCardOption", propOrder = {"videoRamSizeInKB", "numDisplays", "useAutoDetect", "support3D", "use3DRendererSupported", "graphicsMemorySizeInKB", "graphicsMemorySizeSupported"})
public class VirtualVideoCardOption extends VirtualDeviceOption {
  protected LongOption videoRamSizeInKB;
  
  protected IntOption numDisplays;
  
  protected BoolOption useAutoDetect;
  
  protected BoolOption support3D;
  
  @XmlElement(name = "use3dRendererSupported")
  protected BoolOption use3DRendererSupported;
  
  protected LongOption graphicsMemorySizeInKB;
  
  protected BoolOption graphicsMemorySizeSupported;
  
  public LongOption getVideoRamSizeInKB() {
    return this.videoRamSizeInKB;
  }
  
  public void setVideoRamSizeInKB(LongOption paramLongOption) {
    this.videoRamSizeInKB = paramLongOption;
  }
  
  public IntOption getNumDisplays() {
    return this.numDisplays;
  }
  
  public void setNumDisplays(IntOption paramIntOption) {
    this.numDisplays = paramIntOption;
  }
  
  public BoolOption getUseAutoDetect() {
    return this.useAutoDetect;
  }
  
  public void setUseAutoDetect(BoolOption paramBoolOption) {
    this.useAutoDetect = paramBoolOption;
  }
  
  public BoolOption getSupport3D() {
    return this.support3D;
  }
  
  public void setSupport3D(BoolOption paramBoolOption) {
    this.support3D = paramBoolOption;
  }
  
  public BoolOption getUse3DRendererSupported() {
    return this.use3DRendererSupported;
  }
  
  public void setUse3DRendererSupported(BoolOption paramBoolOption) {
    this.use3DRendererSupported = paramBoolOption;
  }
  
  public LongOption getGraphicsMemorySizeInKB() {
    return this.graphicsMemorySizeInKB;
  }
  
  public void setGraphicsMemorySizeInKB(LongOption paramLongOption) {
    this.graphicsMemorySizeInKB = paramLongOption;
  }
  
  public BoolOption getGraphicsMemorySizeSupported() {
    return this.graphicsMemorySizeSupported;
  }
  
  public void setGraphicsMemorySizeSupported(BoolOption paramBoolOption) {
    this.graphicsMemorySizeSupported = paramBoolOption;
  }
}
