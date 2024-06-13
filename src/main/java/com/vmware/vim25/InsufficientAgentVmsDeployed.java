package com.vmware.vim25;

import com.vmware.vim25.InsufficientAgentVmsDeployed;
import com.vmware.vim25.InsufficientResourcesFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientAgentVmsDeployed", propOrder = {"hostName", "requiredNumAgentVms", "currentNumAgentVms"})
public class InsufficientAgentVmsDeployed extends InsufficientResourcesFault {
  @XmlElement(required = true)
  protected String hostName;
  
  protected int requiredNumAgentVms;
  
  protected int currentNumAgentVms;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public int getRequiredNumAgentVms() {
    return this.requiredNumAgentVms;
  }
  
  public void setRequiredNumAgentVms(int paramInt) {
    this.requiredNumAgentVms = paramInt;
  }
  
  public int getCurrentNumAgentVms() {
    return this.currentNumAgentVms;
  }
  
  public void setCurrentNumAgentVms(int paramInt) {
    this.currentNumAgentVms = paramInt;
  }
}
