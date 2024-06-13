package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerHostArrayFilter;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostArrayFilter", propOrder = {"host"})
public class DistributedVirtualSwitchManagerHostArrayFilter extends DistributedVirtualSwitchManagerHostDvsFilterSpec {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> host;
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
