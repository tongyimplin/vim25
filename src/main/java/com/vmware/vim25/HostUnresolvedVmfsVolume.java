package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostUnresolvedVmfsExtent;
import com.vmware.vim25.HostUnresolvedVmfsVolume;
import com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsVolume", propOrder = {"extent", "vmfsLabel", "vmfsUuid", "totalBlocks", "resolveStatus"})
public class HostUnresolvedVmfsVolume extends DynamicData {
  @XmlElement(required = true)
  protected List<HostUnresolvedVmfsExtent> extent;
  
  @XmlElement(required = true)
  protected String vmfsLabel;
  
  @XmlElement(required = true)
  protected String vmfsUuid;
  
  protected int totalBlocks;
  
  @XmlElement(required = true)
  protected HostUnresolvedVmfsVolumeResolveStatus resolveStatus;
  
  public List<HostUnresolvedVmfsExtent> getExtent() {
    if (this.extent == null)
      this.extent = new ArrayList<>(); 
    return this.extent;
  }
  
  public String getVmfsLabel() {
    return this.vmfsLabel;
  }
  
  public void setVmfsLabel(String paramString) {
    this.vmfsLabel = paramString;
  }
  
  public String getVmfsUuid() {
    return this.vmfsUuid;
  }
  
  public void setVmfsUuid(String paramString) {
    this.vmfsUuid = paramString;
  }
  
  public int getTotalBlocks() {
    return this.totalBlocks;
  }
  
  public void setTotalBlocks(int paramInt) {
    this.totalBlocks = paramInt;
  }
  
  public HostUnresolvedVmfsVolumeResolveStatus getResolveStatus() {
    return this.resolveStatus;
  }
  
  public void setResolveStatus(HostUnresolvedVmfsVolumeResolveStatus paramHostUnresolvedVmfsVolumeResolveStatus) {
    this.resolveStatus = paramHostUnresolvedVmfsVolumeResolveStatus;
  }
}
