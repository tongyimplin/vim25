package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HbrManagerVmReplicationCapability;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrManagerVmReplicationCapability", propOrder = {"vm", "supportedQuiesceMode", "compressionSupported", "maxSupportedSourceDiskCapacity", "minRpo", "fault"})
public class HbrManagerVmReplicationCapability extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String supportedQuiesceMode;
  
  protected boolean compressionSupported;
  
  protected long maxSupportedSourceDiskCapacity;
  
  protected Long minRpo;
  
  protected LocalizedMethodFault fault;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getSupportedQuiesceMode() {
    return this.supportedQuiesceMode;
  }
  
  public void setSupportedQuiesceMode(String paramString) {
    this.supportedQuiesceMode = paramString;
  }
  
  public boolean isCompressionSupported() {
    return this.compressionSupported;
  }
  
  public void setCompressionSupported(boolean paramBoolean) {
    this.compressionSupported = paramBoolean;
  }
  
  public long getMaxSupportedSourceDiskCapacity() {
    return this.maxSupportedSourceDiskCapacity;
  }
  
  public void setMaxSupportedSourceDiskCapacity(long paramLong) {
    this.maxSupportedSourceDiskCapacity = paramLong;
  }
  
  public Long getMinRpo() {
    return this.minRpo;
  }
  
  public void setMinRpo(Long paramLong) {
    this.minRpo = paramLong;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
