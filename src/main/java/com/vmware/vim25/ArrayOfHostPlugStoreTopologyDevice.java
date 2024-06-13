package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlugStoreTopologyDevice;
import com.vmware.vim25.HostPlugStoreTopologyDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyDevice", propOrder = {"hostPlugStoreTopologyDevice"})
public class ArrayOfHostPlugStoreTopologyDevice {
  @XmlElement(name = "HostPlugStoreTopologyDevice")
  protected List<HostPlugStoreTopologyDevice> hostPlugStoreTopologyDevice;
  
  public List<HostPlugStoreTopologyDevice> getHostPlugStoreTopologyDevice() {
    if (this.hostPlugStoreTopologyDevice == null)
      this.hostPlugStoreTopologyDevice = new ArrayList<>(); 
    return this.hostPlugStoreTopologyDevice;
  }
}
