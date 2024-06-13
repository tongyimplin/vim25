package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostPMemVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPMemVolume", propOrder = {"uuid", "version"})
public class HostPMemVolume extends HostFileSystemVolume {
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String version;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
