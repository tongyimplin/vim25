package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionEventTypeInfo;
import com.vmware.vim25.ExtensionEventTypeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionEventTypeInfo", propOrder = {"extensionEventTypeInfo"})
public class ArrayOfExtensionEventTypeInfo {
  @XmlElement(name = "ExtensionEventTypeInfo")
  protected List<ExtensionEventTypeInfo> extensionEventTypeInfo;
  
  public List<ExtensionEventTypeInfo> getExtensionEventTypeInfo() {
    if (this.extensionEventTypeInfo == null)
      this.extensionEventTypeInfo = new ArrayList<>(); 
    return this.extensionEventTypeInfo;
  }
}
