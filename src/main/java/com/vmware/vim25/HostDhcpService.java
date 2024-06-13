package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDhcpService;
import com.vmware.vim25.HostDhcpServiceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDhcpService", propOrder = {"key", "spec"})
public class HostDhcpService extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected HostDhcpServiceSpec spec;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public HostDhcpServiceSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDhcpServiceSpec paramHostDhcpServiceSpec) {
    this.spec = paramHostDhcpServiceSpec;
  }
}
