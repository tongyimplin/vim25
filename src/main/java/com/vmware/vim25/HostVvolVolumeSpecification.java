package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVvolVolumeSpecification;
import com.vmware.vim25.VASAStorageArray;
import com.vmware.vim25.VimVasaProviderInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVvolVolumeSpecification", propOrder = {"maxSizeInMB", "volumeName", "vasaProviderInfo", "storageArray", "uuid"})
public class HostVvolVolumeSpecification extends DynamicData {
  protected long maxSizeInMB;
  
  @XmlElement(required = true)
  protected String volumeName;
  
  protected List<VimVasaProviderInfo> vasaProviderInfo;
  
  protected List<VASAStorageArray> storageArray;
  
  @XmlElement(required = true)
  protected String uuid;
  
  public long getMaxSizeInMB() {
    return this.maxSizeInMB;
  }
  
  public void setMaxSizeInMB(long paramLong) {
    this.maxSizeInMB = paramLong;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public void setVolumeName(String paramString) {
    this.volumeName = paramString;
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
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
}
