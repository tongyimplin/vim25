package com.vmware.vim25;

import com.vmware.vim25.ArrayOfAutoStartPowerInfo;
import com.vmware.vim25.AutoStartPowerInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAutoStartPowerInfo", propOrder = {"autoStartPowerInfo"})
public class ArrayOfAutoStartPowerInfo {
  @XmlElement(name = "AutoStartPowerInfo")
  protected List<AutoStartPowerInfo> autoStartPowerInfo;
  
  public List<AutoStartPowerInfo> getAutoStartPowerInfo() {
    if (this.autoStartPowerInfo == null)
      this.autoStartPowerInfo = new ArrayList<>(); 
    return this.autoStartPowerInfo;
  }
}
