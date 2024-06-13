package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHbrManagerVmReplicationCapability;
import com.vmware.vim25.HbrManagerVmReplicationCapability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHbrManagerVmReplicationCapability", propOrder = {"hbrManagerVmReplicationCapability"})
public class ArrayOfHbrManagerVmReplicationCapability {
  @XmlElement(name = "HbrManagerVmReplicationCapability")
  protected List<HbrManagerVmReplicationCapability> hbrManagerVmReplicationCapability;
  
  public List<HbrManagerVmReplicationCapability> getHbrManagerVmReplicationCapability() {
    if (this.hbrManagerVmReplicationCapability == null)
      this.hbrManagerVmReplicationCapability = new ArrayList<>(); 
    return this.hbrManagerVmReplicationCapability;
  }
}
