package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVmPodConfigForPlacement;
import com.vmware.vim25.VmPodConfigForPlacement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmPodConfigForPlacement", propOrder = {"vmPodConfigForPlacement"})
public class ArrayOfVmPodConfigForPlacement {
  @XmlElement(name = "VmPodConfigForPlacement")
  protected List<VmPodConfigForPlacement> vmPodConfigForPlacement;
  
  public List<VmPodConfigForPlacement> getVmPodConfigForPlacement() {
    if (this.vmPodConfigForPlacement == null)
      this.vmPodConfigForPlacement = new ArrayList<>(); 
    return this.vmPodConfigForPlacement;
  }
}
