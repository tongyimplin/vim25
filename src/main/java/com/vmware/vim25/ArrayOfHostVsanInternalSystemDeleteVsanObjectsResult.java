package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVsanInternalSystemDeleteVsanObjectsResult;
import com.vmware.vim25.HostVsanInternalSystemDeleteVsanObjectsResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemDeleteVsanObjectsResult", propOrder = {"hostVsanInternalSystemDeleteVsanObjectsResult"})
public class ArrayOfHostVsanInternalSystemDeleteVsanObjectsResult {
  @XmlElement(name = "HostVsanInternalSystemDeleteVsanObjectsResult")
  protected List<HostVsanInternalSystemDeleteVsanObjectsResult> hostVsanInternalSystemDeleteVsanObjectsResult;
  
  public List<HostVsanInternalSystemDeleteVsanObjectsResult> getHostVsanInternalSystemDeleteVsanObjectsResult() {
    if (this.hostVsanInternalSystemDeleteVsanObjectsResult == null)
      this.hostVsanInternalSystemDeleteVsanObjectsResult = new ArrayList<>(); 
    return this.hostVsanInternalSystemDeleteVsanObjectsResult;
  }
}
