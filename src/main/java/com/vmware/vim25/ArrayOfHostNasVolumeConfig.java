package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNasVolumeConfig;
import com.vmware.vim25.HostNasVolumeConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNasVolumeConfig", propOrder = {"hostNasVolumeConfig"})
public class ArrayOfHostNasVolumeConfig {
  @XmlElement(name = "HostNasVolumeConfig")
  protected List<HostNasVolumeConfig> hostNasVolumeConfig;
  
  public List<HostNasVolumeConfig> getHostNasVolumeConfig() {
    if (this.hostNasVolumeConfig == null)
      this.hostNasVolumeConfig = new ArrayList<>(); 
    return this.hostNasVolumeConfig;
  }
}
