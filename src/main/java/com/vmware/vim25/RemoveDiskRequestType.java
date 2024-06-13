package com.vmware.vim25;

import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveDiskRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveDiskRequestType", propOrder = {"_this", "disk", "maintenanceSpec", "timeout"})
public class RemoveDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<HostScsiDisk> disk;
  
  protected HostMaintenanceSpec maintenanceSpec;
  
  protected Integer timeout;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostScsiDisk> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public HostMaintenanceSpec getMaintenanceSpec() {
    return this.maintenanceSpec;
  }
  
  public void setMaintenanceSpec(HostMaintenanceSpec paramHostMaintenanceSpec) {
    this.maintenanceSpec = paramHostMaintenanceSpec;
  }
  
  public Integer getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(Integer paramInteger) {
    this.timeout = paramInteger;
  }
}
