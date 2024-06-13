package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmRegionInfo;
import com.vmware.vim25.NvdimmRegionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmRegionInfo", propOrder = {"nvdimmRegionInfo"})
public class ArrayOfNvdimmRegionInfo {
  @XmlElement(name = "NvdimmRegionInfo")
  protected List<NvdimmRegionInfo> nvdimmRegionInfo;
  
  public List<NvdimmRegionInfo> getNvdimmRegionInfo() {
    if (this.nvdimmRegionInfo == null)
      this.nvdimmRegionInfo = new ArrayList<>(); 
    return this.nvdimmRegionInfo;
  }
}
