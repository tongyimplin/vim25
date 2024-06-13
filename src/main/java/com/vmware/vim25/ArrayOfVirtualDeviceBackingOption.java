package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDeviceBackingOption", propOrder = {"virtualDeviceBackingOption"})
public class ArrayOfVirtualDeviceBackingOption {
  @XmlElement(name = "VirtualDeviceBackingOption")
  protected List<VirtualDeviceBackingOption> virtualDeviceBackingOption;
  
  public List<VirtualDeviceBackingOption> getVirtualDeviceBackingOption() {
    if (this.virtualDeviceBackingOption == null)
      this.virtualDeviceBackingOption = new ArrayList<>(); 
    return this.virtualDeviceBackingOption;
  }
}
