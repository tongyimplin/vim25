package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVmEventArgument;
import com.vmware.vim25.VmEventArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmEventArgument", propOrder = {"vmEventArgument"})
public class ArrayOfVmEventArgument {
  @XmlElement(name = "VmEventArgument")
  protected List<VmEventArgument> vmEventArgument;
  
  public List<VmEventArgument> getVmEventArgument() {
    if (this.vmEventArgument == null)
      this.vmEventArgument = new ArrayList<>(); 
    return this.vmEventArgument;
  }
}
