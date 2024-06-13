package com.vmware.vim25;

import com.vmware.vim25.HostMaintenanceSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveDiskMappingRequestType;
import com.vmware.vim25.VsanHostDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveDiskMappingRequestType", propOrder = {"_this", "mapping", "maintenanceSpec", "timeout"})
public class RemoveDiskMappingRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VsanHostDiskMapping> mapping;
  
  protected HostMaintenanceSpec maintenanceSpec;
  
  protected Integer timeout;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VsanHostDiskMapping> getMapping() {
    if (this.mapping == null)
      this.mapping = new ArrayList<>(); 
    return this.mapping;
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
