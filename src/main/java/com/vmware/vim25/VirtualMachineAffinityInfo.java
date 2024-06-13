package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineAffinityInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineAffinityInfo", propOrder = {"affinitySet"})
public class VirtualMachineAffinityInfo extends DynamicData {
  @XmlElement(type = Integer.class)
  protected List<Integer> affinitySet;
  
  public List<Integer> getAffinitySet() {
    if (this.affinitySet == null)
      this.affinitySet = new ArrayList<>(); 
    return this.affinitySet;
  }
}
