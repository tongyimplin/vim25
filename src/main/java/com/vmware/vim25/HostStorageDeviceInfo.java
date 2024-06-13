package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostHostBusAdapter;
import com.vmware.vim25.HostMultipathInfo;
import com.vmware.vim25.HostNvmeTopology;
import com.vmware.vim25.HostPlugStoreTopology;
import com.vmware.vim25.HostScsiTopology;
import com.vmware.vim25.HostStorageDeviceInfo;
import com.vmware.vim25.ScsiLun;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageDeviceInfo", propOrder = {"hostBusAdapter", "scsiLun", "scsiTopology", "nvmeTopology", "multipathInfo", "plugStoreTopology", "softwareInternetScsiEnabled"})
public class HostStorageDeviceInfo extends DynamicData {
  protected List<HostHostBusAdapter> hostBusAdapter;
  
  protected List<ScsiLun> scsiLun;
  
  protected HostScsiTopology scsiTopology;
  
  protected HostNvmeTopology nvmeTopology;
  
  protected HostMultipathInfo multipathInfo;
  
  protected HostPlugStoreTopology plugStoreTopology;
  
  protected boolean softwareInternetScsiEnabled;
  
  public List<HostHostBusAdapter> getHostBusAdapter() {
    if (this.hostBusAdapter == null)
      this.hostBusAdapter = new ArrayList<>(); 
    return this.hostBusAdapter;
  }
  
  public List<ScsiLun> getScsiLun() {
    if (this.scsiLun == null)
      this.scsiLun = new ArrayList<>(); 
    return this.scsiLun;
  }
  
  public HostScsiTopology getScsiTopology() {
    return this.scsiTopology;
  }
  
  public void setScsiTopology(HostScsiTopology paramHostScsiTopology) {
    this.scsiTopology = paramHostScsiTopology;
  }
  
  public HostNvmeTopology getNvmeTopology() {
    return this.nvmeTopology;
  }
  
  public void setNvmeTopology(HostNvmeTopology paramHostNvmeTopology) {
    this.nvmeTopology = paramHostNvmeTopology;
  }
  
  public HostMultipathInfo getMultipathInfo() {
    return this.multipathInfo;
  }
  
  public void setMultipathInfo(HostMultipathInfo paramHostMultipathInfo) {
    this.multipathInfo = paramHostMultipathInfo;
  }
  
  public HostPlugStoreTopology getPlugStoreTopology() {
    return this.plugStoreTopology;
  }
  
  public void setPlugStoreTopology(HostPlugStoreTopology paramHostPlugStoreTopology) {
    this.plugStoreTopology = paramHostPlugStoreTopology;
  }
  
  public boolean isSoftwareInternetScsiEnabled() {
    return this.softwareInternetScsiEnabled;
  }
  
  public void setSoftwareInternetScsiEnabled(boolean paramBoolean) {
    this.softwareInternetScsiEnabled = paramBoolean;
  }
}
