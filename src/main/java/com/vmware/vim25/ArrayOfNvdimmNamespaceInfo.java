package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmNamespaceInfo;
import com.vmware.vim25.NvdimmNamespaceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmNamespaceInfo", propOrder = {"nvdimmNamespaceInfo"})
public class ArrayOfNvdimmNamespaceInfo {
  @XmlElement(name = "NvdimmNamespaceInfo")
  protected List<NvdimmNamespaceInfo> nvdimmNamespaceInfo;
  
  public List<NvdimmNamespaceInfo> getNvdimmNamespaceInfo() {
    if (this.nvdimmNamespaceInfo == null)
      this.nvdimmNamespaceInfo = new ArrayList<>(); 
    return this.nvdimmNamespaceInfo;
  }
}
