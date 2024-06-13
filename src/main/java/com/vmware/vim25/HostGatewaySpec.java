package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostGatewaySpec;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGatewaySpec", propOrder = {"gatewayType", "gatewayId", "trustVerificationToken", "hostAuthParams"})
public class HostGatewaySpec extends DynamicData {
  @XmlElement(required = true)
  protected String gatewayType;
  
  protected String gatewayId;
  
  protected String trustVerificationToken;
  
  protected List<KeyValue> hostAuthParams;
  
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
  
  public String getTrustVerificationToken() {
    return this.trustVerificationToken;
  }
  
  public void setTrustVerificationToken(String paramString) {
    this.trustVerificationToken = paramString;
  }
  
  public List<KeyValue> getHostAuthParams() {
    if (this.hostAuthParams == null)
      this.hostAuthParams = new ArrayList<>(); 
    return this.hostAuthParams;
  }
}
