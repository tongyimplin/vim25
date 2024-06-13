package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNvmeController;
import com.vmware.vim25.HostNvmeController;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeController", propOrder = {"hostNvmeController"})
public class ArrayOfHostNvmeController {
  @XmlElement(name = "HostNvmeController")
  protected List<HostNvmeController> hostNvmeController;
  
  public List<HostNvmeController> getHostNvmeController() {
    if (this.hostNvmeController == null)
      this.hostNvmeController = new ArrayList<>(); 
    return this.hostNvmeController;
  }
}
