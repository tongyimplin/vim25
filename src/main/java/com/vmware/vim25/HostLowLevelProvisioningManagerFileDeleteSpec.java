package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerFileDeleteSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerFileDeleteSpec", propOrder = {"fileName", "fileType"})
public class HostLowLevelProvisioningManagerFileDeleteSpec extends DynamicData {
  @XmlElement(required = true)
  protected String fileName;
  
  @XmlElement(required = true)
  protected String fileType;
  
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(String paramString) {
    this.fileName = paramString;
  }
  
  public String getFileType() {
    return this.fileType;
  }
  
  public void setFileType(String paramString) {
    this.fileType = paramString;
  }
}
