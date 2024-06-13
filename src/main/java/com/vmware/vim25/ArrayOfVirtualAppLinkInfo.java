package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualAppLinkInfo;
import com.vmware.vim25.VirtualAppLinkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualAppLinkInfo", propOrder = {"virtualAppLinkInfo"})
public class ArrayOfVirtualAppLinkInfo {
  @XmlElement(name = "VirtualAppLinkInfo")
  protected List<VirtualAppLinkInfo> virtualAppLinkInfo;
  
  public List<VirtualAppLinkInfo> getVirtualAppLinkInfo() {
    if (this.virtualAppLinkInfo == null)
      this.virtualAppLinkInfo = new ArrayList<>(); 
    return this.virtualAppLinkInfo;
  }
}
