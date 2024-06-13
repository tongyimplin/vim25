package com.vmware.vim25;

import com.vmware.vim25.ArrayOfSystemEventInfo;
import com.vmware.vim25.SystemEventInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSystemEventInfo", propOrder = {"systemEventInfo"})
public class ArrayOfSystemEventInfo {
  @XmlElement(name = "SystemEventInfo")
  protected List<SystemEventInfo> systemEventInfo;
  
  public List<SystemEventInfo> getSystemEventInfo() {
    if (this.systemEventInfo == null)
      this.systemEventInfo = new ArrayList<>(); 
    return this.systemEventInfo;
  }
}
