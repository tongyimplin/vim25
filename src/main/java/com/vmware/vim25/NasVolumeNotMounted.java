package com.vmware.vim25;

import com.vmware.vim25.NasConfigFault;
import com.vmware.vim25.NasVolumeNotMounted;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasVolumeNotMounted", propOrder = {"remoteHost", "remotePath"})
public class NasVolumeNotMounted extends NasConfigFault {
  @XmlElement(required = true)
  protected String remoteHost;
  
  @XmlElement(required = true)
  protected String remotePath;
  
  public String getRemoteHost() {
    return this.remoteHost;
  }
  
  public void setRemoteHost(String paramString) {
    this.remoteHost = paramString;
  }
  
  public String getRemotePath() {
    return this.remotePath;
  }
  
  public void setRemotePath(String paramString) {
    this.remotePath = paramString;
  }
}
