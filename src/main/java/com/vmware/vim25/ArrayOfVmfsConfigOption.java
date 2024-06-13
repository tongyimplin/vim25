package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVmfsConfigOption;
import com.vmware.vim25.VmfsConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmfsConfigOption", propOrder = {"vmfsConfigOption"})
public class ArrayOfVmfsConfigOption {
  @XmlElement(name = "VmfsConfigOption")
  protected List<VmfsConfigOption> vmfsConfigOption;
  
  public List<VmfsConfigOption> getVmfsConfigOption() {
    if (this.vmfsConfigOption == null)
      this.vmfsConfigOption = new ArrayList<>(); 
    return this.vmfsConfigOption;
  }
}
