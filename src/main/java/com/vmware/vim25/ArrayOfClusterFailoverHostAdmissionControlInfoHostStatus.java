package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus;
import com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus", propOrder = {"clusterFailoverHostAdmissionControlInfoHostStatus"})
public class ArrayOfClusterFailoverHostAdmissionControlInfoHostStatus {
  @XmlElement(name = "ClusterFailoverHostAdmissionControlInfoHostStatus")
  protected List<ClusterFailoverHostAdmissionControlInfoHostStatus> clusterFailoverHostAdmissionControlInfoHostStatus;
  
  public List<ClusterFailoverHostAdmissionControlInfoHostStatus> getClusterFailoverHostAdmissionControlInfoHostStatus() {
    if (this.clusterFailoverHostAdmissionControlInfoHostStatus == null)
      this.clusterFailoverHostAdmissionControlInfoHostStatus = new ArrayList<>(); 
    return this.clusterFailoverHostAdmissionControlInfoHostStatus;
  }
}
