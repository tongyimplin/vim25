package com.vmware.vim25;

import com.vmware.vim25.ArrayOfKernelModuleInfo;
import com.vmware.vim25.KernelModuleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKernelModuleInfo", propOrder = {"kernelModuleInfo"})
public class ArrayOfKernelModuleInfo {
  @XmlElement(name = "KernelModuleInfo")
  protected List<KernelModuleInfo> kernelModuleInfo;
  
  public List<KernelModuleInfo> getKernelModuleInfo() {
    if (this.kernelModuleInfo == null)
      this.kernelModuleInfo = new ArrayList<>(); 
    return this.kernelModuleInfo;
  }
}
