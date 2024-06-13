package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFileSystemMountInfo;
import com.vmware.vim25.HostFileSystemMountInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFileSystemMountInfo", propOrder = {"hostFileSystemMountInfo"})
public class ArrayOfHostFileSystemMountInfo {
  @XmlElement(name = "HostFileSystemMountInfo")
  protected List<HostFileSystemMountInfo> hostFileSystemMountInfo;
  
  public List<HostFileSystemMountInfo> getHostFileSystemMountInfo() {
    if (this.hostFileSystemMountInfo == null)
      this.hostFileSystemMountInfo = new ArrayList<>(); 
    return this.hostFileSystemMountInfo;
  }
}
