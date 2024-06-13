package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFileSystemMountInfo;
import com.vmware.vim25.HostFileSystemVolumeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFileSystemVolumeInfo", propOrder = {"volumeTypeList", "mountInfo"})
public class HostFileSystemVolumeInfo extends DynamicData {
  protected List<String> volumeTypeList;
  
  protected List<HostFileSystemMountInfo> mountInfo;
  
  public List<String> getVolumeTypeList() {
    if (this.volumeTypeList == null)
      this.volumeTypeList = new ArrayList<>(); 
    return this.volumeTypeList;
  }
  
  public List<HostFileSystemMountInfo> getMountInfo() {
    if (this.mountInfo == null)
      this.mountInfo = new ArrayList<>(); 
    return this.mountInfo;
  }
}
