package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.VirtualMachineCpuIdInfoSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCpuIdInfoSpec", propOrder = {"info"})
public class VirtualMachineCpuIdInfoSpec extends ArrayUpdateSpec {
  protected HostCpuIdInfo info;
  
  public HostCpuIdInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(HostCpuIdInfo paramHostCpuIdInfo) {
    this.info = paramHostCpuIdInfo;
  }
}
