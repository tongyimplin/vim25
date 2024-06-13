package com.vmware.vim25;

import com.vmware.vim25.CompositeHostProfileRequestType;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeHostProfileRequestType", propOrder = {"_this", "source", "targets", "toBeMerged", "toBeReplacedWith", "toBeDeleted", "enableStatusToBeCopied"})
public class CompositeHostProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  protected List<ManagedObjectReference> targets;
  
  protected HostApplyProfile toBeMerged;
  
  protected HostApplyProfile toBeReplacedWith;
  
  protected HostApplyProfile toBeDeleted;
  
  protected HostApplyProfile enableStatusToBeCopied;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getTargets() {
    if (this.targets == null)
      this.targets = new ArrayList<>(); 
    return this.targets;
  }
  
  public HostApplyProfile getToBeMerged() {
    return this.toBeMerged;
  }
  
  public void setToBeMerged(HostApplyProfile paramHostApplyProfile) {
    this.toBeMerged = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeReplacedWith() {
    return this.toBeReplacedWith;
  }
  
  public void setToBeReplacedWith(HostApplyProfile paramHostApplyProfile) {
    this.toBeReplacedWith = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeDeleted() {
    return this.toBeDeleted;
  }
  
  public void setToBeDeleted(HostApplyProfile paramHostApplyProfile) {
    this.toBeDeleted = paramHostApplyProfile;
  }
  
  public HostApplyProfile getEnableStatusToBeCopied() {
    return this.enableStatusToBeCopied;
  }
  
  public void setEnableStatusToBeCopied(HostApplyProfile paramHostApplyProfile) {
    this.enableStatusToBeCopied = paramHostApplyProfile;
  }
}
