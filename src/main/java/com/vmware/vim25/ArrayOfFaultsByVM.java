package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFaultsByVM;
import com.vmware.vim25.FaultsByVM;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultsByVM", propOrder = {"faultsByVM"})
public class ArrayOfFaultsByVM {
  @XmlElement(name = "FaultsByVM")
  protected List<FaultsByVM> faultsByVM;
  
  public List<FaultsByVM> getFaultsByVM() {
    if (this.faultsByVM == null)
      this.faultsByVM = new ArrayList<>(); 
    return this.faultsByVM;
  }
}
