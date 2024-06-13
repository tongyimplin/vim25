package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import com.vmware.vim25.HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult", propOrder = {"hostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult"})
public class ArrayOfHostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult {
  @XmlElement(name = "HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult")
  protected List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> hostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
  
  public List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> getHostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult() {
    if (this.hostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult == null)
      this.hostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult = new ArrayList<>(); 
    return this.hostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
  }
}
