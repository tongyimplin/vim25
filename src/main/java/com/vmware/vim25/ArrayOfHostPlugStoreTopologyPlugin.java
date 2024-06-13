package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlugStoreTopologyPlugin;
import com.vmware.vim25.HostPlugStoreTopologyPlugin;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyPlugin", propOrder = {"hostPlugStoreTopologyPlugin"})
public class ArrayOfHostPlugStoreTopologyPlugin {
  @XmlElement(name = "HostPlugStoreTopologyPlugin")
  protected List<HostPlugStoreTopologyPlugin> hostPlugStoreTopologyPlugin;
  
  public List<HostPlugStoreTopologyPlugin> getHostPlugStoreTopologyPlugin() {
    if (this.hostPlugStoreTopologyPlugin == null)
      this.hostPlugStoreTopologyPlugin = new ArrayList<>(); 
    return this.hostPlugStoreTopologyPlugin;
  }
}
