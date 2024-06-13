package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostHardwareElementInfo;
import com.vmware.vim25.HostHardwareStatusInfo;
import com.vmware.vim25.HostStorageElementInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareStatusInfo", propOrder = {"memoryStatusInfo", "cpuStatusInfo", "storageStatusInfo"})
public class HostHardwareStatusInfo extends DynamicData {
  protected List<HostHardwareElementInfo> memoryStatusInfo;
  
  protected List<HostHardwareElementInfo> cpuStatusInfo;
  
  protected List<HostStorageElementInfo> storageStatusInfo;
  
  public List<HostHardwareElementInfo> getMemoryStatusInfo() {
    if (this.memoryStatusInfo == null)
      this.memoryStatusInfo = new ArrayList<>(); 
    return this.memoryStatusInfo;
  }
  
  public List<HostHardwareElementInfo> getCpuStatusInfo() {
    if (this.cpuStatusInfo == null)
      this.cpuStatusInfo = new ArrayList<>(); 
    return this.cpuStatusInfo;
  }
  
  public List<HostStorageElementInfo> getStorageStatusInfo() {
    if (this.storageStatusInfo == null)
      this.storageStatusInfo = new ArrayList<>(); 
    return this.storageStatusInfo;
  }
}
