package com.vmware.vim25;

import com.vmware.vim25.DiskHasPartitions;
import com.vmware.vim25.DiskIsLastRemainingNonSSD;
import com.vmware.vim25.DiskIsNonLocal;
import com.vmware.vim25.DiskIsUSB;
import com.vmware.vim25.DiskTooSmall;
import com.vmware.vim25.DuplicateDisks;
import com.vmware.vim25.InsufficientDisks;
import com.vmware.vim25.VsanDiskFault;
import com.vmware.vim25.VsanFault;
import com.vmware.vim25.VsanIncompatibleDiskMapping;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanDiskFault", propOrder = {"device"})
@XmlSeeAlso({DiskIsNonLocal.class, DiskIsLastRemainingNonSSD.class, DuplicateDisks.class, DiskTooSmall.class, DiskHasPartitions.class, DiskIsUSB.class, VsanIncompatibleDiskMapping.class, InsufficientDisks.class})
public class VsanDiskFault extends VsanFault {
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
