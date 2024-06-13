package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlugStoreTopologyTarget;
import com.vmware.vim25.HostPlugStoreTopologyTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyTarget", propOrder = {"hostPlugStoreTopologyTarget"})
public class ArrayOfHostPlugStoreTopologyTarget {
  @XmlElement(name = "HostPlugStoreTopologyTarget")
  protected List<HostPlugStoreTopologyTarget> hostPlugStoreTopologyTarget;
  
  public List<HostPlugStoreTopologyTarget> getHostPlugStoreTopologyTarget() {
    if (this.hostPlugStoreTopologyTarget == null)
      this.hostPlugStoreTopologyTarget = new ArrayList<>(); 
    return this.hostPlugStoreTopologyTarget;
  }
}
