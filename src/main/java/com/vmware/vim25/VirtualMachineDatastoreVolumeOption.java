package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDatastoreVolumeOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDatastoreVolumeOption", propOrder = {"fileSystemType", "majorVersion"})
public class VirtualMachineDatastoreVolumeOption extends DynamicData {
  @XmlElement(required = true)
  protected String fileSystemType;
  
  protected Integer majorVersion;
  
  public String getFileSystemType() {
    return this.fileSystemType;
  }
  
  public void setFileSystemType(String paramString) {
    this.fileSystemType = paramString;
  }
  
  public Integer getMajorVersion() {
    return this.majorVersion;
  }
  
  public void setMajorVersion(Integer paramInteger) {
    this.majorVersion = paramInteger;
  }
}
