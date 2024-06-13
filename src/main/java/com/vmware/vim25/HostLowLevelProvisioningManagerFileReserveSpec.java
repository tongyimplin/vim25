package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileReserveSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerFileReserveSpec", propOrder = {"baseName", "parentDir", "fileType", "storageProfile"})
public class HostLowLevelProvisioningManagerFileReserveSpec extends DynamicData {
  @XmlElement(required = true)
  protected String baseName;
  
  @XmlElement(required = true)
  protected String parentDir;
  
  @XmlElement(required = true)
  protected String fileType;
  
  @XmlElement(required = true)
  protected String storageProfile;
  
  public String getBaseName() {
    return this.baseName;
  }
  
  public void setBaseName(String paramString) {
    this.baseName = paramString;
  }
  
  public String getParentDir() {
    return this.parentDir;
  }
  
  public void setParentDir(String paramString) {
    this.parentDir = paramString;
  }
  
  public String getFileType() {
    return this.fileType;
  }
  
  public void setFileType(String paramString) {
    this.fileType = paramString;
  }
  
  public String getStorageProfile() {
    return this.storageProfile;
  }
  
  public void setStorageProfile(String paramString) {
    this.storageProfile = paramString;
  }
}
