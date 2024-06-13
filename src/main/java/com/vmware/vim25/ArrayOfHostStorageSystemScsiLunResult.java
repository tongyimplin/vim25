package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageSystemScsiLunResult;
import com.vmware.vim25.HostStorageSystemScsiLunResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageSystemScsiLunResult", propOrder = {"hostStorageSystemScsiLunResult"})
public class ArrayOfHostStorageSystemScsiLunResult {
  @XmlElement(name = "HostStorageSystemScsiLunResult")
  protected List<HostStorageSystemScsiLunResult> hostStorageSystemScsiLunResult;
  
  public List<HostStorageSystemScsiLunResult> getHostStorageSystemScsiLunResult() {
    if (this.hostStorageSystemScsiLunResult == null)
      this.hostStorageSystemScsiLunResult = new ArrayList<>(); 
    return this.hostStorageSystemScsiLunResult;
  }
}
