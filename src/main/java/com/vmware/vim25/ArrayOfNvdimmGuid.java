package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmGuid;
import com.vmware.vim25.NvdimmGuid;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmGuid", propOrder = {"nvdimmGuid"})
public class ArrayOfNvdimmGuid {
  @XmlElement(name = "NvdimmGuid")
  protected List<NvdimmGuid> nvdimmGuid;
  
  public List<NvdimmGuid> getNvdimmGuid() {
    if (this.nvdimmGuid == null)
      this.nvdimmGuid = new ArrayList<>(); 
    return this.nvdimmGuid;
  }
}
