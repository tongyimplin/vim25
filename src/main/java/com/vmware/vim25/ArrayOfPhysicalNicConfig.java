package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicConfig;
import com.vmware.vim25.PhysicalNicConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicConfig", propOrder = {"physicalNicConfig"})
public class ArrayOfPhysicalNicConfig {
  @XmlElement(name = "PhysicalNicConfig")
  protected List<PhysicalNicConfig> physicalNicConfig;
  
  public List<PhysicalNicConfig> getPhysicalNicConfig() {
    if (this.physicalNicConfig == null)
      this.physicalNicConfig = new ArrayList<>(); 
    return this.physicalNicConfig;
  }
}
