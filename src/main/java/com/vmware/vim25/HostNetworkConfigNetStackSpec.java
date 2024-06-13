package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetStackInstance;
import com.vmware.vim25.HostNetworkConfigNetStackSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkConfigNetStackSpec", propOrder = {"netStackInstance", "operation"})
public class HostNetworkConfigNetStackSpec extends DynamicData {
  @XmlElement(required = true)
  protected HostNetStackInstance netStackInstance;
  
  protected String operation;
  
  public HostNetStackInstance getNetStackInstance() {
    return this.netStackInstance;
  }
  
  public void setNetStackInstance(HostNetStackInstance paramHostNetStackInstance) {
    this.netStackInstance = paramHostNetStackInstance;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
