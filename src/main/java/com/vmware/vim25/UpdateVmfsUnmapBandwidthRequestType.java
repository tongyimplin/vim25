package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVmfsUnmapBandwidthRequestType;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVmfsUnmapBandwidthRequestType", propOrder = {"_this", "vmfsUuid", "unmapBandwidthSpec"})
public class UpdateVmfsUnmapBandwidthRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vmfsUuid;
  
  @XmlElement(required = true)
  protected VmfsUnmapBandwidthSpec unmapBandwidthSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVmfsUuid() {
    return this.vmfsUuid;
  }
  
  public void setVmfsUuid(String paramString) {
    this.vmfsUuid = paramString;
  }
  
  public VmfsUnmapBandwidthSpec getUnmapBandwidthSpec() {
    return this.unmapBandwidthSpec;
  }
  
  public void setUnmapBandwidthSpec(VmfsUnmapBandwidthSpec paramVmfsUnmapBandwidthSpec) {
    this.unmapBandwidthSpec = paramVmfsUnmapBandwidthSpec;
  }
}
