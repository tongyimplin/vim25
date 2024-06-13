package com.vmware.vim25;

import com.vmware.vim25.FtIssuesOnHostHostSelectionType;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PowerOnFtSecondaryFailed;
import com.vmware.vim25.VmFaultToleranceIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOnFtSecondaryFailed", propOrder = {"vm", "vmName", "hostSelectionBy", "hostErrors", "rootCause"})
public class PowerOnFtSecondaryFailed extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected FtIssuesOnHostHostSelectionType hostSelectionBy;
  
  protected List<LocalizedMethodFault> hostErrors;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault rootCause;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public FtIssuesOnHostHostSelectionType getHostSelectionBy() {
    return this.hostSelectionBy;
  }
  
  public void setHostSelectionBy(FtIssuesOnHostHostSelectionType paramFtIssuesOnHostHostSelectionType) {
    this.hostSelectionBy = paramFtIssuesOnHostHostSelectionType;
  }
  
  public List<LocalizedMethodFault> getHostErrors() {
    if (this.hostErrors == null)
      this.hostErrors = new ArrayList<>(); 
    return this.hostErrors;
  }
  
  public LocalizedMethodFault getRootCause() {
    return this.rootCause;
  }
  
  public void setRootCause(LocalizedMethodFault paramLocalizedMethodFault) {
    this.rootCause = paramLocalizedMethodFault;
  }
}
