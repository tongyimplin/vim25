package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterIoFilterInfo;
import com.vmware.vim25.ClusterIoFilterInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterIoFilterInfo", propOrder = {"clusterIoFilterInfo"})
public class ArrayOfClusterIoFilterInfo {
  @XmlElement(name = "ClusterIoFilterInfo")
  protected List<ClusterIoFilterInfo> clusterIoFilterInfo;
  
  public List<ClusterIoFilterInfo> getClusterIoFilterInfo() {
    if (this.clusterIoFilterInfo == null)
      this.clusterIoFilterInfo = new ArrayList<>(); 
    return this.clusterIoFilterInfo;
  }
}
