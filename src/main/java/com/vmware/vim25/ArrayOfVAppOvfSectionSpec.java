package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppOvfSectionSpec;
import com.vmware.vim25.VAppOvfSectionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppOvfSectionSpec", propOrder = {"vAppOvfSectionSpec"})
public class ArrayOfVAppOvfSectionSpec {
  @XmlElement(name = "VAppOvfSectionSpec")
  protected List<VAppOvfSectionSpec> vAppOvfSectionSpec;
  
  public List<VAppOvfSectionSpec> getVAppOvfSectionSpec() {
    if (this.vAppOvfSectionSpec == null)
      this.vAppOvfSectionSpec = new ArrayList<>(); 
    return this.vAppOvfSectionSpec;
  }
}
