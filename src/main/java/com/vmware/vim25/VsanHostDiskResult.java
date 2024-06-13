package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VsanHostDiskResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskResult", propOrder = {"disk", "state", "vsanUuid", "error", "degraded"})
public class VsanHostDiskResult extends DynamicData {
  @XmlElement(required = true)
  protected HostScsiDisk disk;
  
  @XmlElement(required = true)
  protected String state;
  
  protected String vsanUuid;
  
  protected LocalizedMethodFault error;
  
  protected Boolean degraded;
  
  public HostScsiDisk getDisk() {
    return this.disk;
  }
  
  public void setDisk(HostScsiDisk paramHostScsiDisk) {
    this.disk = paramHostScsiDisk;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public String getVsanUuid() {
    return this.vsanUuid;
  }
  
  public void setVsanUuid(String paramString) {
    this.vsanUuid = paramString;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
  
  public Boolean isDegraded() {
    return this.degraded;
  }
  
  public void setDegraded(Boolean paramBoolean) {
    this.degraded = paramBoolean;
  }
}
