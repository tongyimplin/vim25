package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFlagInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFlagInfo", propOrder = {"backgroundSnapshotsEnabled"})
public class HostFlagInfo extends DynamicData {
  protected Boolean backgroundSnapshotsEnabled;
  
  public Boolean isBackgroundSnapshotsEnabled() {
    return this.backgroundSnapshotsEnabled;
  }
  
  public void setBackgroundSnapshotsEnabled(Boolean paramBoolean) {
    this.backgroundSnapshotsEnabled = paramBoolean;
  }
}
