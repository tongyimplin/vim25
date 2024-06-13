package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmDimmInfo;
import com.vmware.vim25.NvdimmDimmInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmDimmInfo", propOrder = {"nvdimmDimmInfo"})
public class ArrayOfNvdimmDimmInfo {
  @XmlElement(name = "NvdimmDimmInfo")
  protected List<NvdimmDimmInfo> nvdimmDimmInfo;
  
  public List<NvdimmDimmInfo> getNvdimmDimmInfo() {
    if (this.nvdimmDimmInfo == null)
      this.nvdimmDimmInfo = new ArrayList<>(); 
    return this.nvdimmDimmInfo;
  }
}
