package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostDiskResult;
import com.vmware.vim25.VsanHostDiskResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostDiskResult", propOrder = {"vsanHostDiskResult"})
public class ArrayOfVsanHostDiskResult {
  @XmlElement(name = "VsanHostDiskResult")
  protected List<VsanHostDiskResult> vsanHostDiskResult;
  
  public List<VsanHostDiskResult> getVsanHostDiskResult() {
    if (this.vsanHostDiskResult == null)
      this.vsanHostDiskResult = new ArrayList<>(); 
    return this.vsanHostDiskResult;
  }
}
