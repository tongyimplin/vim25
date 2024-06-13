package com.vmware.vim25;

import com.vmware.vim25.ClusterGroupInfo;
import com.vmware.vim25.ClusterVmGroup;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmGroup", propOrder = {"vm"})
public class ClusterVmGroup extends ClusterGroupInfo {
  protected List<ManagedObjectReference> vm;
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
}
