package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDiskConfigurationResult;
import com.vmware.vim25.HostDiskConfigurationResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDiskConfigurationResult", propOrder = {"hostDiskConfigurationResult"})
public class ArrayOfHostDiskConfigurationResult {
  @XmlElement(name = "HostDiskConfigurationResult")
  protected List<HostDiskConfigurationResult> hostDiskConfigurationResult;
  
  public List<HostDiskConfigurationResult> getHostDiskConfigurationResult() {
    if (this.hostDiskConfigurationResult == null)
      this.hostDiskConfigurationResult = new ArrayList<>(); 
    return this.hostDiskConfigurationResult;
  }
}
