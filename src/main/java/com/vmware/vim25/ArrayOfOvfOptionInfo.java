package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfOptionInfo;
import com.vmware.vim25.OvfOptionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfOptionInfo", propOrder = {"ovfOptionInfo"})
public class ArrayOfOvfOptionInfo {
  @XmlElement(name = "OvfOptionInfo")
  protected List<OvfOptionInfo> ovfOptionInfo;
  
  public List<OvfOptionInfo> getOvfOptionInfo() {
    if (this.ovfOptionInfo == null)
      this.ovfOptionInfo = new ArrayList<>(); 
    return this.ovfOptionInfo;
  }
}
