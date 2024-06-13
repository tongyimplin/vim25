package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPortGroupConfig;
import com.vmware.vim25.HostPortGroupConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPortGroupConfig", propOrder = {"hostPortGroupConfig"})
public class ArrayOfHostPortGroupConfig {
  @XmlElement(name = "HostPortGroupConfig")
  protected List<HostPortGroupConfig> hostPortGroupConfig;
  
  public List<HostPortGroupConfig> getHostPortGroupConfig() {
    if (this.hostPortGroupConfig == null)
      this.hostPortGroupConfig = new ArrayList<>(); 
    return this.hostPortGroupConfig;
  }
}
