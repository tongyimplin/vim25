package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVsanInternalSystemVsanObjectOperationResult;
import com.vmware.vim25.HostVsanInternalSystemVsanObjectOperationResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemVsanObjectOperationResult", propOrder = {"hostVsanInternalSystemVsanObjectOperationResult"})
public class ArrayOfHostVsanInternalSystemVsanObjectOperationResult {
  @XmlElement(name = "HostVsanInternalSystemVsanObjectOperationResult")
  protected List<HostVsanInternalSystemVsanObjectOperationResult> hostVsanInternalSystemVsanObjectOperationResult;
  
  public List<HostVsanInternalSystemVsanObjectOperationResult> getHostVsanInternalSystemVsanObjectOperationResult() {
    if (this.hostVsanInternalSystemVsanObjectOperationResult == null)
      this.hostVsanInternalSystemVsanObjectOperationResult = new ArrayList<>(); 
    return this.hostVsanInternalSystemVsanObjectOperationResult;
  }
}
