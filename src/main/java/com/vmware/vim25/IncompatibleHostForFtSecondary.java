package com.vmware.vim25;

import com.vmware.vim25.IncompatibleHostForFtSecondary;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmFaultToleranceIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompatibleHostForFtSecondary", propOrder = {"host", "error"})
public class IncompatibleHostForFtSecondary extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<LocalizedMethodFault> error;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
