package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostClusterStatus;
import com.vmware.vim25.VsanHostClusterStatusState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostClusterStatus", propOrder = {"uuid", "nodeUuid", "health", "nodeState", "memberUuid"})
public class VsanHostClusterStatus extends DynamicData {
  protected String uuid;
  
  protected String nodeUuid;
  
  @XmlElement(required = true)
  protected String health;
  
  @XmlElement(required = true)
  protected VsanHostClusterStatusState nodeState;
  
  protected List<String> memberUuid;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getNodeUuid() {
    return this.nodeUuid;
  }
  
  public void setNodeUuid(String paramString) {
    this.nodeUuid = paramString;
  }
  
  public String getHealth() {
    return this.health;
  }
  
  public void setHealth(String paramString) {
    this.health = paramString;
  }
  
  public VsanHostClusterStatusState getNodeState() {
    return this.nodeState;
  }
  
  public void setNodeState(VsanHostClusterStatusState paramVsanHostClusterStatusState) {
    this.nodeState = paramVsanHostClusterStatusState;
  }
  
  public List<String> getMemberUuid() {
    if (this.memberUuid == null)
      this.memberUuid = new ArrayList<>(); 
    return this.memberUuid;
  }
}
