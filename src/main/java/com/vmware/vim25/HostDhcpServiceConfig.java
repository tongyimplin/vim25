package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDhcpServiceConfig;
import com.vmware.vim25.HostDhcpServiceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDhcpServiceConfig", propOrder = {"changeOperation", "key", "spec"})
public class HostDhcpServiceConfig extends DynamicData {
  protected String changeOperation;
  
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected HostDhcpServiceSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
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
