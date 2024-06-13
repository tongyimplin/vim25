package com.vmware.vim25;

import com.vmware.vim25.FileInfo;
import com.vmware.vim25.TemplateConfigFileInfo;
import com.vmware.vim25.VmConfigFileEncryptionInfo;
import com.vmware.vim25.VmConfigFileInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFileInfo", propOrder = {"configVersion", "encryption"})
@XmlSeeAlso({TemplateConfigFileInfo.class})
public class VmConfigFileInfo extends FileInfo {
  protected Integer configVersion;
  
  protected VmConfigFileEncryptionInfo encryption;
  
  public Integer getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(Integer paramInteger) {
    this.configVersion = paramInteger;
  }
  
  public VmConfigFileEncryptionInfo getEncryption() {
    return this.encryption;
  }
  
  public void setEncryption(VmConfigFileEncryptionInfo paramVmConfigFileEncryptionInfo) {
    this.encryption = paramVmConfigFileEncryptionInfo;
  }
}
