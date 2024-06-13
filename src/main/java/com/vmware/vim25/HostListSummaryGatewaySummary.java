package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostListSummaryGatewaySummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostListSummaryGatewaySummary", propOrder = {"gatewayType", "gatewayId"})
public class HostListSummaryGatewaySummary extends DynamicData {
  @XmlElement(required = true)
  protected String gatewayType;
  
  @XmlElement(required = true)
  protected String gatewayId;
  
  public String getGatewayType() {
    return this.gatewayType;
  }
  
  public void setGatewayType(String paramString) {
    this.gatewayType = paramString;
  }
  
  public String getGatewayId() {
    return this.gatewayId;
  }
  
  public void setGatewayId(String paramString) {
    this.gatewayId = paramString;
  }
}
