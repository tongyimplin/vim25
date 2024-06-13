package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostOpaqueSwitchPhysicalNicZone", propOrder = {"key", "pnicDevice"})
public class HostOpaqueSwitchPhysicalNicZone extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected List<String> pnicDevice;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public List<String> getPnicDevice() {
    if (this.pnicDevice == null)
      this.pnicDevice = new ArrayList<>(); 
    return this.pnicDevice;
  }
}
