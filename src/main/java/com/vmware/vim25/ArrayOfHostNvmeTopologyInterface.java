package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNvmeTopologyInterface;
import com.vmware.vim25.HostNvmeTopologyInterface;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeTopologyInterface", propOrder = {"hostNvmeTopologyInterface"})
public class ArrayOfHostNvmeTopologyInterface {
  @XmlElement(name = "HostNvmeTopologyInterface")
  protected List<HostNvmeTopologyInterface> hostNvmeTopologyInterface;
  
  public List<HostNvmeTopologyInterface> getHostNvmeTopologyInterface() {
    if (this.hostNvmeTopologyInterface == null)
      this.hostNvmeTopologyInterface = new ArrayList<>(); 
    return this.hostNvmeTopologyInterface;
  }
}
