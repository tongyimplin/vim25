package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNvmeNamespace;
import com.vmware.vim25.HostNvmeNamespace;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeNamespace", propOrder = {"hostNvmeNamespace"})
public class ArrayOfHostNvmeNamespace {
  @XmlElement(name = "HostNvmeNamespace")
  protected List<HostNvmeNamespace> hostNvmeNamespace;
  
  public List<HostNvmeNamespace> getHostNvmeNamespace() {
    if (this.hostNvmeNamespace == null)
      this.hostNvmeNamespace = new ArrayList<>(); 
    return this.hostNvmeNamespace;
  }
}
