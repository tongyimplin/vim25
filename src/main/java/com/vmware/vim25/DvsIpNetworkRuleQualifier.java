package com.vmware.vim25;

import com.vmware.vim25.DvsIpNetworkRuleQualifier;
import com.vmware.vim25.DvsIpPort;
import com.vmware.vim25.DvsNetworkRuleQualifier;
import com.vmware.vim25.IntExpression;
import com.vmware.vim25.IpAddress;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsIpNetworkRuleQualifier", propOrder = {"sourceAddress", "destinationAddress", "protocol", "sourceIpPort", "destinationIpPort", "tcpFlags"})
public class DvsIpNetworkRuleQualifier extends DvsNetworkRuleQualifier {
  protected IpAddress sourceAddress;
  
  protected IpAddress destinationAddress;
  
  protected IntExpression protocol;
  
  protected DvsIpPort sourceIpPort;
  
  protected DvsIpPort destinationIpPort;
  
  protected IntExpression tcpFlags;
  
  public IpAddress getSourceAddress() {
    return this.sourceAddress;
  }
  
  public void setSourceAddress(IpAddress paramIpAddress) {
    this.sourceAddress = paramIpAddress;
  }
  
  public IpAddress getDestinationAddress() {
    return this.destinationAddress;
  }
  
  public void setDestinationAddress(IpAddress paramIpAddress) {
    this.destinationAddress = paramIpAddress;
  }
  
  public IntExpression getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(IntExpression paramIntExpression) {
    this.protocol = paramIntExpression;
  }
  
  public DvsIpPort getSourceIpPort() {
    return this.sourceIpPort;
  }
  
  public void setSourceIpPort(DvsIpPort paramDvsIpPort) {
    this.sourceIpPort = paramDvsIpPort;
  }
  
  public DvsIpPort getDestinationIpPort() {
    return this.destinationIpPort;
  }
  
  public void setDestinationIpPort(DvsIpPort paramDvsIpPort) {
    this.destinationIpPort = paramDvsIpPort;
  }
  
  public IntExpression getTcpFlags() {
    return this.tcpFlags;
  }
  
  public void setTcpFlags(IntExpression paramIntExpression) {
    this.tcpFlags = paramIntExpression;
  }
}
