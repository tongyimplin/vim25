package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVnicPortArgument;
import com.vmware.vim25.VnicPortArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVnicPortArgument", propOrder = {"vnicPortArgument"})
public class ArrayOfVnicPortArgument {
  @XmlElement(name = "VnicPortArgument")
  protected List<VnicPortArgument> vnicPortArgument;
  
  public List<VnicPortArgument> getVnicPortArgument() {
    if (this.vnicPortArgument == null)
      this.vnicPortArgument = new ArrayList<>(); 
    return this.vnicPortArgument;
  }
}
