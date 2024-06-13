package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNatService;
import com.vmware.vim25.HostNatService;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNatService", propOrder = {"hostNatService"})
public class ArrayOfHostNatService {
  @XmlElement(name = "HostNatService")
  protected List<HostNatService> hostNatService;
  
  public List<HostNatService> getHostNatService() {
    if (this.hostNatService == null)
      this.hostNatService = new ArrayList<>(); 
    return this.hostNatService;
  }
}
