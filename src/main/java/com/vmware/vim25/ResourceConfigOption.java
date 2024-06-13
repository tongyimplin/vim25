package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourceAllocationOption;
import com.vmware.vim25.ResourceConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceConfigOption", propOrder = {"cpuAllocationOption", "memoryAllocationOption"})
public class ResourceConfigOption extends DynamicData {
  @XmlElement(required = true)
  protected ResourceAllocationOption cpuAllocationOption;
  
  @XmlElement(required = true)
  protected ResourceAllocationOption memoryAllocationOption;
  
  public ResourceAllocationOption getCpuAllocationOption() {
    return this.cpuAllocationOption;
  }
  
  public void setCpuAllocationOption(ResourceAllocationOption paramResourceAllocationOption) {
    this.cpuAllocationOption = paramResourceAllocationOption;
  }
  
  public ResourceAllocationOption getMemoryAllocationOption() {
    return this.memoryAllocationOption;
  }
  
  public void setMemoryAllocationOption(ResourceAllocationOption paramResourceAllocationOption) {
    this.memoryAllocationOption = paramResourceAllocationOption;
  }
}
