package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSystemResourceInfo;
import com.vmware.vim25.HostSystemResourceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSystemResourceInfo", propOrder = {"hostSystemResourceInfo"})
public class ArrayOfHostSystemResourceInfo {
  @XmlElement(name = "HostSystemResourceInfo")
  protected List<HostSystemResourceInfo> hostSystemResourceInfo;
  
  public List<HostSystemResourceInfo> getHostSystemResourceInfo() {
    if (this.hostSystemResourceInfo == null)
      this.hostSystemResourceInfo = new ArrayList<>(); 
    return this.hostSystemResourceInfo;
  }
}
