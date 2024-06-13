package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RunVsanPhysicalDiskDiagnosticsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunVsanPhysicalDiskDiagnosticsRequestType", propOrder = {"_this", "disks"})
public class RunVsanPhysicalDiskDiagnosticsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> disks;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getDisks() {
    if (this.disks == null)
      this.disks = new ArrayList<>(); 
    return this.disks;
  }
}
