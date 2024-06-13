package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOpaqueNetworkTargetInfo;
import com.vmware.vim25.OpaqueNetworkTargetInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpaqueNetworkTargetInfo", propOrder = {"opaqueNetworkTargetInfo"})
public class ArrayOfOpaqueNetworkTargetInfo {
  @XmlElement(name = "OpaqueNetworkTargetInfo")
  protected List<OpaqueNetworkTargetInfo> opaqueNetworkTargetInfo;
  
  public List<OpaqueNetworkTargetInfo> getOpaqueNetworkTargetInfo() {
    if (this.opaqueNetworkTargetInfo == null)
      this.opaqueNetworkTargetInfo = new ArrayList<>(); 
    return this.opaqueNetworkTargetInfo;
  }
}
