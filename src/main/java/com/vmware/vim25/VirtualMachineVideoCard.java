package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualMachineVideoCard;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVideoCard", propOrder = {"videoRamSizeInKB", "numDisplays", "useAutoDetect", "enable3DSupport", "use3DRenderer", "graphicsMemorySizeInKB"})
public class VirtualMachineVideoCard extends VirtualDevice {
  protected Long videoRamSizeInKB;
  
  protected Integer numDisplays;
  
  protected Boolean useAutoDetect;
  
  protected Boolean enable3DSupport;
  
  @XmlElement(name = "use3dRenderer")
  protected String use3DRenderer;
  
  protected Long graphicsMemorySizeInKB;
  
  public Long getVideoRamSizeInKB() {
    return this.videoRamSizeInKB;
  }
  
  public void setVideoRamSizeInKB(Long paramLong) {
    this.videoRamSizeInKB = paramLong;
  }
  
  public Integer getNumDisplays() {
    return this.numDisplays;
  }
  
  public void setNumDisplays(Integer paramInteger) {
    this.numDisplays = paramInteger;
  }
  
  public Boolean isUseAutoDetect() {
    return this.useAutoDetect;
  }
  
  public void setUseAutoDetect(Boolean paramBoolean) {
    this.useAutoDetect = paramBoolean;
  }
  
  public Boolean isEnable3DSupport() {
    return this.enable3DSupport;
  }
  
  public void setEnable3DSupport(Boolean paramBoolean) {
    this.enable3DSupport = paramBoolean;
  }
  
  public String getUse3DRenderer() {
    return this.use3DRenderer;
  }
  
  public void setUse3DRenderer(String paramString) {
    this.use3DRenderer = paramString;
  }
  
  public Long getGraphicsMemorySizeInKB() {
    return this.graphicsMemorySizeInKB;
  }
  
  public void setGraphicsMemorySizeInKB(Long paramLong) {
    this.graphicsMemorySizeInKB = paramLong;
  }
}
