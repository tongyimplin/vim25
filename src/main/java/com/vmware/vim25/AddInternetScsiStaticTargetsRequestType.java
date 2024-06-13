package com.vmware.vim25;

import com.vmware.vim25.AddInternetScsiStaticTargetsRequestType;
import com.vmware.vim25.HostInternetScsiHbaStaticTarget;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddInternetScsiStaticTargetsRequestType", propOrder = {"_this", "iScsiHbaDevice", "targets"})
public class AddInternetScsiStaticTargetsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected List<HostInternetScsiHbaStaticTarget> targets;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIScsiHbaDevice() {
    return this.iScsiHbaDevice;
  }
  
  public void setIScsiHbaDevice(String paramString) {
    this.iScsiHbaDevice = paramString;
  }
  
  public List<HostInternetScsiHbaStaticTarget> getTargets() {
    if (this.targets == null)
      this.targets = new ArrayList<>(); 
    return this.targets;
  }
}
