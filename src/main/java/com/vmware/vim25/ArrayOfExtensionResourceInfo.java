package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionResourceInfo;
import com.vmware.vim25.ExtensionResourceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionResourceInfo", propOrder = {"extensionResourceInfo"})
public class ArrayOfExtensionResourceInfo {
  @XmlElement(name = "ExtensionResourceInfo")
  protected List<ExtensionResourceInfo> extensionResourceInfo;
  
  public List<ExtensionResourceInfo> getExtensionResourceInfo() {
    if (this.extensionResourceInfo == null)
      this.extensionResourceInfo = new ArrayList<>(); 
    return this.extensionResourceInfo;
  }
}
