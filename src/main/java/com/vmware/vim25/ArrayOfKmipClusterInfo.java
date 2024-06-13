package com.vmware.vim25;

import com.vmware.vim25.ArrayOfKmipClusterInfo;
import com.vmware.vim25.KmipClusterInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKmipClusterInfo", propOrder = {"kmipClusterInfo"})
public class ArrayOfKmipClusterInfo {
  @XmlElement(name = "KmipClusterInfo")
  protected List<KmipClusterInfo> kmipClusterInfo;
  
  public List<KmipClusterInfo> getKmipClusterInfo() {
    if (this.kmipClusterInfo == null)
      this.kmipClusterInfo = new ArrayList<>(); 
    return this.kmipClusterInfo;
  }
}
