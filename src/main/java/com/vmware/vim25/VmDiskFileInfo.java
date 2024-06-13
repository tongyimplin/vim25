package com.vmware.vim25;

import com.vmware.vim25.FileInfo;
import com.vmware.vim25.VmDiskFileEncryptionInfo;
import com.vmware.vim25.VmDiskFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileInfo", propOrder = {"diskType", "capacityKb", "hardwareVersion", "controllerType", "diskExtents", "thin", "encryption"})
public class VmDiskFileInfo extends FileInfo {
  protected String diskType;
  
  protected Long capacityKb;
  
  protected Integer hardwareVersion;
  
  protected String controllerType;
  
  protected List<String> diskExtents;
  
  protected Boolean thin;
  
  protected VmDiskFileEncryptionInfo encryption;
  
  public String getDiskType() {
    return this.diskType;
  }
  
  public void setDiskType(String paramString) {
    this.diskType = paramString;
  }
  
  public Long getCapacityKb() {
    return this.capacityKb;
  }
  
  public void setCapacityKb(Long paramLong) {
    this.capacityKb = paramLong;
  }
  
  public Integer getHardwareVersion() {
    return this.hardwareVersion;
  }
  
  public void setHardwareVersion(Integer paramInteger) {
    this.hardwareVersion = paramInteger;
  }
  
  public String getControllerType() {
    return this.controllerType;
  }
  
  public void setControllerType(String paramString) {
    this.controllerType = paramString;
  }
  
  public List<String> getDiskExtents() {
    if (this.diskExtents == null)
      this.diskExtents = new ArrayList<>(); 
    return this.diskExtents;
  }
  
  public Boolean isThin() {
    return this.thin;
  }
  
  public void setThin(Boolean paramBoolean) {
    this.thin = paramBoolean;
  }
  
  public VmDiskFileEncryptionInfo getEncryption() {
    return this.encryption;
  }
  
  public void setEncryption(VmDiskFileEncryptionInfo paramVmDiskFileEncryptionInfo) {
    this.encryption = paramVmDiskFileEncryptionInfo;
  }
}
