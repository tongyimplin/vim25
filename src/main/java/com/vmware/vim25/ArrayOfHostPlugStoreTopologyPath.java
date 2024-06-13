package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlugStoreTopologyPath;
import com.vmware.vim25.HostPlugStoreTopologyPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyPath", propOrder = {"hostPlugStoreTopologyPath"})
public class ArrayOfHostPlugStoreTopologyPath {
  @XmlElement(name = "HostPlugStoreTopologyPath")
  protected List<HostPlugStoreTopologyPath> hostPlugStoreTopologyPath;
  
  public List<HostPlugStoreTopologyPath> getHostPlugStoreTopologyPath() {
    if (this.hostPlugStoreTopologyPath == null)
      this.hostPlugStoreTopologyPath = new ArrayList<>(); 
    return this.hostPlugStoreTopologyPath;
  }
}
