package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmConfigFileQueryFlags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFileQueryFlags", propOrder = {"configVersion", "encryption"})
public class VmConfigFileQueryFlags extends DynamicData {
  protected boolean configVersion;
  
  protected Boolean encryption;
  
  public boolean isConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(boolean paramBoolean) {
    this.configVersion = paramBoolean;
  }
  
  public Boolean isEncryption() {
    return this.encryption;
  }
  
  public void setEncryption(Boolean paramBoolean) {
    this.encryption = paramBoolean;
  }
}
