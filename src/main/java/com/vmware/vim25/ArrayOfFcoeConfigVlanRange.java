package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFcoeConfigVlanRange;
import com.vmware.vim25.FcoeConfigVlanRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFcoeConfigVlanRange", propOrder = {"fcoeConfigVlanRange"})
public class ArrayOfFcoeConfigVlanRange {
  @XmlElement(name = "FcoeConfigVlanRange")
  protected List<FcoeConfigVlanRange> fcoeConfigVlanRange;
  
  public List<FcoeConfigVlanRange> getFcoeConfigVlanRange() {
    if (this.fcoeConfigVlanRange == null)
      this.fcoeConfigVlanRange = new ArrayList<>(); 
    return this.fcoeConfigVlanRange;
  }
}
