package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNatService;
import com.vmware.vim25.HostNatServiceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatService", propOrder = {"key", "spec"})
public class HostNatService extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected HostNatServiceSpec spec;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public HostNatServiceSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostNatServiceSpec paramHostNatServiceSpec) {
    this.spec = paramHostNatServiceSpec;
  }
}
