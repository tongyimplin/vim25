package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVimVasaProviderStatePerArray;
import com.vmware.vim25.VimVasaProviderStatePerArray;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVimVasaProviderStatePerArray", propOrder = {"vimVasaProviderStatePerArray"})
public class ArrayOfVimVasaProviderStatePerArray {
  @XmlElement(name = "VimVasaProviderStatePerArray")
  protected List<VimVasaProviderStatePerArray> vimVasaProviderStatePerArray;
  
  public List<VimVasaProviderStatePerArray> getVimVasaProviderStatePerArray() {
    if (this.vimVasaProviderStatePerArray == null)
      this.vimVasaProviderStatePerArray = new ArrayList<>(); 
    return this.vimVasaProviderStatePerArray;
  }
}
