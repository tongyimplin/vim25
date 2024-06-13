package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VimVasaProvider;
import com.vmware.vim25.VimVasaProviderInfo;
import com.vmware.vim25.VimVasaProviderStatePerArray;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProviderInfo", propOrder = {"provider", "arrayState"})
public class VimVasaProviderInfo extends DynamicData {
  @XmlElement(required = true)
  protected VimVasaProvider provider;
  
  protected List<VimVasaProviderStatePerArray> arrayState;
  
  public VimVasaProvider getProvider() {
    return this.provider;
  }
  
  public void setProvider(VimVasaProvider paramVimVasaProvider) {
    this.provider = paramVimVasaProvider;
  }
  
  public List<VimVasaProviderStatePerArray> getArrayState() {
    if (this.arrayState == null)
      this.arrayState = new ArrayList<>(); 
    return this.arrayState;
  }
}
