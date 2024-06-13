package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFileSystemMountInfo;
import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostMountInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFileSystemMountInfo", propOrder = {"mountInfo", "volume", "vStorageSupport"})
public class HostFileSystemMountInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostMountInfo mountInfo;
  
  @XmlElement(required = true)
  protected HostFileSystemVolume volume;
  
  protected String vStorageSupport;
  
  public HostMountInfo getMountInfo() {
    return this.mountInfo;
  }
  
  public void setMountInfo(HostMountInfo paramHostMountInfo) {
    this.mountInfo = paramHostMountInfo;
  }
  
  public HostFileSystemVolume getVolume() {
    return this.volume;
  }
  
  public void setVolume(HostFileSystemVolume paramHostFileSystemVolume) {
    this.volume = paramHostFileSystemVolume;
  }
  
  public String getVStorageSupport() {
    return this.vStorageSupport;
  }
  
  public void setVStorageSupport(String paramString) {
    this.vStorageSupport = paramString;
  }
}
