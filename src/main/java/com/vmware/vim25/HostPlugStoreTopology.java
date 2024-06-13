package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlugStoreTopology;
import com.vmware.vim25.HostPlugStoreTopologyAdapter;
import com.vmware.vim25.HostPlugStoreTopologyDevice;
import com.vmware.vim25.HostPlugStoreTopologyPath;
import com.vmware.vim25.HostPlugStoreTopologyPlugin;
import com.vmware.vim25.HostPlugStoreTopologyTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopology", propOrder = {"adapter", "path", "target", "device", "plugin"})
public class HostPlugStoreTopology extends DynamicData {
  protected List<HostPlugStoreTopologyAdapter> adapter;
  
  protected List<HostPlugStoreTopologyPath> path;
  
  protected List<HostPlugStoreTopologyTarget> target;
  
  protected List<HostPlugStoreTopologyDevice> device;
  
  protected List<HostPlugStoreTopologyPlugin> plugin;
  
  public List<HostPlugStoreTopologyAdapter> getAdapter() {
    if (this.adapter == null)
      this.adapter = new ArrayList<>(); 
    return this.adapter;
  }
  
  public List<HostPlugStoreTopologyPath> getPath() {
    if (this.path == null)
      this.path = new ArrayList<>(); 
    return this.path;
  }
  
  public List<HostPlugStoreTopologyTarget> getTarget() {
    if (this.target == null)
      this.target = new ArrayList<>(); 
    return this.target;
  }
  
  public List<HostPlugStoreTopologyDevice> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
  
  public List<HostPlugStoreTopologyPlugin> getPlugin() {
    if (this.plugin == null)
      this.plugin = new ArrayList<>(); 
    return this.plugin;
  }
}
