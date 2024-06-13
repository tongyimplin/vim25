package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageOperationalInfo;
import com.vmware.vim25.HostStorageOperationalInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageOperationalInfo", propOrder = {"hostStorageOperationalInfo"})
public class ArrayOfHostStorageOperationalInfo {
  @XmlElement(name = "HostStorageOperationalInfo")
  protected List<HostStorageOperationalInfo> hostStorageOperationalInfo;
  
  public List<HostStorageOperationalInfo> getHostStorageOperationalInfo() {
    if (this.hostStorageOperationalInfo == null)
      this.hostStorageOperationalInfo = new ArrayList<>(); 
    return this.hostStorageOperationalInfo;
  }
}
