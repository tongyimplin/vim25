package com.vmware.vim25;

import com.vmware.vim25.HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult;
import com.vmware.vim25.RunVsanPhysicalDiskDiagnosticsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RunVsanPhysicalDiskDiagnosticsResponse")
public class RunVsanPhysicalDiskDiagnosticsResponse {
  @XmlElement(required = true)
  protected List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> returnval;
  
  public List<HostVsanInternalSystemVsanPhysicalDiskDiagnosticsResult> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
