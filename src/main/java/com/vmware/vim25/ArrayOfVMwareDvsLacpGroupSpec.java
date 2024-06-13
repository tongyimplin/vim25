package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareDvsLacpGroupSpec;
import com.vmware.vim25.VMwareDvsLacpGroupSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareDvsLacpGroupSpec", propOrder = {"vMwareDvsLacpGroupSpec"})
public class ArrayOfVMwareDvsLacpGroupSpec {
  @XmlElement(name = "VMwareDvsLacpGroupSpec")
  protected List<VMwareDvsLacpGroupSpec> vMwareDvsLacpGroupSpec;
  
  public List<VMwareDvsLacpGroupSpec> getVMwareDvsLacpGroupSpec() {
    if (this.vMwareDvsLacpGroupSpec == null)
      this.vMwareDvsLacpGroupSpec = new ArrayList<>(); 
    return this.vMwareDvsLacpGroupSpec;
  }
}
