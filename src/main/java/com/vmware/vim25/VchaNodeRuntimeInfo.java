package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VchaNodeRuntimeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaNodeRuntimeInfo", propOrder = {"nodeState", "nodeRole", "nodeIp"})
public class VchaNodeRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String nodeState;
  
  @XmlElement(required = true)
  protected String nodeRole;
  
  @XmlElement(required = true)
  protected String nodeIp;
  
  public String getNodeState() {
    return this.nodeState;
  }
  
  public void setNodeState(String paramString) {
    this.nodeState = paramString;
  }
  
  public String getNodeRole() {
    return this.nodeRole;
  }
  
  public void setNodeRole(String paramString) {
    this.nodeRole = paramString;
  }
  
  public String getNodeIp() {
    return this.nodeIp;
  }
  
  public void setNodeIp(String paramString) {
    this.nodeIp = paramString;
  }
}
