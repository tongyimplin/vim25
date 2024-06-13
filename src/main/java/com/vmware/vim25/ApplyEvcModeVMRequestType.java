package com.vmware.vim25;

import com.vmware.vim25.ApplyEvcModeVMRequestType;
import com.vmware.vim25.HostFeatureMask;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyEvcModeVMRequestType", propOrder = {"_this", "mask", "completeMasks"})
public class ApplyEvcModeVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<HostFeatureMask> mask;
  
  protected Boolean completeMasks;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostFeatureMask> getMask() {
    if (this.mask == null)
      this.mask = new ArrayList<>(); 
    return this.mask;
  }
  
  public Boolean isCompleteMasks() {
    return this.completeMasks;
  }
  
  public void setCompleteMasks(Boolean paramBoolean) {
    this.completeMasks = paramBoolean;
  }
}
