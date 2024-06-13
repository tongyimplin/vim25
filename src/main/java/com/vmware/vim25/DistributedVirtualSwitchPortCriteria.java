package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortCriteria;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchPortCriteria", propOrder = {"connected", "active", "uplinkPort", "nsxPort", "scope", "portgroupKey", "inside", "portKey", "host"})
public class DistributedVirtualSwitchPortCriteria extends DynamicData {
  protected Boolean connected;
  
  protected Boolean active;
  
  protected Boolean uplinkPort;
  
  protected Boolean nsxPort;
  
  protected ManagedObjectReference scope;
  
  protected List<String> portgroupKey;
  
  protected Boolean inside;
  
  protected List<String> portKey;
  
  protected List<ManagedObjectReference> host;
  
  public Boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(Boolean paramBoolean) {
    this.connected = paramBoolean;
  }
  
  public Boolean isActive() {
    return this.active;
  }
  
  public void setActive(Boolean paramBoolean) {
    this.active = paramBoolean;
  }
  
  public Boolean isUplinkPort() {
    return this.uplinkPort;
  }
  
  public void setUplinkPort(Boolean paramBoolean) {
    this.uplinkPort = paramBoolean;
  }
  
  public Boolean isNsxPort() {
    return this.nsxPort;
  }
  
  public void setNsxPort(Boolean paramBoolean) {
    this.nsxPort = paramBoolean;
  }
  
  public ManagedObjectReference getScope() {
    return this.scope;
  }
  
  public void setScope(ManagedObjectReference paramManagedObjectReference) {
    this.scope = paramManagedObjectReference;
  }
  
  public List<String> getPortgroupKey() {
    if (this.portgroupKey == null)
      this.portgroupKey = new ArrayList<>(); 
    return this.portgroupKey;
  }
  
  public Boolean isInside() {
    return this.inside;
  }
  
  public void setInside(Boolean paramBoolean) {
    this.inside = paramBoolean;
  }
  
  public List<String> getPortKey() {
    if (this.portKey == null)
      this.portKey = new ArrayList<>(); 
    return this.portKey;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
