package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionClientInfo;
import com.vmware.vim25.ExtensionClientInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionClientInfo", propOrder = {"extensionClientInfo"})
public class ArrayOfExtensionClientInfo {
  @XmlElement(name = "ExtensionClientInfo")
  protected List<ExtensionClientInfo> extensionClientInfo;
  
  public List<ExtensionClientInfo> getExtensionClientInfo() {
    if (this.extensionClientInfo == null)
      this.extensionClientInfo = new ArrayList<>(); 
    return this.extensionClientInfo;
  }
}
