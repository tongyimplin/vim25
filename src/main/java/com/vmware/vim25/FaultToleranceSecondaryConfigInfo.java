package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.FaultToleranceSecondaryConfigInfo;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceSecondaryConfigInfo", propOrder = {"primaryVM"})
public class FaultToleranceSecondaryConfigInfo extends FaultToleranceConfigInfo {
  @XmlElement(required = true)
  protected ManagedObjectReference primaryVM;
  
  public ManagedObjectReference getPrimaryVM() {
    return this.primaryVM;
  }
  
  public void setPrimaryVM(ManagedObjectReference paramManagedObjectReference) {
    this.primaryVM = paramManagedObjectReference;
  }
}
