package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostIoFilterInfo;
import com.vmware.vim25.HostIoFilterInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIoFilterInfo", propOrder = {"hostIoFilterInfo"})
public class ArrayOfHostIoFilterInfo {
  @XmlElement(name = "HostIoFilterInfo")
  protected List<HostIoFilterInfo> hostIoFilterInfo;
  
  public List<HostIoFilterInfo> getHostIoFilterInfo() {
    if (this.hostIoFilterInfo == null)
      this.hostIoFilterInfo = new ArrayList<>(); 
    return this.hostIoFilterInfo;
  }
}
