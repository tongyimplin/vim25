package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeDisconnectSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDisconnectSpec", propOrder = {"hbaName", "subnqn", "controllerNumber"})
public class HostNvmeDisconnectSpec extends DynamicData {
  @XmlElement(required = true)
  protected String hbaName;
  
  protected String subnqn;
  
  protected Integer controllerNumber;
  
  public String getHbaName() {
    return this.hbaName;
  }
  
  public void setHbaName(String paramString) {
    this.hbaName = paramString;
  }
  
  public String getSubnqn() {
    return this.subnqn;
  }
  
  public void setSubnqn(String paramString) {
    this.subnqn = paramString;
  }
  
  public Integer getControllerNumber() {
    return this.controllerNumber;
  }
  
  public void setControllerNumber(Integer paramInteger) {
    this.controllerNumber = paramInteger;
  }
}
