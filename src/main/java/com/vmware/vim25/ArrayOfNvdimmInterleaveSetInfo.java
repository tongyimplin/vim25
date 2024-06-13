package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmInterleaveSetInfo;
import com.vmware.vim25.NvdimmInterleaveSetInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmInterleaveSetInfo", propOrder = {"nvdimmInterleaveSetInfo"})
public class ArrayOfNvdimmInterleaveSetInfo {
  @XmlElement(name = "NvdimmInterleaveSetInfo")
  protected List<NvdimmInterleaveSetInfo> nvdimmInterleaveSetInfo;
  
  public List<NvdimmInterleaveSetInfo> getNvdimmInterleaveSetInfo() {
    if (this.nvdimmInterleaveSetInfo == null)
      this.nvdimmInterleaveSetInfo = new ArrayList<>(); 
    return this.nvdimmInterleaveSetInfo;
  }
}
