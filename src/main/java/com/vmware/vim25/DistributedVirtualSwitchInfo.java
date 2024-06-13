package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchInfo", propOrder = {"switchName", "switchUuid", "distributedVirtualSwitch", "networkReservationSupported"})
public class DistributedVirtualSwitchInfo extends DynamicData {
  @XmlElement(required = true)
  protected String switchName;
  
  @XmlElement(required = true)
  protected String switchUuid;
  
  @XmlElement(required = true)
  protected ManagedObjectReference distributedVirtualSwitch;
  
  protected Boolean networkReservationSupported;
  
  public String getSwitchName() {
    return this.switchName;
  }
  
  public void setSwitchName(String paramString) {
    this.switchName = paramString;
  }
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
  
  public ManagedObjectReference getDistributedVirtualSwitch() {
    return this.distributedVirtualSwitch;
  }
  
  public void setDistributedVirtualSwitch(ManagedObjectReference paramManagedObjectReference) {
    this.distributedVirtualSwitch = paramManagedObjectReference;
  }
  
  public Boolean isNetworkReservationSupported() {
    return this.networkReservationSupported;
  }
  
  public void setNetworkReservationSupported(Boolean paramBoolean) {
    this.networkReservationSupported = paramBoolean;
  }
}
