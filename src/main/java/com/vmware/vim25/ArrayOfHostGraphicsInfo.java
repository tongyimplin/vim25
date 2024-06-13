package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostGraphicsInfo;
import com.vmware.vim25.HostGraphicsInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostGraphicsInfo", propOrder = {"hostGraphicsInfo"})
public class ArrayOfHostGraphicsInfo {
  @XmlElement(name = "HostGraphicsInfo")
  protected List<HostGraphicsInfo> hostGraphicsInfo;
  
  public List<HostGraphicsInfo> getHostGraphicsInfo() {
    if (this.hostGraphicsInfo == null)
      this.hostGraphicsInfo = new ArrayList<>(); 
    return this.hostGraphicsInfo;
  }
}
