package com.vmware.vim25;

import com.vmware.vim25.ComputeDiskPartitionInfoForResizeResponse;
import com.vmware.vim25.HostDiskPartitionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ComputeDiskPartitionInfoForResizeResponse")
public class ComputeDiskPartitionInfoForResizeResponse {
  @XmlElement(required = true)
  protected HostDiskPartitionInfo returnval;
  
  public HostDiskPartitionInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostDiskPartitionInfo paramHostDiskPartitionInfo) {
    this.returnval = paramHostDiskPartitionInfo;
  }
}
