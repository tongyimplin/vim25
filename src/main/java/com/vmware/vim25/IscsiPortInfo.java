package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNic;
import com.vmware.vim25.IscsiPortInfo;
import com.vmware.vim25.IscsiStatus;
import com.vmware.vim25.PhysicalNic;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiPortInfo", propOrder = {"vnicDevice", "vnic", "pnicDevice", "pnic", "switchName", "switchUuid", "portgroupName", "portgroupKey", "portKey", "opaqueNetworkId", "opaqueNetworkType", "opaqueNetworkName", "externalId", "complianceStatus", "pathStatus"})
public class IscsiPortInfo extends DynamicData {
  protected String vnicDevice;
  
  protected HostVirtualNic vnic;
  
  protected String pnicDevice;
  
  protected PhysicalNic pnic;
  
  protected String switchName;
  
  protected String switchUuid;
  
  protected String portgroupName;
  
  protected String portgroupKey;
  
  protected String portKey;
  
  protected String opaqueNetworkId;
  
  protected String opaqueNetworkType;
  
  protected String opaqueNetworkName;
  
  protected String externalId;
  
  protected IscsiStatus complianceStatus;
  
  protected String pathStatus;
  
  public String getVnicDevice() {
    return this.vnicDevice;
  }
  
  public void setVnicDevice(String paramString) {
    this.vnicDevice = paramString;
  }
  
  public HostVirtualNic getVnic() {
    return this.vnic;
  }
  
  public void setVnic(HostVirtualNic paramHostVirtualNic) {
    this.vnic = paramHostVirtualNic;
  }
  
  public String getPnicDevice() {
    return this.pnicDevice;
  }
  
  public void setPnicDevice(String paramString) {
    this.pnicDevice = paramString;
  }
  
  public PhysicalNic getPnic() {
    return this.pnic;
  }
  
  public void setPnic(PhysicalNic paramPhysicalNic) {
    this.pnic = paramPhysicalNic;
  }
  
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
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public String getOpaqueNetworkId() {
    return this.opaqueNetworkId;
  }
  
  public void setOpaqueNetworkId(String paramString) {
    this.opaqueNetworkId = paramString;
  }
  
  public String getOpaqueNetworkType() {
    return this.opaqueNetworkType;
  }
  
  public void setOpaqueNetworkType(String paramString) {
    this.opaqueNetworkType = paramString;
  }
  
  public String getOpaqueNetworkName() {
    return this.opaqueNetworkName;
  }
  
  public void setOpaqueNetworkName(String paramString) {
    this.opaqueNetworkName = paramString;
  }
  
  public String getExternalId() {
    return this.externalId;
  }
  
  public void setExternalId(String paramString) {
    this.externalId = paramString;
  }
  
  public IscsiStatus getComplianceStatus() {
    return this.complianceStatus;
  }
  
  public void setComplianceStatus(IscsiStatus paramIscsiStatus) {
    this.complianceStatus = paramIscsiStatus;
  }
  
  public String getPathStatus() {
    return this.pathStatus;
  }
  
  public void setPathStatus(String paramString) {
    this.pathStatus = paramString;
  }
}
