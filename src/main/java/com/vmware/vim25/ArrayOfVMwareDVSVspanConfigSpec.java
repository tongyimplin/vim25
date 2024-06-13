package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareDVSVspanConfigSpec;
import com.vmware.vim25.VMwareDVSVspanConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareDVSVspanConfigSpec", propOrder = {"vMwareDVSVspanConfigSpec"})
public class ArrayOfVMwareDVSVspanConfigSpec {
  @XmlElement(name = "VMwareDVSVspanConfigSpec")
  protected List<VMwareDVSVspanConfigSpec> vMwareDVSVspanConfigSpec;
  
  public List<VMwareDVSVspanConfigSpec> getVMwareDVSVspanConfigSpec() {
    if (this.vMwareDVSVspanConfigSpec == null)
      this.vMwareDVSVspanConfigSpec = new ArrayList<>(); 
    return this.vMwareDVSVspanConfigSpec;
  }
}
