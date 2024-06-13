package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostStorageSystemDiskLocatorLedResult;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageSystemDiskLocatorLedResult", propOrder = {"key", "fault"})
public class HostStorageSystemDiskLocatorLedResult extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
