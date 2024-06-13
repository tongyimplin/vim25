package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionFaultTypeInfo;
import com.vmware.vim25.ExtensionFaultTypeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionFaultTypeInfo", propOrder = {"extensionFaultTypeInfo"})
public class ArrayOfExtensionFaultTypeInfo {
  @XmlElement(name = "ExtensionFaultTypeInfo")
  protected List<ExtensionFaultTypeInfo> extensionFaultTypeInfo;
  
  public List<ExtensionFaultTypeInfo> getExtensionFaultTypeInfo() {
    if (this.extensionFaultTypeInfo == null)
      this.extensionFaultTypeInfo = new ArrayList<>(); 
    return this.extensionFaultTypeInfo;
  }
}
