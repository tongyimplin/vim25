package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupInfo", propOrder = {"switchName", "switchUuid", "portgroupName", "portgroupKey", "portgroupType", "uplinkPortgroup", "portgroup", "networkReservationSupported", "backingType", "logicalSwitchUuid", "segmentId"})
public class DistributedVirtualPortgroupInfo extends DynamicData {
  @XmlElement(required = true)
  protected String switchName;
  
  @XmlElement(required = true)
  protected String switchUuid;
  
  @XmlElement(required = true)
  protected String portgroupName;
  
  @XmlElement(required = true)
  protected String portgroupKey;
  
  @XmlElement(required = true)
  protected String portgroupType;
  
  protected boolean uplinkPortgroup;
  
  @XmlElement(required = true)
  protected ManagedObjectReference portgroup;
  
  protected Boolean networkReservationSupported;
  
  protected String backingType;
  
  protected String logicalSwitchUuid;
  
  protected String segmentId;
  
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
  
  public String getPortgroupName() {
    return this.portgroupName;
  }
  
  public void setPortgroupName(String paramString) {
    this.portgroupName = paramString;
  }
  
  public String getPortgroupKey() {
    return this.portgroupKey;
  }
  
  public void setPortgroupKey(String paramString) {
    this.portgroupKey = paramString;
  }
  
  public String getPortgroupType() {
    return this.portgroupType;
  }
  
  public void setPortgroupType(String paramString) {
    this.portgroupType = paramString;
  }
  
  public boolean isUplinkPortgroup() {
    return this.uplinkPortgroup;
  }
  
  public void setUplinkPortgroup(boolean paramBoolean) {
    this.uplinkPortgroup = paramBoolean;
  }
  
  public ManagedObjectReference getPortgroup() {
    return this.portgroup;
  }
  
  public void setPortgroup(ManagedObjectReference paramManagedObjectReference) {
    this.portgroup = paramManagedObjectReference;
  }
  
  public Boolean isNetworkReservationSupported() {
    return this.networkReservationSupported;
  }
  
  public void setNetworkReservationSupported(Boolean paramBoolean) {
    this.networkReservationSupported = paramBoolean;
  }
  
  public String getBackingType() {
    return this.backingType;
  }
  
  public void setBackingType(String paramString) {
    this.backingType = paramString;
  }
  
  public String getLogicalSwitchUuid() {
    return this.logicalSwitchUuid;
  }
  
  public void setLogicalSwitchUuid(String paramString) {
    this.logicalSwitchUuid = paramString;
  }
  
  public String getSegmentId() {
    return this.segmentId;
  }
  
  public void setSegmentId(String paramString) {
    this.segmentId = paramString;
  }
}
