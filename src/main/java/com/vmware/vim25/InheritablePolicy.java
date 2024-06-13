package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVSFailureCriteria;
import com.vmware.vim25.DVSMacLearningPolicy;
import com.vmware.vim25.DVSMacManagementPolicy;
import com.vmware.vim25.DVSSecurityPolicy;
import com.vmware.vim25.DVSTrafficShapingPolicy;
import com.vmware.vim25.DVSVendorSpecificConfig;
import com.vmware.vim25.DvsFilterConfig;
import com.vmware.vim25.DvsFilterPolicy;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.InheritablePolicy;
import com.vmware.vim25.IntPolicy;
import com.vmware.vim25.LongPolicy;
import com.vmware.vim25.StringPolicy;
import com.vmware.vim25.VMwareUplinkLacpPolicy;
import com.vmware.vim25.VMwareUplinkPortOrderPolicy;
import com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec;
import com.vmware.vim25.VmwareUplinkPortTeamingPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritablePolicy", propOrder = {"inherited"})
@XmlSeeAlso({DVSVendorSpecificConfig.class, DVSTrafficShapingPolicy.class, IntPolicy.class, VmwareUplinkPortTeamingPolicy.class, DVSMacLearningPolicy.class, DVSSecurityPolicy.class, VMwareUplinkPortOrderPolicy.class, LongPolicy.class, VMwareUplinkLacpPolicy.class, DVSMacManagementPolicy.class, StringPolicy.class, DvsFilterPolicy.class, DVSFailureCriteria.class, VmwareDistributedVirtualSwitchVlanSpec.class, DvsFilterConfig.class, BoolPolicy.class})
public class InheritablePolicy extends DynamicData {
  protected boolean inherited;
  
  public boolean isInherited() {
    return this.inherited;
  }
  
  public void setInherited(boolean paramBoolean) {
    this.inherited = paramBoolean;
  }
}
