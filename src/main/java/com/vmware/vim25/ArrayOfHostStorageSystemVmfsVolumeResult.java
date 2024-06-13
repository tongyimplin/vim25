package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageSystemVmfsVolumeResult;
import com.vmware.vim25.HostStorageSystemVmfsVolumeResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageSystemVmfsVolumeResult", propOrder = {"hostStorageSystemVmfsVolumeResult"})
public class ArrayOfHostStorageSystemVmfsVolumeResult {
  @XmlElement(name = "HostStorageSystemVmfsVolumeResult")
  protected List<HostStorageSystemVmfsVolumeResult> hostStorageSystemVmfsVolumeResult;
  
  public List<HostStorageSystemVmfsVolumeResult> getHostStorageSystemVmfsVolumeResult() {
    if (this.hostStorageSystemVmfsVolumeResult == null)
      this.hostStorageSystemVmfsVolumeResult = new ArrayList<>(); 
    return this.hostStorageSystemVmfsVolumeResult;
  }
}
