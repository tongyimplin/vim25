package com.vmware.vim25;

import com.vmware.vim25.DVSRollbackCapability;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRollbackCapability", propOrder = {"rollbackSupported"})
public class DVSRollbackCapability extends DynamicData {
  protected boolean rollbackSupported;
  
  public boolean isRollbackSupported() {
    return this.rollbackSupported;
  }
  
  public void setRollbackSupported(boolean paramBoolean) {
    this.rollbackSupported = paramBoolean;
  }
}
