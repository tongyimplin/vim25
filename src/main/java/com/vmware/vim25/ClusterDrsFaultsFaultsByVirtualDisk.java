package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsFaultsFaultsByVirtualDisk;
import com.vmware.vim25.ClusterDrsFaultsFaultsByVm;
import com.vmware.vim25.VirtualDiskId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsFaultsFaultsByVirtualDisk", propOrder = {"disk"})
public class ClusterDrsFaultsFaultsByVirtualDisk extends ClusterDrsFaultsFaultsByVm {
  protected VirtualDiskId disk;
  
  public VirtualDiskId getDisk() {
    return this.disk;
  }
  
  public void setDisk(VirtualDiskId paramVirtualDiskId) {
    this.disk = paramVirtualDiskId;
  }
}
