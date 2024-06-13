package com.vmware.vim25;

import com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverHostAdmissionControlInfoHostStatus", propOrder = {"host", "status"})
public class ClusterFailoverHostAdmissionControlInfoHostStatus extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus status;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
}
