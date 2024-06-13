package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVmciAccessManagerAccessSpec;
import com.vmware.vim25.HostVmciAccessManagerAccessSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVmciAccessManagerAccessSpec", propOrder = {"hostVmciAccessManagerAccessSpec"})
public class ArrayOfHostVmciAccessManagerAccessSpec {
  @XmlElement(name = "HostVmciAccessManagerAccessSpec")
  protected List<HostVmciAccessManagerAccessSpec> hostVmciAccessManagerAccessSpec;
  
  public List<HostVmciAccessManagerAccessSpec> getHostVmciAccessManagerAccessSpec() {
    if (this.hostVmciAccessManagerAccessSpec == null)
      this.hostVmciAccessManagerAccessSpec = new ArrayList<>(); 
    return this.hostVmciAccessManagerAccessSpec;
  }
}
