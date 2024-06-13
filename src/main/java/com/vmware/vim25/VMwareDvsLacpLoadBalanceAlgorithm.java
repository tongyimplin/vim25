package com.vmware.vim25;

import com.vmware.vim25.VMwareDvsLacpLoadBalanceAlgorithm;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDvsLacpLoadBalanceAlgorithm")
@XmlEnum
public enum VMwareDvsLacpLoadBalanceAlgorithm {
  SRC_MAC("srcMac"),
  DEST_MAC("destMac"),
  SRC_DEST_MAC("srcDestMac"),
  DEST_IP_VLAN("destIpVlan"),
  SRC_IP_VLAN("srcIpVlan"),
  SRC_DEST_IP_VLAN("srcDestIpVlan"),
  DEST_TCP_UDP_PORT("destTcpUdpPort"),
  SRC_TCP_UDP_PORT("srcTcpUdpPort"),
  SRC_DEST_TCP_UDP_PORT("srcDestTcpUdpPort"),
  DEST_IP_TCP_UDP_PORT("destIpTcpUdpPort"),
  SRC_IP_TCP_UDP_PORT("srcIpTcpUdpPort"),
  SRC_DEST_IP_TCP_UDP_PORT("srcDestIpTcpUdpPort"),
  DEST_IP_TCP_UDP_PORT_VLAN("destIpTcpUdpPortVlan"),
  SRC_IP_TCP_UDP_PORT_VLAN("srcIpTcpUdpPortVlan"),
  SRC_DEST_IP_TCP_UDP_PORT_VLAN("srcDestIpTcpUdpPortVlan"),
  DEST_IP("destIp"),
  SRC_IP("srcIp"),
  SRC_DEST_IP("srcDestIp"),
  VLAN("vlan"),
  SRC_PORT_ID("srcPortId");
  
  private final String value;
  
  VMwareDvsLacpLoadBalanceAlgorithm(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDvsLacpLoadBalanceAlgorithm fromValue(String paramString) {
    for (VMwareDvsLacpLoadBalanceAlgorithm vMwareDvsLacpLoadBalanceAlgorithm : values()) {
      if (vMwareDvsLacpLoadBalanceAlgorithm.value.equals(paramString))
        return vMwareDvsLacpLoadBalanceAlgorithm; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
