package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostCacheConfigurationInfo;
import com.vmware.vim25.HostCacheConfigurationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostCacheConfigurationInfo", propOrder = {"hostCacheConfigurationInfo"})
public class ArrayOfHostCacheConfigurationInfo {
  @XmlElement(name = "HostCacheConfigurationInfo")
  protected List<HostCacheConfigurationInfo> hostCacheConfigurationInfo;
  
  public List<HostCacheConfigurationInfo> getHostCacheConfigurationInfo() {
    if (this.hostCacheConfigurationInfo == null)
      this.hostCacheConfigurationInfo = new ArrayList<>(); 
    return this.hostCacheConfigurationInfo;
  }
}
