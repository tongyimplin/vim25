package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionTaskTypeInfo;
import com.vmware.vim25.ExtensionTaskTypeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionTaskTypeInfo", propOrder = {"extensionTaskTypeInfo"})
public class ArrayOfExtensionTaskTypeInfo {
  @XmlElement(name = "ExtensionTaskTypeInfo")
  protected List<ExtensionTaskTypeInfo> extensionTaskTypeInfo;
  
  public List<ExtensionTaskTypeInfo> getExtensionTaskTypeInfo() {
    if (this.extensionTaskTypeInfo == null)
      this.extensionTaskTypeInfo = new ArrayList<>(); 
    return this.extensionTaskTypeInfo;
  }
}
