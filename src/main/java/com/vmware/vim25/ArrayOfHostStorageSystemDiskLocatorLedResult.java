package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageSystemDiskLocatorLedResult;
import com.vmware.vim25.HostStorageSystemDiskLocatorLedResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageSystemDiskLocatorLedResult", propOrder = {"hostStorageSystemDiskLocatorLedResult"})
public class ArrayOfHostStorageSystemDiskLocatorLedResult {
  @XmlElement(name = "HostStorageSystemDiskLocatorLedResult")
  protected List<HostStorageSystemDiskLocatorLedResult> hostStorageSystemDiskLocatorLedResult;
  
  public List<HostStorageSystemDiskLocatorLedResult> getHostStorageSystemDiskLocatorLedResult() {
    if (this.hostStorageSystemDiskLocatorLedResult == null)
      this.hostStorageSystemDiskLocatorLedResult = new ArrayList<>(); 
    return this.hostStorageSystemDiskLocatorLedResult;
  }
}
