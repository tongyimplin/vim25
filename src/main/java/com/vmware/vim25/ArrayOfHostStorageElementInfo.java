package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageElementInfo;
import com.vmware.vim25.HostStorageElementInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageElementInfo", propOrder = {"hostStorageElementInfo"})
public class ArrayOfHostStorageElementInfo {
  @XmlElement(name = "HostStorageElementInfo")
  protected List<HostStorageElementInfo> hostStorageElementInfo;
  
  public List<HostStorageElementInfo> getHostStorageElementInfo() {
    if (this.hostStorageElementInfo == null)
      this.hostStorageElementInfo = new ArrayList<>(); 
    return this.hostStorageElementInfo;
  }
}
