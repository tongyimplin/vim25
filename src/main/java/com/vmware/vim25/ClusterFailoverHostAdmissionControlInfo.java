package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverHostAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverHostAdmissionControlInfo", propOrder = {"hostStatus"})
public class ClusterFailoverHostAdmissionControlInfo extends ClusterDasAdmissionControlInfo {
  protected List<ClusterFailoverHostAdmissionControlInfoHostStatus> hostStatus;
  
  public List<ClusterFailoverHostAdmissionControlInfoHostStatus> getHostStatus() {
    if (this.hostStatus == null)
      this.hostStatus = new ArrayList<>(); 
    return this.hostStatus;
  }
}
