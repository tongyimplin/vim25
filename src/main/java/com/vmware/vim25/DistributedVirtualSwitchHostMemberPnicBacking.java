package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicBacking;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberPnicBacking", propOrder = {"pnicSpec"})
public class DistributedVirtualSwitchHostMemberPnicBacking extends DistributedVirtualSwitchHostMemberBacking {
  protected List<DistributedVirtualSwitchHostMemberPnicSpec> pnicSpec;
  
  public List<DistributedVirtualSwitchHostMemberPnicSpec> getPnicSpec() {
    if (this.pnicSpec == null)
      this.pnicSpec = new ArrayList<>(); 
    return this.pnicSpec;
  }
}
