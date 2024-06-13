package com.vmware.vim25;

import com.vmware.vim25.HostDiskDimensionsLba;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.ScsiLun;
import com.vmware.vim25.VsanHostVsanDiskInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiDisk", propOrder = {"capacity", "devicePath", "ssd", "localDisk", "physicalLocation", "emulatedDIXDIFEnabled", "vsanDiskInfo", "scsiDiskType"})
public class HostScsiDisk extends ScsiLun {
  @XmlElement(required = true)
  protected HostDiskDimensionsLba capacity;
  
  @XmlElement(required = true)
  protected String devicePath;
  
  protected Boolean ssd;
  
  protected Boolean localDisk;
  
  protected List<String> physicalLocation;
  
  protected Boolean emulatedDIXDIFEnabled;
  
  protected VsanHostVsanDiskInfo vsanDiskInfo;
  
  protected String scsiDiskType;
  
  public HostDiskDimensionsLba getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(HostDiskDimensionsLba paramHostDiskDimensionsLba) {
    this.capacity = paramHostDiskDimensionsLba;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public Boolean isSsd() {
    return this.ssd;
  }
  
  public void setSsd(Boolean paramBoolean) {
    this.ssd = paramBoolean;
  }
  
  public Boolean isLocalDisk() {
    return this.localDisk;
  }
  
  public void setLocalDisk(Boolean paramBoolean) {
    this.localDisk = paramBoolean;
  }
  
  public List<String> getPhysicalLocation() {
    if (this.physicalLocation == null)
      this.physicalLocation = new ArrayList<>(); 
    return this.physicalLocation;
  }
  
  public Boolean isEmulatedDIXDIFEnabled() {
    return this.emulatedDIXDIFEnabled;
  }
  
  public void setEmulatedDIXDIFEnabled(Boolean paramBoolean) {
    this.emulatedDIXDIFEnabled = paramBoolean;
  }
  
  public VsanHostVsanDiskInfo getVsanDiskInfo() {
    return this.vsanDiskInfo;
  }
  
  public void setVsanDiskInfo(VsanHostVsanDiskInfo paramVsanHostVsanDiskInfo) {
    this.vsanDiskInfo = paramVsanHostVsanDiskInfo;
  }
  
  public String getScsiDiskType() {
    return this.scsiDiskType;
  }
  
  public void setScsiDiskType(String paramString) {
    this.scsiDiskType = paramString;
  }
}
