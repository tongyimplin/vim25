package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlugStoreTopologyAdapter;
import com.vmware.vim25.HostPlugStoreTopologyAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyAdapter", propOrder = {"hostPlugStoreTopologyAdapter"})
public class ArrayOfHostPlugStoreTopologyAdapter {
  @XmlElement(name = "HostPlugStoreTopologyAdapter")
  protected List<HostPlugStoreTopologyAdapter> hostPlugStoreTopologyAdapter;
  
  public List<HostPlugStoreTopologyAdapter> getHostPlugStoreTopologyAdapter() {
    if (this.hostPlugStoreTopologyAdapter == null)
      this.hostPlugStoreTopologyAdapter = new ArrayList<>(); 
    return this.hostPlugStoreTopologyAdapter;
  }
}
