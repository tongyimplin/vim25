package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostCpuPackage;
import com.vmware.vim25.HostCpuPackage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostCpuPackage", propOrder = {"hostCpuPackage"})
public class ArrayOfHostCpuPackage {
  @XmlElement(name = "HostCpuPackage")
  protected List<HostCpuPackage> hostCpuPackage;
  
  public List<HostCpuPackage> getHostCpuPackage() {
    if (this.hostCpuPackage == null)
      this.hostCpuPackage = new ArrayList<>(); 
    return this.hostCpuPackage;
  }
}
