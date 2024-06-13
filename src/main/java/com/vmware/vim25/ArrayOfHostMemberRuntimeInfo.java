package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostMemberRuntimeInfo;
import com.vmware.vim25.HostMemberRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMemberRuntimeInfo", propOrder = {"hostMemberRuntimeInfo"})
public class ArrayOfHostMemberRuntimeInfo {
  @XmlElement(name = "HostMemberRuntimeInfo")
  protected List<HostMemberRuntimeInfo> hostMemberRuntimeInfo;
  
  public List<HostMemberRuntimeInfo> getHostMemberRuntimeInfo() {
    if (this.hostMemberRuntimeInfo == null)
      this.hostMemberRuntimeInfo = new ArrayList<>(); 
    return this.hostMemberRuntimeInfo;
  }
}
