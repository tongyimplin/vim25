package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicNameHint;
import com.vmware.vim25.PhysicalNicNameHint;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicNameHint", propOrder = {"physicalNicNameHint"})
public class ArrayOfPhysicalNicNameHint {
  @XmlElement(name = "PhysicalNicNameHint")
  protected List<PhysicalNicNameHint> physicalNicNameHint;
  
  public List<PhysicalNicNameHint> getPhysicalNicNameHint() {
    if (this.physicalNicNameHint == null)
      this.physicalNicNameHint = new ArrayList<>(); 
    return this.physicalNicNameHint;
  }
}
