package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemReconnectSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemReconnectSpec", propOrder = {"syncState"})
public class HostSystemReconnectSpec extends DynamicData {
  protected Boolean syncState;
  
  public Boolean isSyncState() {
    return this.syncState;
  }
  
  public void setSyncState(Boolean paramBoolean) {
    this.syncState = paramBoolean;
  }
}
