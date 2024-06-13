package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVPortConfigSpec;
import com.vmware.vim25.DVPortConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVPortConfigSpec", propOrder = {"dvPortConfigSpec"})
public class ArrayOfDVPortConfigSpec {
  @XmlElement(name = "DVPortConfigSpec")
  protected List<DVPortConfigSpec> dvPortConfigSpec;
  
  public List<DVPortConfigSpec> getDVPortConfigSpec() {
    if (this.dvPortConfigSpec == null)
      this.dvPortConfigSpec = new ArrayList<>(); 
    return this.dvPortConfigSpec;
  }
}
