package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceLocator;
import com.vmware.vim25.SourceNodeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceNodeSpec", propOrder = {"managementVc", "activeVc"})
public class SourceNodeSpec extends DynamicData {
  @XmlElement(required = true)
  protected ServiceLocator managementVc;
  
  @XmlElement(required = true)
  protected ManagedObjectReference activeVc;
  
  public ServiceLocator getManagementVc() {
    return this.managementVc;
  }
  
  public void setManagementVc(ServiceLocator paramServiceLocator) {
    this.managementVc = paramServiceLocator;
  }
  
  public ManagedObjectReference getActiveVc() {
    return this.activeVc;
  }
  
  public void setActiveVc(ManagedObjectReference paramManagedObjectReference) {
    this.activeVc = paramManagedObjectReference;
  }
}
