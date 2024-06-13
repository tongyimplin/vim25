package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerDvsProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainer;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryDvsCheckCompatibilityRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDvsCheckCompatibilityRequestType", propOrder = {"_this", "hostContainer", "dvsProductSpec", "hostFilterSpec"})
public class QueryDvsCheckCompatibilityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchManagerHostContainer hostContainer;
  
  protected DistributedVirtualSwitchManagerDvsProductSpec dvsProductSpec;
  
  protected List<DistributedVirtualSwitchManagerHostDvsFilterSpec> hostFilterSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DistributedVirtualSwitchManagerHostContainer getHostContainer() {
    return this.hostContainer;
  }
  
  public void setHostContainer(DistributedVirtualSwitchManagerHostContainer paramDistributedVirtualSwitchManagerHostContainer) {
    this.hostContainer = paramDistributedVirtualSwitchManagerHostContainer;
  }
  
  public DistributedVirtualSwitchManagerDvsProductSpec getDvsProductSpec() {
    return this.dvsProductSpec;
  }
  
  public void setDvsProductSpec(DistributedVirtualSwitchManagerDvsProductSpec paramDistributedVirtualSwitchManagerDvsProductSpec) {
    this.dvsProductSpec = paramDistributedVirtualSwitchManagerDvsProductSpec;
  }
  
  public List<DistributedVirtualSwitchManagerHostDvsFilterSpec> getHostFilterSpec() {
    if (this.hostFilterSpec == null)
      this.hostFilterSpec = new ArrayList<>(); 
    return this.hostFilterSpec;
  }
}
