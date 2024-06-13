package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVimVasaProviderInfo;
import com.vmware.vim25.VimVasaProviderInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVimVasaProviderInfo", propOrder = {"vimVasaProviderInfo"})
public class ArrayOfVimVasaProviderInfo {
  @XmlElement(name = "VimVasaProviderInfo")
  protected List<VimVasaProviderInfo> vimVasaProviderInfo;
  
  public List<VimVasaProviderInfo> getVimVasaProviderInfo() {
    if (this.vimVasaProviderInfo == null)
      this.vimVasaProviderInfo = new ArrayList<>(); 
    return this.vimVasaProviderInfo;
  }
}
