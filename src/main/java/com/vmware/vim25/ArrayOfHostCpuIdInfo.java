package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostCpuIdInfo;
import com.vmware.vim25.HostCpuIdInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostCpuIdInfo", propOrder = {"hostCpuIdInfo"})
public class ArrayOfHostCpuIdInfo {
  @XmlElement(name = "HostCpuIdInfo")
  protected List<HostCpuIdInfo> hostCpuIdInfo;
  
  public List<HostCpuIdInfo> getHostCpuIdInfo() {
    if (this.hostCpuIdInfo == null)
      this.hostCpuIdInfo = new ArrayList<>(); 
    return this.hostCpuIdInfo;
  }
}
