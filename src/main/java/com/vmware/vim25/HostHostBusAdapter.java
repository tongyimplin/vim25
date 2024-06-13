package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostBlockHba;
import com.vmware.vim25.HostFibreChannelHba;
import com.vmware.vim25.HostHostBusAdapter;
import com.vmware.vim25.HostInternetScsiHba;
import com.vmware.vim25.HostParallelScsiHba;
import com.vmware.vim25.HostPcieHba;
import com.vmware.vim25.HostRdmaHba;
import com.vmware.vim25.HostSerialAttachedHba;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHostBusAdapter", propOrder = {"key", "device", "bus", "status", "model", "driver", "pci", "storageProtocol"})
@XmlSeeAlso({HostParallelScsiHba.class, HostRdmaHba.class, HostSerialAttachedHba.class, HostBlockHba.class, HostInternetScsiHba.class, HostFibreChannelHba.class, HostPcieHba.class})
public class HostHostBusAdapter extends DynamicData {
  protected String key;
  
  @XmlElement(required = true)
  protected String device;
  
  protected int bus;
  
  @XmlElement(required = true)
  protected String status;
  
  @XmlElement(required = true)
  protected String model;
  
  protected String driver;
  
  protected String pci;
  
  protected String storageProtocol;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public int getBus() {
    return this.bus;
  }
  
  public void setBus(int paramInt) {
    this.bus = paramInt;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String paramString) {
    this.model = paramString;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public void setDriver(String paramString) {
    this.driver = paramString;
  }
  
  public String getPci() {
    return this.pci;
  }
  
  public void setPci(String paramString) {
    this.pci = paramString;
  }
  
  public String getStorageProtocol() {
    return this.storageProtocol;
  }
  
  public void setStorageProtocol(String paramString) {
    this.storageProtocol = paramString;
  }
}
