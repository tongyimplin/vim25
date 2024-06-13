package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareDvsLacpGroupConfig;
import com.vmware.vim25.VMwareDvsLacpGroupConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareDvsLacpGroupConfig", propOrder = {"vMwareDvsLacpGroupConfig"})
public class ArrayOfVMwareDvsLacpGroupConfig {
  @XmlElement(name = "VMwareDvsLacpGroupConfig")
  protected List<VMwareDvsLacpGroupConfig> vMwareDvsLacpGroupConfig;
  
  public List<VMwareDvsLacpGroupConfig> getVMwareDvsLacpGroupConfig() {
    if (this.vMwareDvsLacpGroupConfig == null)
      this.vMwareDvsLacpGroupConfig = new ArrayList<>(); 
    return this.vMwareDvsLacpGroupConfig;
  }
}
