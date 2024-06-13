package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverHostAdmissionControlPolicy;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverHostAdmissionControlPolicy", propOrder = {"failoverHosts", "failoverLevel"})
public class ClusterFailoverHostAdmissionControlPolicy extends ClusterDasAdmissionControlPolicy {
  protected List<ManagedObjectReference> failoverHosts;
  
  protected Integer failoverLevel;
  
  public List<ManagedObjectReference> getFailoverHosts() {
    if (this.failoverHosts == null)
      this.failoverHosts = new ArrayList<>(); 
    return this.failoverHosts;
  }
  
  public Integer getFailoverLevel() {
    return this.failoverLevel;
  }
  
  public void setFailoverLevel(Integer paramInteger) {
    this.failoverLevel = paramInteger;
  }
}
