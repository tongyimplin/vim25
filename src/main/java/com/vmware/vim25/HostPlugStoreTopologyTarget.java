package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlugStoreTopologyTarget;
import com.vmware.vim25.HostTargetTransport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopologyTarget", propOrder = {"key", "transport"})
public class HostPlugStoreTopologyTarget extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected HostTargetTransport transport;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public HostTargetTransport getTransport() {
    return this.transport;
  }
  
  public void setTransport(HostTargetTransport paramHostTargetTransport) {
    this.transport = paramHostTargetTransport;
  }
}
