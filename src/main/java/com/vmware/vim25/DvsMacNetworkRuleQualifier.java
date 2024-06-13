package com.vmware.vim25;

import com.vmware.vim25.DvsMacNetworkRuleQualifier;
import com.vmware.vim25.DvsNetworkRuleQualifier;
import com.vmware.vim25.IntExpression;
import com.vmware.vim25.MacAddress;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsMacNetworkRuleQualifier", propOrder = {"sourceAddress", "destinationAddress", "protocol", "vlanId"})
public class DvsMacNetworkRuleQualifier extends DvsNetworkRuleQualifier {
  protected MacAddress sourceAddress;
  
  protected MacAddress destinationAddress;
  
  protected IntExpression protocol;
  
  protected IntExpression vlanId;
  
  public MacAddress getSourceAddress() {
    return this.sourceAddress;
  }
  
  public void setSourceAddress(MacAddress paramMacAddress) {
    this.sourceAddress = paramMacAddress;
  }
  
  public MacAddress getDestinationAddress() {
    return this.destinationAddress;
  }
  
  public void setDestinationAddress(MacAddress paramMacAddress) {
    this.destinationAddress = paramMacAddress;
  }
  
  public IntExpression getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(IntExpression paramIntExpression) {
    this.protocol = paramIntExpression;
  }
  
  public IntExpression getVlanId() {
    return this.vlanId;
  }
  
  public void setVlanId(IntExpression paramIntExpression) {
    this.vlanId = paramIntExpression;
  }
}
