package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostLocalFileSystemVolume;
import com.vmware.vim25.HostNasVolume;
import com.vmware.vim25.HostPMemVolume;
import com.vmware.vim25.HostVfatVolume;
import com.vmware.vim25.HostVffsVolume;
import com.vmware.vim25.HostVmfsVolume;
import com.vmware.vim25.HostVvolVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFileSystemVolume", propOrder = {"type", "name", "capacity"})
@XmlSeeAlso({HostVmfsVolume.class, HostVffsVolume.class, HostLocalFileSystemVolume.class, HostVfatVolume.class, HostPMemVolume.class, HostVvolVolume.class, HostNasVolume.class})
public class HostFileSystemVolume extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String name;
  
  protected long capacity;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(long paramLong) {
    this.capacity = paramLong;
  }
}
