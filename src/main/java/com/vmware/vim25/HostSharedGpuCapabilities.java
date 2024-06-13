package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSharedGpuCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSharedGpuCapabilities", propOrder = {"vgpu", "diskSnapshotSupported", "memorySnapshotSupported", "suspendSupported", "migrateSupported"})
public class HostSharedGpuCapabilities extends DynamicData {
  @XmlElement(required = true)
  protected String vgpu;
  
  protected boolean diskSnapshotSupported;
  
  protected boolean memorySnapshotSupported;
  
  protected boolean suspendSupported;
  
  protected boolean migrateSupported;
  
  public String getVgpu() {
    return this.vgpu;
  }
  
  public void setVgpu(String paramString) {
    this.vgpu = paramString;
  }
  
  public boolean isDiskSnapshotSupported() {
    return this.diskSnapshotSupported;
  }
  
  public void setDiskSnapshotSupported(boolean paramBoolean) {
    this.diskSnapshotSupported = paramBoolean;
  }
  
  public boolean isMemorySnapshotSupported() {
    return this.memorySnapshotSupported;
  }
  
  public void setMemorySnapshotSupported(boolean paramBoolean) {
    this.memorySnapshotSupported = paramBoolean;
  }
  
  public boolean isSuspendSupported() {
    return this.suspendSupported;
  }
  
  public void setSuspendSupported(boolean paramBoolean) {
    this.suspendSupported = paramBoolean;
  }
  
  public boolean isMigrateSupported() {
    return this.migrateSupported;
  }
  
  public void setMigrateSupported(boolean paramBoolean) {
    this.migrateSupported = paramBoolean;
  }
}
