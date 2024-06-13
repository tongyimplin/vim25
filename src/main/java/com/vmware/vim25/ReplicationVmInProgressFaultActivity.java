package com.vmware.vim25;

import com.vmware.vim25.ReplicationVmInProgressFaultActivity;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReplicationVmInProgressFaultActivity")
@XmlEnum
public enum ReplicationVmInProgressFaultActivity {
  FULL_SYNC("fullSync"),
  DELTA("delta");
  
  private final String value;
  
  ReplicationVmInProgressFaultActivity(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ReplicationVmInProgressFaultActivity fromValue(String paramString) {
    for (ReplicationVmInProgressFaultActivity replicationVmInProgressFaultActivity : values()) {
      if (replicationVmInProgressFaultActivity.value.equals(paramString))
        return replicationVmInProgressFaultActivity; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
