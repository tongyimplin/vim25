package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNvdimmNamespaceDetails;
import com.vmware.vim25.NvdimmNamespaceDetails;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmNamespaceDetails", propOrder = {"nvdimmNamespaceDetails"})
public class ArrayOfNvdimmNamespaceDetails {
  @XmlElement(name = "NvdimmNamespaceDetails")
  protected List<NvdimmNamespaceDetails> nvdimmNamespaceDetails;
  
  public List<NvdimmNamespaceDetails> getNvdimmNamespaceDetails() {
    if (this.nvdimmNamespaceDetails == null)
      this.nvdimmNamespaceDetails = new ArrayList<>(); 
    return this.nvdimmNamespaceDetails;
  }
}
