package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFaultsByHost;
import com.vmware.vim25.FaultsByHost;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultsByHost", propOrder = {"faultsByHost"})
public class ArrayOfFaultsByHost {
  @XmlElement(name = "FaultsByHost")
  protected List<FaultsByHost> faultsByHost;
  
  public List<FaultsByHost> getFaultsByHost() {
    if (this.faultsByHost == null)
      this.faultsByHost = new ArrayList<>(); 
    return this.faultsByHost;
  }
}
