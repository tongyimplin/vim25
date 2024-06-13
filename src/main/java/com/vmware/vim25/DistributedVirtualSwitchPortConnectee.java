package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnectee;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchPortConnectee", propOrder = {"connectedEntity", "nicKey", "type", "addressHint"})
public class DistributedVirtualSwitchPortConnectee extends DynamicData {
  protected ManagedObjectReference connectedEntity;
  
  protected String nicKey;
  
  protected String type;
  
  protected String addressHint;
  
  public ManagedObjectReference getConnectedEntity() {
    return this.connectedEntity;
  }
  
  public void setConnectedEntity(ManagedObjectReference paramManagedObjectReference) {
    this.connectedEntity = paramManagedObjectReference;
  }
  
  public String getNicKey() {
    return this.nicKey;
  }
  
  public void setNicKey(String paramString) {
    this.nicKey = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getAddressHint() {
    return this.addressHint;
  }
  
  public void setAddressHint(String paramString) {
    this.addressHint = paramString;
  }
}
