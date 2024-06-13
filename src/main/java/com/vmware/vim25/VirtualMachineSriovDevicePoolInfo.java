package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineSriovDevicePoolInfo;
import com.vmware.vim25.VirtualMachineSriovNetworkDevicePoolInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSriovDevicePoolInfo", propOrder = {"key"})
@XmlSeeAlso({VirtualMachineSriovNetworkDevicePoolInfo.class})
public class VirtualMachineSriovDevicePoolInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
