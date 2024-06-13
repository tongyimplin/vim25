package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiAdvancedOptionsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiAdvancedOptionsRequestType", propOrder = {"_this", "iScsiHbaDevice", "targetSet", "options"})
public class UpdateInternetScsiAdvancedOptionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  protected HostInternetScsiHbaTargetSet targetSet;
  
  @XmlElement(required = true)
  protected List<HostInternetScsiHbaParamValue> options;
  
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
  
  public HostInternetScsiHbaTargetSet getTargetSet() {
    return this.targetSet;
  }
  
  public void setTargetSet(HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet) {
    this.targetSet = paramHostInternetScsiHbaTargetSet;
  }
  
  public List<HostInternetScsiHbaParamValue> getOptions() {
    if (this.options == null)
      this.options = new ArrayList<>(); 
    return this.options;
  }
}
