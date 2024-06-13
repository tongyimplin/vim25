package com.vmware.vim25;

import com.vmware.vim25.CheckResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckResult", propOrder = {"vm", "host", "warning", "error"})
public class CheckResult extends DynamicData {
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference host;
  
  protected List<LocalizedMethodFault> warning;
  
  protected List<LocalizedMethodFault> error;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<LocalizedMethodFault> getWarning() {
    if (this.warning == null)
      this.warning = new ArrayList<>(); 
    return this.warning;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
