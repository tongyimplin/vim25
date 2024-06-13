package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostDiskMapping;
import com.vmware.vim25.VsanHostDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostDiskMapping", propOrder = {"vsanHostDiskMapping"})
public class ArrayOfVsanHostDiskMapping {
  @XmlElement(name = "VsanHostDiskMapping")
  protected List<VsanHostDiskMapping> vsanHostDiskMapping;
  
  public List<VsanHostDiskMapping> getVsanHostDiskMapping() {
    if (this.vsanHostDiskMapping == null)
      this.vsanHostDiskMapping = new ArrayList<>(); 
    return this.vsanHostDiskMapping;
  }
}
