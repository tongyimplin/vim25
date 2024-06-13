package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDiskPartitionSpec;
import com.vmware.vim25.HostVffsSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVffsSpec", propOrder = {"devicePath", "partition", "majorVersion", "volumeName"})
public class HostVffsSpec extends DynamicData {
  @XmlElement(required = true)
  protected String devicePath;
  
  protected HostDiskPartitionSpec partition;
  
  protected int majorVersion;
  
  @XmlElement(required = true)
  protected String volumeName;
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public void setDevicePath(String paramString) {
    this.devicePath = paramString;
  }
  
  public HostDiskPartitionSpec getPartition() {
    return this.partition;
  }
  
  public void setPartition(HostDiskPartitionSpec paramHostDiskPartitionSpec) {
    this.partition = paramHostDiskPartitionSpec;
  }
  
  public int getMajorVersion() {
    return this.majorVersion;
  }
  
  public void setMajorVersion(int paramInt) {
    this.majorVersion = paramInt;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public void setVolumeName(String paramString) {
    this.volumeName = paramString;
  }
}
