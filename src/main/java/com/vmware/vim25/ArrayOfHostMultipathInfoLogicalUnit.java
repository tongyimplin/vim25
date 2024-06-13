package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostMultipathInfoLogicalUnit;
import com.vmware.vim25.HostMultipathInfoLogicalUnit;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMultipathInfoLogicalUnit", propOrder = {"hostMultipathInfoLogicalUnit"})
public class ArrayOfHostMultipathInfoLogicalUnit {
  @XmlElement(name = "HostMultipathInfoLogicalUnit")
  protected List<HostMultipathInfoLogicalUnit> hostMultipathInfoLogicalUnit;
  
  public List<HostMultipathInfoLogicalUnit> getHostMultipathInfoLogicalUnit() {
    if (this.hostMultipathInfoLogicalUnit == null)
      this.hostMultipathInfoLogicalUnit = new ArrayList<>(); 
    return this.hostMultipathInfoLogicalUnit;
  }
}
