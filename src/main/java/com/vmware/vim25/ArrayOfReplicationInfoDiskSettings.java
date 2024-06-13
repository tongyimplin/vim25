package com.vmware.vim25;

import com.vmware.vim25.ArrayOfReplicationInfoDiskSettings;
import com.vmware.vim25.ReplicationInfoDiskSettings;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReplicationInfoDiskSettings", propOrder = {"replicationInfoDiskSettings"})
public class ArrayOfReplicationInfoDiskSettings {
  @XmlElement(name = "ReplicationInfoDiskSettings")
  protected List<ReplicationInfoDiskSettings> replicationInfoDiskSettings;
  
  public List<ReplicationInfoDiskSettings> getReplicationInfoDiskSettings() {
    if (this.replicationInfoDiskSettings == null)
      this.replicationInfoDiskSettings = new ArrayList<>(); 
    return this.replicationInfoDiskSettings;
  }
}
