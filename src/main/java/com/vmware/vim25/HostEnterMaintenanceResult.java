package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultsByHost;
import com.vmware.vim25.FaultsByVM;
import com.vmware.vim25.HostEnterMaintenanceResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEnterMaintenanceResult", propOrder = {"vmFaults", "hostFaults"})
public class HostEnterMaintenanceResult extends DynamicData {
  protected List<FaultsByVM> vmFaults;
  
  protected List<FaultsByHost> hostFaults;
  
  public List<FaultsByVM> getVmFaults() {
    if (this.vmFaults == null)
      this.vmFaults = new ArrayList<>(); 
    return this.vmFaults;
  }
  
  public List<FaultsByHost> getHostFaults() {
    if (this.hostFaults == null)
      this.hostFaults = new ArrayList<>(); 
    return this.hostFaults;
  }
}
