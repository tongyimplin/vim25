package com.vmware.vim25;

import com.vmware.vim25.DiskNotSupported;
import com.vmware.vim25.IDEDiskNotSupported;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskNotSupported", propOrder = {"disk"})
@XmlSeeAlso({IDEDiskNotSupported.class})
public class DiskNotSupported extends VirtualHardwareCompatibilityIssue {
  protected int disk;
  
  public int getDisk() {
    return this.disk;
  }
  
  public void setDisk(int paramInt) {
    this.disk = paramInt;
  }
}
