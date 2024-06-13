package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VchaClusterRuntimeInfo;
import com.vmware.vim25.VchaNodeRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterRuntimeInfo", propOrder = {"clusterState", "nodeInfo", "clusterMode"})
public class VchaClusterRuntimeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String clusterState;
  
  protected List<VchaNodeRuntimeInfo> nodeInfo;
  
  @XmlElement(required = true)
  protected String clusterMode;
  
  public String getClusterState() {
    return this.clusterState;
  }
  
  public void setClusterState(String paramString) {
    this.clusterState = paramString;
  }
  
  public List<VchaNodeRuntimeInfo> getNodeInfo() {
    if (this.nodeInfo == null)
      this.nodeInfo = new ArrayList<>(); 
    return this.nodeInfo;
  }
  
  public String getClusterMode() {
    return this.clusterMode;
  }
  
  public void setClusterMode(String paramString) {
    this.clusterMode = paramString;
  }
}
