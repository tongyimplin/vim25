package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppPropertySpec;
import com.vmware.vim25.VAppPropertySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppPropertySpec", propOrder = {"vAppPropertySpec"})
public class ArrayOfVAppPropertySpec {
  @XmlElement(name = "VAppPropertySpec")
  protected List<VAppPropertySpec> vAppPropertySpec;
  
  public List<VAppPropertySpec> getVAppPropertySpec() {
    if (this.vAppPropertySpec == null)
      this.vAppPropertySpec = new ArrayList<>(); 
    return this.vAppPropertySpec;
  }
}
