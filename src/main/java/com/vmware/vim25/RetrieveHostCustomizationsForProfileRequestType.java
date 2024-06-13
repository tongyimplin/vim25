package com.vmware.vim25;

import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveHostCustomizationsForProfileRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveHostCustomizationsForProfileRequestType", propOrder = {"_this", "hosts", "applyProfile"})
public class RetrieveHostCustomizationsForProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ManagedObjectReference> hosts;
  
  @XmlElement(required = true)
  protected HostApplyProfile applyProfile;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
  
  public HostApplyProfile getApplyProfile() {
    return this.applyProfile;
  }
  
  public void setApplyProfile(HostApplyProfile paramHostApplyProfile) {
    this.applyProfile = paramHostApplyProfile;
  }
}
