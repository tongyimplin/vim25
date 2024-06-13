package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVsanHostDiskMapInfo;
import com.vmware.vim25.VsanHostDiskMapInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostDiskMapInfo", propOrder = {"vsanHostDiskMapInfo"})
public class ArrayOfVsanHostDiskMapInfo {
  @XmlElement(name = "VsanHostDiskMapInfo")
  protected List<VsanHostDiskMapInfo> vsanHostDiskMapInfo;
  
  public List<VsanHostDiskMapInfo> getVsanHostDiskMapInfo() {
    if (this.vsanHostDiskMapInfo == null)
      this.vsanHostDiskMapInfo = new ArrayList<>(); 
    return this.vsanHostDiskMapInfo;
  }
}
