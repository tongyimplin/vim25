package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareDVSPvlanMapEntry;
import com.vmware.vim25.VMwareDVSPvlanMapEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareDVSPvlanMapEntry", propOrder = {"vMwareDVSPvlanMapEntry"})
public class ArrayOfVMwareDVSPvlanMapEntry {
  @XmlElement(name = "VMwareDVSPvlanMapEntry")
  protected List<VMwareDVSPvlanMapEntry> vMwareDVSPvlanMapEntry;
  
  public List<VMwareDVSPvlanMapEntry> getVMwareDVSPvlanMapEntry() {
    if (this.vMwareDVSPvlanMapEntry == null)
      this.vMwareDVSPvlanMapEntry = new ArrayList<>(); 
    return this.vMwareDVSPvlanMapEntry;
  }
}
