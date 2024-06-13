package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSystemIdentificationInfo;
import com.vmware.vim25.HostSystemIdentificationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSystemIdentificationInfo", propOrder = {"hostSystemIdentificationInfo"})
public class ArrayOfHostSystemIdentificationInfo {
  @XmlElement(name = "HostSystemIdentificationInfo")
  protected List<HostSystemIdentificationInfo> hostSystemIdentificationInfo;
  
  public List<HostSystemIdentificationInfo> getHostSystemIdentificationInfo() {
    if (this.hostSystemIdentificationInfo == null)
      this.hostSystemIdentificationInfo = new ArrayList<>(); 
    return this.hostSystemIdentificationInfo;
  }
}
