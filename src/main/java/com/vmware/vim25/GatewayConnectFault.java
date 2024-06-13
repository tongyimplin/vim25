package com.vmware.vim25;

import com.vmware.vim25.GatewayConnectFault;
import com.vmware.vim25.GatewayNotFound;
import com.vmware.vim25.GatewayNotReachable;
import com.vmware.vim25.GatewayOperationRefused;
import com.vmware.vim25.GatewayToHostConnectFault;
import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.LocalizableMessage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayConnectFault", propOrder = {"gatewayType", "gatewayId", "gatewayInfo", "details"})
@XmlSeeAlso({GatewayNotFound.class, GatewayOperationRefused.class, GatewayNotReachable.class, GatewayToHostConnectFault.class})
public class GatewayConnectFault extends HostConnectFault {
  @XmlElement(required = true)
  protected String gatewayType;
  
  @XmlElement(required = true)
  protected String gatewayId;
  
  @XmlElement(required = true)
  protected String gatewayInfo;
  
  protected LocalizableMessage details;
  
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
  
  public String getGatewayInfo() {
    return this.gatewayInfo;
  }
  
  public void setGatewayInfo(String paramString) {
    this.gatewayInfo = paramString;
  }
  
  public LocalizableMessage getDetails() {
    return this.details;
  }
  
  public void setDetails(LocalizableMessage paramLocalizableMessage) {
    this.details = paramLocalizableMessage;
  }
}
