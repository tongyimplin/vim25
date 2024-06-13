package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVVolHostPE;
import com.vmware.vim25.VVolHostPE;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVVolHostPE", propOrder = {"vVolHostPE"})
public class ArrayOfVVolHostPE {
  @XmlElement(name = "VVolHostPE")
  protected List<VVolHostPE> vVolHostPE;
  
  public List<VVolHostPE> getVVolHostPE() {
    if (this.vVolHostPE == null)
      this.vVolHostPE = new ArrayList<>(); 
    return this.vVolHostPE;
  }
}
