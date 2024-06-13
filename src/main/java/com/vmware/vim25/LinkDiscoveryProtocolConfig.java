package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LinkDiscoveryProtocolConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkDiscoveryProtocolConfig", propOrder = {"protocol", "operation"})
public class LinkDiscoveryProtocolConfig extends DynamicData {
  @XmlElement(required = true)
  protected String protocol;
  
  @XmlElement(required = true)
  protected String operation;
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(String paramString) {
    this.protocol = paramString;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
