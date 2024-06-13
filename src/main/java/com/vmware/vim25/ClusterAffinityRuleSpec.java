package com.vmware.vim25;

import com.vmware.vim25.ClusterAffinityRuleSpec;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAffinityRuleSpec", propOrder = {"vm"})
public class ClusterAffinityRuleSpec extends ClusterRuleInfo {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> vm;
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
}
