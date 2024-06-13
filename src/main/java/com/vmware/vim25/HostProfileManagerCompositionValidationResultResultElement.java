package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostProfileManagerCompositionValidationResultResultElement;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerCompositionValidationResultResultElement", propOrder = {"target", "status", "errors", "sourceDiffForToBeMerged", "targetDiffForToBeMerged", "toBeAdded", "toBeDeleted", "toBeDisabled", "toBeEnabled", "toBeReenableCC"})
public class HostProfileManagerCompositionValidationResultResultElement extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference target;
  
  @XmlElement(required = true)
  protected String status;
  
  protected List<LocalizableMessage> errors;
  
  protected HostApplyProfile sourceDiffForToBeMerged;
  
  protected HostApplyProfile targetDiffForToBeMerged;
  
  protected HostApplyProfile toBeAdded;
  
  protected HostApplyProfile toBeDeleted;
  
  protected HostApplyProfile toBeDisabled;
  
  protected HostApplyProfile toBeEnabled;
  
  protected HostApplyProfile toBeReenableCC;
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<LocalizableMessage> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
  
  public HostApplyProfile getSourceDiffForToBeMerged() {
    return this.sourceDiffForToBeMerged;
  }
  
  public void setSourceDiffForToBeMerged(HostApplyProfile paramHostApplyProfile) {
    this.sourceDiffForToBeMerged = paramHostApplyProfile;
  }
  
  public HostApplyProfile getTargetDiffForToBeMerged() {
    return this.targetDiffForToBeMerged;
  }
  
  public void setTargetDiffForToBeMerged(HostApplyProfile paramHostApplyProfile) {
    this.targetDiffForToBeMerged = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeAdded() {
    return this.toBeAdded;
  }
  
  public void setToBeAdded(HostApplyProfile paramHostApplyProfile) {
    this.toBeAdded = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeDeleted() {
    return this.toBeDeleted;
  }
  
  public void setToBeDeleted(HostApplyProfile paramHostApplyProfile) {
    this.toBeDeleted = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeDisabled() {
    return this.toBeDisabled;
  }
  
  public void setToBeDisabled(HostApplyProfile paramHostApplyProfile) {
    this.toBeDisabled = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeEnabled() {
    return this.toBeEnabled;
  }
  
  public void setToBeEnabled(HostApplyProfile paramHostApplyProfile) {
    this.toBeEnabled = paramHostApplyProfile;
  }
  
  public HostApplyProfile getToBeReenableCC() {
    return this.toBeReenableCC;
  }
  
  public void setToBeReenableCC(HostApplyProfile paramHostApplyProfile) {
    this.toBeReenableCC = paramHostApplyProfile;
  }
}
