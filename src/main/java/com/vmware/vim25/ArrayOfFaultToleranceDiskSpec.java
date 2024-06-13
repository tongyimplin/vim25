package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFaultToleranceDiskSpec;
import com.vmware.vim25.FaultToleranceDiskSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultToleranceDiskSpec", propOrder = {"faultToleranceDiskSpec"})
public class ArrayOfFaultToleranceDiskSpec {
  @XmlElement(name = "FaultToleranceDiskSpec")
  protected List<FaultToleranceDiskSpec> faultToleranceDiskSpec;
  
  public List<FaultToleranceDiskSpec> getFaultToleranceDiskSpec() {
    if (this.faultToleranceDiskSpec == null)
      this.faultToleranceDiskSpec = new ArrayList<>(); 
    return this.faultToleranceDiskSpec;
  }
}
