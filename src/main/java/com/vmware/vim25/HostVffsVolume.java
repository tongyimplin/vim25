package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostScsiDiskPartition;
import com.vmware.vim25.HostVffsVolume;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVffsVolume", propOrder = {"majorVersion", "version", "uuid", "extent"})
public class HostVffsVolume extends HostFileSystemVolume {
  protected int majorVersion;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected List<HostScsiDiskPartition> extent;
  
  public int getMajorVersion() {
    return this.majorVersion;
  }
  
  public void setMajorVersion(int paramInt) {
    this.majorVersion = paramInt;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<HostScsiDiskPartition> getExtent() {
    if (this.extent == null)
      this.extent = new ArrayList<>(); 
    return this.extent;
  }
}
