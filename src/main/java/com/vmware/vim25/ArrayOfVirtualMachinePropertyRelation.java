package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachinePropertyRelation;
import com.vmware.vim25.VirtualMachinePropertyRelation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePropertyRelation", propOrder = {"virtualMachinePropertyRelation"})
public class ArrayOfVirtualMachinePropertyRelation {
  @XmlElement(name = "VirtualMachinePropertyRelation")
  protected List<VirtualMachinePropertyRelation> virtualMachinePropertyRelation;
  
  public List<VirtualMachinePropertyRelation> getVirtualMachinePropertyRelation() {
    if (this.virtualMachinePropertyRelation == null)
      this.virtualMachinePropertyRelation = new ArrayList<>(); 
    return this.virtualMachinePropertyRelation;
  }
}
