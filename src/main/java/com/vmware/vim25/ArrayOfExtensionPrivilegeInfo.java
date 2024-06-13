package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionPrivilegeInfo;
import com.vmware.vim25.ExtensionPrivilegeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionPrivilegeInfo", propOrder = {"extensionPrivilegeInfo"})
public class ArrayOfExtensionPrivilegeInfo {
  @XmlElement(name = "ExtensionPrivilegeInfo")
  protected List<ExtensionPrivilegeInfo> extensionPrivilegeInfo;
  
  public List<ExtensionPrivilegeInfo> getExtensionPrivilegeInfo() {
    if (this.extensionPrivilegeInfo == null)
      this.extensionPrivilegeInfo = new ArrayList<>(); 
    return this.extensionPrivilegeInfo;
  }
}
