package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostConnectInfoNetworkInfo;
import com.vmware.vim25.HostConnectInfoNetworkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostConnectInfoNetworkInfo", propOrder = {"hostConnectInfoNetworkInfo"})
public class ArrayOfHostConnectInfoNetworkInfo {
  @XmlElement(name = "HostConnectInfoNetworkInfo")
  protected List<HostConnectInfoNetworkInfo> hostConnectInfoNetworkInfo;
  
  public List<HostConnectInfoNetworkInfo> getHostConnectInfoNetworkInfo() {
    if (this.hostConnectInfoNetworkInfo == null)
      this.hostConnectInfoNetworkInfo = new ArrayList<>(); 
    return this.hostConnectInfoNetworkInfo;
  }
}
