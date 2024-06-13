package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVmfsRescanResult;
import com.vmware.vim25.HostVmfsRescanResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVmfsRescanResult", propOrder = {"hostVmfsRescanResult"})
public class ArrayOfHostVmfsRescanResult {
  @XmlElement(name = "HostVmfsRescanResult")
  protected List<HostVmfsRescanResult> hostVmfsRescanResult;
  
  public List<HostVmfsRescanResult> getHostVmfsRescanResult() {
    if (this.hostVmfsRescanResult == null)
      this.hostVmfsRescanResult = new ArrayList<>(); 
    return this.hostVmfsRescanResult;
  }
}
