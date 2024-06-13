package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolume;
import com.vmware.vim25.HostVvolVolume;
import com.vmware.vim25.VASAStorageArray;
import com.vmware.vim25.VVolHostPE;
import com.vmware.vim25.VimVasaProviderInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVvolVolume", propOrder = {"scId", "hostPE", "vasaProviderInfo", "storageArray"})
public class HostVvolVolume extends HostFileSystemVolume {
  @XmlElement(required = true)
  protected String scId;
  
  protected List<VVolHostPE> hostPE;
  
  protected List<VimVasaProviderInfo> vasaProviderInfo;
  
  protected List<VASAStorageArray> storageArray;
  
  public String getScId() {
    return this.scId;
  }
  
  public void setScId(String paramString) {
    this.scId = paramString;
  }
  
  public List<VVolHostPE> getHostPE() {
    if (this.hostPE == null)
      this.hostPE = new ArrayList<>(); 
    return this.hostPE;
  }
  
  public List<VimVasaProviderInfo> getVasaProviderInfo() {
    if (this.vasaProviderInfo == null)
      this.vasaProviderInfo = new ArrayList<>(); 
    return this.vasaProviderInfo;
  }
  
  public List<VASAStorageArray> getStorageArray() {
    if (this.storageArray == null)
      this.storageArray = new ArrayList<>(); 
    return this.storageArray;
  }
}
