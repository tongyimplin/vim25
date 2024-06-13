package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostUnresolvedVmfsExtent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsExtent", propOrder = {"device", "devicePath", "vmfsUuid", "isHeadExtent", "ordinal", "startBlock", "endBlock", "reason"})
public class HostUnresolvedVmfsExtent extends DynamicData {
  @XmlElement(required = true)
  protected HostScsiDiskPartition device;
  
  @XmlElement(required = true)
  protected String devicePath;
  
  @XmlElement(required = true)
  protected String vmfsUuid;
  
  protected boolean isHeadExtent;
  
  protected int ordinal;
  
  protected int startBlock;
  
  protected int endBlock;
  
  @XmlElement(required = true)
  protected String reason;
  
  public HostScsiDiskPartition getDevice() {
    return this.device;
  }
  
  public void setDevice(HostScsiDiskPartition paramHostScsiDiskPartition) {
    this.device = paramHostScsiDiskPartition;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public String getVmfsUuid() {
    return this.vmfsUuid;
  }
  
  public void setVmfsUuid(String paramString) {
    this.vmfsUuid = paramString;
  }
  
  public boolean isIsHeadExtent() {
    return this.isHeadExtent;
  }
  
  public void setIsHeadExtent(boolean paramBoolean) {
    this.isHeadExtent = paramBoolean;
  }
  
  public int getOrdinal() {
    return this.ordinal;
  }
  
  public void setOrdinal(int paramInt) {
    this.ordinal = paramInt;
  }
  
  public int getStartBlock() {
    return this.startBlock;
  }
  
  public void setStartBlock(int paramInt) {
    this.startBlock = paramInt;
  }
  
  public int getEndBlock() {
    return this.endBlock;
  }
  
  public void setEndBlock(int paramInt) {
    this.endBlock = paramInt;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
