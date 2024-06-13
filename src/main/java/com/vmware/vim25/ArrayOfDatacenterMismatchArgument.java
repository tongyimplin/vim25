package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDatacenterMismatchArgument;
import com.vmware.vim25.DatacenterMismatchArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatacenterMismatchArgument", propOrder = {"datacenterMismatchArgument"})
public class ArrayOfDatacenterMismatchArgument {
  @XmlElement(name = "DatacenterMismatchArgument")
  protected List<DatacenterMismatchArgument> datacenterMismatchArgument;
  
  public List<DatacenterMismatchArgument> getDatacenterMismatchArgument() {
    if (this.datacenterMismatchArgument == null)
      this.datacenterMismatchArgument = new ArrayList<>(); 
    return this.datacenterMismatchArgument;
  }
}
