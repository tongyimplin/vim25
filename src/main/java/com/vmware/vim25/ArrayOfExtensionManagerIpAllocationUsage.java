package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtensionManagerIpAllocationUsage;
import com.vmware.vim25.ExtensionManagerIpAllocationUsage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionManagerIpAllocationUsage", propOrder = {"extensionManagerIpAllocationUsage"})
public class ArrayOfExtensionManagerIpAllocationUsage {
  @XmlElement(name = "ExtensionManagerIpAllocationUsage")
  protected List<ExtensionManagerIpAllocationUsage> extensionManagerIpAllocationUsage;
  
  public List<ExtensionManagerIpAllocationUsage> getExtensionManagerIpAllocationUsage() {
    if (this.extensionManagerIpAllocationUsage == null)
      this.extensionManagerIpAllocationUsage = new ArrayList<>(); 
    return this.extensionManagerIpAllocationUsage;
  }
}
