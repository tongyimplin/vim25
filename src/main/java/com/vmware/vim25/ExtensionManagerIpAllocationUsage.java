package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionManagerIpAllocationUsage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionManagerIpAllocationUsage", propOrder = {"extensionKey", "numAddresses"})
public class ExtensionManagerIpAllocationUsage extends DynamicData {
  @XmlElement(required = true)
  protected String extensionKey;
  
  protected int numAddresses;
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public int getNumAddresses() {
    return this.numAddresses;
  }
  
  public void setNumAddresses(int paramInt) {
    this.numAddresses = paramInt;
  }
}
