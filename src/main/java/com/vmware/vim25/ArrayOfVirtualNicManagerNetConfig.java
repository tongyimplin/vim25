package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualNicManagerNetConfig;
import com.vmware.vim25.VirtualNicManagerNetConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualNicManagerNetConfig", propOrder = {"virtualNicManagerNetConfig"})
public class ArrayOfVirtualNicManagerNetConfig {
  @XmlElement(name = "VirtualNicManagerNetConfig")
  protected List<VirtualNicManagerNetConfig> virtualNicManagerNetConfig;
  
  public List<VirtualNicManagerNetConfig> getVirtualNicManagerNetConfig() {
    if (this.virtualNicManagerNetConfig == null)
      this.virtualNicManagerNetConfig = new ArrayList<>(); 
    return this.virtualNicManagerNetConfig;
  }
}
