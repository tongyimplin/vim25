package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineProfileRawData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineProfileRawData", propOrder = {"extensionKey", "objectData"})
public class VirtualMachineProfileRawData extends DynamicData {
  @XmlElement(required = true)
  protected String extensionKey;
  
  protected String objectData;
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public String getObjectData() {
    return this.objectData;
  }
  
  public void setObjectData(String paramString) {
    this.objectData = paramString;
  }
}
