package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDeviceOption;
import com.vmware.vim25.VirtualDeviceOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDeviceOption", propOrder = {"virtualDeviceOption"})
public class ArrayOfVirtualDeviceOption {
  @XmlElement(name = "VirtualDeviceOption")
  protected List<VirtualDeviceOption> virtualDeviceOption;
  
  public List<VirtualDeviceOption> getVirtualDeviceOption() {
    if (this.virtualDeviceOption == null)
      this.virtualDeviceOption = new ArrayList<>(); 
    return this.virtualDeviceOption;
  }
}
