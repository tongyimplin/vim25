package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ReplicationInfoDiskSettings;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationInfoDiskSettings", propOrder = {"key", "diskReplicationId"})
public class ReplicationInfoDiskSettings extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected String diskReplicationId;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getDiskReplicationId() {
    return this.diskReplicationId;
  }
  
  public void setDiskReplicationId(String paramString) {
    this.diskReplicationId = paramString;
  }
}
