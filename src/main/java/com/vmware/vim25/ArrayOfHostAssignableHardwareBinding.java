package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostAssignableHardwareBinding;
import com.vmware.vim25.HostAssignableHardwareBinding;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAssignableHardwareBinding", propOrder = {"hostAssignableHardwareBinding"})
public class ArrayOfHostAssignableHardwareBinding {
  @XmlElement(name = "HostAssignableHardwareBinding")
  protected List<HostAssignableHardwareBinding> hostAssignableHardwareBinding;
  
  public List<HostAssignableHardwareBinding> getHostAssignableHardwareBinding() {
    if (this.hostAssignableHardwareBinding == null)
      this.hostAssignableHardwareBinding = new ArrayList<>(); 
    return this.hostAssignableHardwareBinding;
  }
}
