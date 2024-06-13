package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDeviceConfigSpec", propOrder = {"virtualDeviceConfigSpec"})
public class ArrayOfVirtualDeviceConfigSpec {
  @XmlElement(name = "VirtualDeviceConfigSpec")
  protected List<VirtualDeviceConfigSpec> virtualDeviceConfigSpec;
  
  public List<VirtualDeviceConfigSpec> getVirtualDeviceConfigSpec() {
    if (this.virtualDeviceConfigSpec == null)
      this.virtualDeviceConfigSpec = new ArrayList<>(); 
    return this.virtualDeviceConfigSpec;
  }
}
