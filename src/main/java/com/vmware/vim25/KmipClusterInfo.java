package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KmipClusterInfo;
import com.vmware.vim25.KmipServerInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmipClusterInfo", propOrder = {"clusterId", "servers", "useAsDefault", "managementType", "useAsEntityDefault"})
public class KmipClusterInfo extends DynamicData {
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  protected List<KmipServerInfo> servers;
  
  protected boolean useAsDefault;
  
  protected String managementType;
  
  protected List<ManagedObjectReference> useAsEntityDefault;
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
  
  public List<KmipServerInfo> getServers() {
    if (this.servers == null)
      this.servers = new ArrayList<>(); 
    return this.servers;
  }
  
  public boolean isUseAsDefault() {
    return this.useAsDefault;
  }
  
  public void setUseAsDefault(boolean paramBoolean) {
    this.useAsDefault = paramBoolean;
  }
  
  public String getManagementType() {
    return this.managementType;
  }
  
  public void setManagementType(String paramString) {
    this.managementType = paramString;
  }
  
  public List<ManagedObjectReference> getUseAsEntityDefault() {
    if (this.useAsEntityDefault == null)
      this.useAsEntityDefault = new ArrayList<>(); 
    return this.useAsEntityDefault;
  }
}
