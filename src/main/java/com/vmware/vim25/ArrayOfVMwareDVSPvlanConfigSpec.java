package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareDVSPvlanConfigSpec;
import com.vmware.vim25.VMwareDVSPvlanConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareDVSPvlanConfigSpec", propOrder = {"vMwareDVSPvlanConfigSpec"})
public class ArrayOfVMwareDVSPvlanConfigSpec {
  @XmlElement(name = "VMwareDVSPvlanConfigSpec")
  protected List<VMwareDVSPvlanConfigSpec> vMwareDVSPvlanConfigSpec;
  
  public List<VMwareDVSPvlanConfigSpec> getVMwareDVSPvlanConfigSpec() {
    if (this.vMwareDVSPvlanConfigSpec == null)
      this.vMwareDVSPvlanConfigSpec = new ArrayList<>(); 
    return this.vMwareDVSPvlanConfigSpec;
  }
}
