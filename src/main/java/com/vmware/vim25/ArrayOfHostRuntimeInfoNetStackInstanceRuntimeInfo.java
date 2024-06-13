package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo;
import com.vmware.vim25.HostRuntimeInfoNetStackInstanceRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo", propOrder = {"hostRuntimeInfoNetStackInstanceRuntimeInfo"})
public class ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo {
  @XmlElement(name = "HostRuntimeInfoNetStackInstanceRuntimeInfo")
  protected List<HostRuntimeInfoNetStackInstanceRuntimeInfo> hostRuntimeInfoNetStackInstanceRuntimeInfo;
  
  public List<HostRuntimeInfoNetStackInstanceRuntimeInfo> getHostRuntimeInfoNetStackInstanceRuntimeInfo() {
    if (this.hostRuntimeInfoNetStackInstanceRuntimeInfo == null)
      this.hostRuntimeInfoNetStackInstanceRuntimeInfo = new ArrayList<>(); 
    return this.hostRuntimeInfoNetStackInstanceRuntimeInfo;
  }
}
