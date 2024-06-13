package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ScsiLunCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLunCapabilities", propOrder = {"updateDisplayNameSupported"})
public class ScsiLunCapabilities extends DynamicData {
  protected boolean updateDisplayNameSupported;
  
  public boolean isUpdateDisplayNameSupported() {
    return this.updateDisplayNameSupported;
  }
  
  public void setUpdateDisplayNameSupported(boolean paramBoolean) {
    this.updateDisplayNameSupported = paramBoolean;
  }
}
