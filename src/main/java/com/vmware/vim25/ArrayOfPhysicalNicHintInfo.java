package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicHintInfo;
import com.vmware.vim25.PhysicalNicHintInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicHintInfo", propOrder = {"physicalNicHintInfo"})
public class ArrayOfPhysicalNicHintInfo {
  @XmlElement(name = "PhysicalNicHintInfo")
  protected List<PhysicalNicHintInfo> physicalNicHintInfo;
  
  public List<PhysicalNicHintInfo> getPhysicalNicHintInfo() {
    if (this.physicalNicHintInfo == null)
      this.physicalNicHintInfo = new ArrayList<>(); 
    return this.physicalNicHintInfo;
  }
}
