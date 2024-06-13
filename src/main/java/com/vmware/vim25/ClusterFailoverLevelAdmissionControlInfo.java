package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverLevelAdmissionControlInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverLevelAdmissionControlInfo", propOrder = {"currentFailoverLevel"})
public class ClusterFailoverLevelAdmissionControlInfo extends ClusterDasAdmissionControlInfo {
  protected int currentFailoverLevel;
  
  public int getCurrentFailoverLevel() {
    return this.currentFailoverLevel;
  }
  
  public void setCurrentFailoverLevel(int paramInt) {
    this.currentFailoverLevel = paramInt;
  }
}
