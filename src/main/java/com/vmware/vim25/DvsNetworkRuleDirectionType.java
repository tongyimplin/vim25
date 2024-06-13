package com.vmware.vim25;

import com.vmware.vim25.DvsNetworkRuleDirectionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DvsNetworkRuleDirectionType")
@XmlEnum
public enum DvsNetworkRuleDirectionType {
  INCOMING_PACKETS("incomingPackets"),
  OUTGOING_PACKETS("outgoingPackets"),
  BOTH("both");
  
  private final String value;
  
  DvsNetworkRuleDirectionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DvsNetworkRuleDirectionType fromValue(String paramString) {
    for (DvsNetworkRuleDirectionType dvsNetworkRuleDirectionType : values()) {
      if (dvsNetworkRuleDirectionType.value.equals(paramString))
        return dvsNetworkRuleDirectionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
