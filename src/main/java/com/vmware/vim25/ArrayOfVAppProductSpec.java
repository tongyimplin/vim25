package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppProductSpec;
import com.vmware.vim25.VAppProductSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppProductSpec", propOrder = {"vAppProductSpec"})
public class ArrayOfVAppProductSpec {
  @XmlElement(name = "VAppProductSpec")
  protected List<VAppProductSpec> vAppProductSpec;
  
  public List<VAppProductSpec> getVAppProductSpec() {
    if (this.vAppProductSpec == null)
      this.vAppProductSpec = new ArrayList<>(); 
    return this.vAppProductSpec;
  }
}
