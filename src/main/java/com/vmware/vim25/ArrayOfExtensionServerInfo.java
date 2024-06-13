package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionServerInfo;
import com.vmware.vim25.ExtensionServerInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionServerInfo", propOrder = {"extensionServerInfo"})
public class ArrayOfExtensionServerInfo {
  @XmlElement(name = "ExtensionServerInfo")
  protected List<ExtensionServerInfo> extensionServerInfo;
  
  public List<ExtensionServerInfo> getExtensionServerInfo() {
    if (this.extensionServerInfo == null)
      this.extensionServerInfo = new ArrayList<>(); 
    return this.extensionServerInfo;
  }
}
