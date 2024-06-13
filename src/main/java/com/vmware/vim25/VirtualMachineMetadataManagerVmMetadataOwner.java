package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataOwner;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataOwner", propOrder = {"name"})
public class VirtualMachineMetadataManagerVmMetadataOwner extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
