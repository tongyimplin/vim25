package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ReplicationGroupId;
import com.vmware.vim25.ReplicationSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSpec", propOrder = {"replicationGroupId"})
public class ReplicationSpec extends DynamicData {
  @XmlElement(required = true)
  protected ReplicationGroupId replicationGroupId;
  
  public ReplicationGroupId getReplicationGroupId() {
    return this.replicationGroupId;
  }
  
  public void setReplicationGroupId(ReplicationGroupId paramReplicationGroupId) {
    this.replicationGroupId = paramReplicationGroupId;
  }
}
