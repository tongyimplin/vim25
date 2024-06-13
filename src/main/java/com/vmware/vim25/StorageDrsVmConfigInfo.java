package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageDrsVmConfigInfo;
import com.vmware.vim25.VirtualDiskAntiAffinityRuleSpec;
import com.vmware.vim25.VirtualDiskRuleSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsVmConfigInfo", propOrder = {"vm", "enabled", "behavior", "intraVmAffinity", "intraVmAntiAffinity", "virtualDiskRules"})
public class StorageDrsVmConfigInfo extends DynamicData {
  protected ManagedObjectReference vm;
  
  protected Boolean enabled;
  
  protected String behavior;
  
  protected Boolean intraVmAffinity;
  
  protected VirtualDiskAntiAffinityRuleSpec intraVmAntiAffinity;
  
  protected List<VirtualDiskRuleSpec> virtualDiskRules;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getBehavior() {
    return this.behavior;
  }
  
  public void setBehavior(String paramString) {
    this.behavior = paramString;
  }
  
  public Boolean isIntraVmAffinity() {
    return this.intraVmAffinity;
  }
  
  public void setIntraVmAffinity(Boolean paramBoolean) {
    this.intraVmAffinity = paramBoolean;
  }
  
  public VirtualDiskAntiAffinityRuleSpec getIntraVmAntiAffinity() {
    return this.intraVmAntiAffinity;
  }
  
  public void setIntraVmAntiAffinity(VirtualDiskAntiAffinityRuleSpec paramVirtualDiskAntiAffinityRuleSpec) {
    this.intraVmAntiAffinity = paramVirtualDiskAntiAffinityRuleSpec;
  }
  
  public List<VirtualDiskRuleSpec> getVirtualDiskRules() {
    if (this.virtualDiskRules == null)
      this.virtualDiskRules = new ArrayList<>(); 
    return this.virtualDiskRules;
  }
}
