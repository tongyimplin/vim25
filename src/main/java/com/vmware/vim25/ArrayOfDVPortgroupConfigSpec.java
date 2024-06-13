package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVPortgroupConfigSpec;
import com.vmware.vim25.DVPortgroupConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVPortgroupConfigSpec", propOrder = {"dvPortgroupConfigSpec"})
public class ArrayOfDVPortgroupConfigSpec {
  @XmlElement(name = "DVPortgroupConfigSpec")
  protected List<DVPortgroupConfigSpec> dvPortgroupConfigSpec;
  
  public List<DVPortgroupConfigSpec> getDVPortgroupConfigSpec() {
    if (this.dvPortgroupConfigSpec == null)
      this.dvPortgroupConfigSpec = new ArrayList<>(); 
    return this.dvPortgroupConfigSpec;
  }
}
