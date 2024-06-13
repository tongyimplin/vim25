package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsFaultsFaultsByVirtualDisk;
import com.vmware.vim25.ClusterDrsFaultsFaultsByVm;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsFaultsFaultsByVm", propOrder = {"vm", "fault"})
@XmlSeeAlso({ClusterDrsFaultsFaultsByVirtualDisk.class})
public class ClusterDrsFaultsFaultsByVm extends DynamicData {
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected List<LocalizedMethodFault> fault;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public List<LocalizedMethodFault> getFault() {
    if (this.fault == null)
      this.fault = new ArrayList<>(); 
    return this.fault;
  }
}
