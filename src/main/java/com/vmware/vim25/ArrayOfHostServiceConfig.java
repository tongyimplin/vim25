package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostServiceConfig;
import com.vmware.vim25.HostServiceConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostServiceConfig", propOrder = {"hostServiceConfig"})
public class ArrayOfHostServiceConfig {
  @XmlElement(name = "HostServiceConfig")
  protected List<HostServiceConfig> hostServiceConfig;
  
  public List<HostServiceConfig> getHostServiceConfig() {
    if (this.hostServiceConfig == null)
      this.hostServiceConfig = new ArrayList<>(); 
    return this.hostServiceConfig;
  }
}
