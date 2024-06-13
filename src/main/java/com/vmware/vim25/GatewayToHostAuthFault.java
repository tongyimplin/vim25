package com.vmware.vim25;

import com.vmware.vim25.GatewayToHostAuthFault;
import com.vmware.vim25.GatewayToHostConnectFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayToHostAuthFault", propOrder = {"invalidProperties", "missingProperties"})
public class GatewayToHostAuthFault extends GatewayToHostConnectFault {
  @XmlElement(required = true)
  protected List<String> invalidProperties;
  
  @XmlElement(required = true)
  protected List<String> missingProperties;
  
  public List<String> getInvalidProperties() {
    if (this.invalidProperties == null)
      this.invalidProperties = new ArrayList<>(); 
    return this.invalidProperties;
  }
  
  public List<String> getMissingProperties() {
    if (this.missingProperties == null)
      this.missingProperties = new ArrayList<>(); 
    return this.missingProperties;
  }
}
