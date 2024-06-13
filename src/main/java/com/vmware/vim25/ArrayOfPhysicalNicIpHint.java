package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicIpHint;
import com.vmware.vim25.PhysicalNicIpHint;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicIpHint", propOrder = {"physicalNicIpHint"})
public class ArrayOfPhysicalNicIpHint {
  @XmlElement(name = "PhysicalNicIpHint")
  protected List<PhysicalNicIpHint> physicalNicIpHint;
  
  public List<PhysicalNicIpHint> getPhysicalNicIpHint() {
    if (this.physicalNicIpHint == null)
      this.physicalNicIpHint = new ArrayList<>(); 
    return this.physicalNicIpHint;
  }
}
