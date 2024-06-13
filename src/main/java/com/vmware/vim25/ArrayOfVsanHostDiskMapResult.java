package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostDiskMapResult;
import com.vmware.vim25.VsanHostDiskMapResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostDiskMapResult", propOrder = {"vsanHostDiskMapResult"})
public class ArrayOfVsanHostDiskMapResult {
  @XmlElement(name = "VsanHostDiskMapResult")
  protected List<VsanHostDiskMapResult> vsanHostDiskMapResult;
  
  public List<VsanHostDiskMapResult> getVsanHostDiskMapResult() {
    if (this.vsanHostDiskMapResult == null)
      this.vsanHostDiskMapResult = new ArrayList<>(); 
    return this.vsanHostDiskMapResult;
  }
}
