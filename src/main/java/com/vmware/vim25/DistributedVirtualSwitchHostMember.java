package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMember;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberRuntimeState;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMember", propOrder = {"runtimeState", "config", "productInfo", "uplinkPortKey", "status", "statusDetail"})
public class DistributedVirtualSwitchHostMember extends DynamicData {
  protected DistributedVirtualSwitchHostMemberRuntimeState runtimeState;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchHostMemberConfigInfo config;
  
  protected DistributedVirtualSwitchProductSpec productInfo;
  
  protected List<String> uplinkPortKey;
  
  @XmlElement(required = true)
  protected String status;
  
  protected String statusDetail;
  
  public DistributedVirtualSwitchHostMemberRuntimeState getRuntimeState() {
    return this.runtimeState;
  }
  
  public void setRuntimeState(DistributedVirtualSwitchHostMemberRuntimeState paramDistributedVirtualSwitchHostMemberRuntimeState) {
    this.runtimeState = paramDistributedVirtualSwitchHostMemberRuntimeState;
  }
  
  public DistributedVirtualSwitchHostMemberConfigInfo getConfig() {
    return this.config;
  }
  
  public void setConfig(DistributedVirtualSwitchHostMemberConfigInfo paramDistributedVirtualSwitchHostMemberConfigInfo) {
    this.config = paramDistributedVirtualSwitchHostMemberConfigInfo;
  }
  
  public DistributedVirtualSwitchProductSpec getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productInfo = paramDistributedVirtualSwitchProductSpec;
  }
  
  public List<String> getUplinkPortKey() {
    if (this.uplinkPortKey == null)
      this.uplinkPortKey = new ArrayList<>(); 
    return this.uplinkPortKey;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public String getStatusDetail() {
    return this.statusDetail;
  }
  
  public void setStatusDetail(String paramString) {
    this.statusDetail = paramString;
  }
}
