package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualE1000;
import com.vmware.vim25.VirtualE1000E;
import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualEthernetCardResourceAllocation;
import com.vmware.vim25.VirtualPCNet32;
import com.vmware.vim25.VirtualSriovEthernetCard;
import com.vmware.vim25.VirtualVmxnet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCard", propOrder = {"addressType", "macAddress", "wakeOnLanEnabled", "resourceAllocation", "externalId", "uptCompatibilityEnabled"})
@XmlSeeAlso({VirtualSriovEthernetCard.class, VirtualPCNet32.class, VirtualE1000E.class, VirtualE1000.class, VirtualVmxnet.class})
public class VirtualEthernetCard extends VirtualDevice {
  protected String addressType;
  
  protected String macAddress;
  
  protected Boolean wakeOnLanEnabled;
  
  protected VirtualEthernetCardResourceAllocation resourceAllocation;
  
  protected String externalId;
  
  protected Boolean uptCompatibilityEnabled;
  
  public String getAddressType() {
    return this.addressType;
  }
  
  public void setAddressType(String paramString) {
    this.addressType = paramString;
  }
  
  public String getMacAddress() {
    return this.macAddress;
  }
  
  public void setMacAddress(String paramString) {
    this.macAddress = paramString;
  }
  
  public Boolean isWakeOnLanEnabled() {
    return this.wakeOnLanEnabled;
  }
  
  public void setWakeOnLanEnabled(Boolean paramBoolean) {
    this.wakeOnLanEnabled = paramBoolean;
  }
  
  public VirtualEthernetCardResourceAllocation getResourceAllocation() {
    return this.resourceAllocation;
  }
  
  public void setResourceAllocation(VirtualEthernetCardResourceAllocation paramVirtualEthernetCardResourceAllocation) {
    this.resourceAllocation = paramVirtualEthernetCardResourceAllocation;
  }
  
  public String getExternalId() {
    return this.externalId;
  }
  
  public void setExternalId(String paramString) {
    this.externalId = paramString;
  }
  
  public Boolean isUptCompatibilityEnabled() {
    return this.uptCompatibilityEnabled;
  }
  
  public void setUptCompatibilityEnabled(Boolean paramBoolean) {
    this.uptCompatibilityEnabled = paramBoolean;
  }
}
