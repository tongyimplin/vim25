package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVirtualNicConfig;
import com.vmware.vim25.HostVirtualNicConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualNicConfig", propOrder = {"hostVirtualNicConfig"})
public class ArrayOfHostVirtualNicConfig {
  @XmlElement(name = "HostVirtualNicConfig")
  protected List<HostVirtualNicConfig> hostVirtualNicConfig;
  
  public List<HostVirtualNicConfig> getHostVirtualNicConfig() {
    if (this.hostVirtualNicConfig == null)
      this.hostVirtualNicConfig = new ArrayList<>(); 
    return this.hostVirtualNicConfig;
  }
}
