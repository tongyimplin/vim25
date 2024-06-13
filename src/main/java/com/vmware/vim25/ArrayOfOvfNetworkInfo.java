package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfNetworkInfo;
import com.vmware.vim25.OvfNetworkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfNetworkInfo", propOrder = {"ovfNetworkInfo"})
public class ArrayOfOvfNetworkInfo {
  @XmlElement(name = "OvfNetworkInfo")
  protected List<OvfNetworkInfo> ovfNetworkInfo;
  
  public List<OvfNetworkInfo> getOvfNetworkInfo() {
    if (this.ovfNetworkInfo == null)
      this.ovfNetworkInfo = new ArrayList<>(); 
    return this.ovfNetworkInfo;
  }
}
