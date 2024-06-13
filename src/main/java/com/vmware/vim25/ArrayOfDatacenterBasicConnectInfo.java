package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDatacenterBasicConnectInfo;
import com.vmware.vim25.DatacenterBasicConnectInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatacenterBasicConnectInfo", propOrder = {"datacenterBasicConnectInfo"})
public class ArrayOfDatacenterBasicConnectInfo {
  @XmlElement(name = "DatacenterBasicConnectInfo")
  protected List<DatacenterBasicConnectInfo> datacenterBasicConnectInfo;
  
  public List<DatacenterBasicConnectInfo> getDatacenterBasicConnectInfo() {
    if (this.datacenterBasicConnectInfo == null)
      this.datacenterBasicConnectInfo = new ArrayList<>(); 
    return this.datacenterBasicConnectInfo;
  }
}
