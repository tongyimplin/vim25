package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicLinkInfo;
import com.vmware.vim25.PhysicalNicLinkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicLinkInfo", propOrder = {"physicalNicLinkInfo"})
public class ArrayOfPhysicalNicLinkInfo {
  @XmlElement(name = "PhysicalNicLinkInfo")
  protected List<PhysicalNicLinkInfo> physicalNicLinkInfo;
  
  public List<PhysicalNicLinkInfo> getPhysicalNicLinkInfo() {
    if (this.physicalNicLinkInfo == null)
      this.physicalNicLinkInfo = new ArrayList<>(); 
    return this.physicalNicLinkInfo;
  }
}
