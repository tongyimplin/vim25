package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVslmTagEntry;
import com.vmware.vim25.VslmTagEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVslmTagEntry", propOrder = {"vslmTagEntry"})
public class ArrayOfVslmTagEntry {
  @XmlElement(name = "VslmTagEntry")
  protected List<VslmTagEntry> vslmTagEntry;
  
  public List<VslmTagEntry> getVslmTagEntry() {
    if (this.vslmTagEntry == null)
      this.vslmTagEntry = new ArrayList<>(); 
    return this.vslmTagEntry;
  }
}
