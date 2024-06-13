package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVchaNodeRuntimeInfo;
import com.vmware.vim25.VchaNodeRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVchaNodeRuntimeInfo", propOrder = {"vchaNodeRuntimeInfo"})
public class ArrayOfVchaNodeRuntimeInfo {
  @XmlElement(name = "VchaNodeRuntimeInfo")
  protected List<VchaNodeRuntimeInfo> vchaNodeRuntimeInfo;
  
  public List<VchaNodeRuntimeInfo> getVchaNodeRuntimeInfo() {
    if (this.vchaNodeRuntimeInfo == null)
      this.vchaNodeRuntimeInfo = new ArrayList<>(); 
    return this.vchaNodeRuntimeInfo;
  }
}
