package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.VirtualMachineInstantCloneSpec;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineInstantCloneSpec", propOrder = {"name", "location", "config", "biosUuid"})
public class VirtualMachineInstantCloneSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec location;
  
  protected List<OptionValue> config;
  
  protected String biosUuid;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public VirtualMachineRelocateSpec getLocation() {
    return this.location;
  }
  
  public void setLocation(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.location = paramVirtualMachineRelocateSpec;
  }
  
  public List<OptionValue> getConfig() {
    if (this.config == null)
      this.config = new ArrayList<>(); 
    return this.config;
  }
  
  public String getBiosUuid() {
    return this.biosUuid;
  }
  
  public void setBiosUuid(String paramString) {
    this.biosUuid = paramString;
  }
}
