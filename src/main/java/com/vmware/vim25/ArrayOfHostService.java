package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostService;
import com.vmware.vim25.HostService;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostService", propOrder = {"hostService"})
public class ArrayOfHostService {
  @XmlElement(name = "HostService")
  protected List<HostService> hostService;
  
  public List<HostService> getHostService() {
    if (this.hostService == null)
      this.hostService = new ArrayList<>(); 
    return this.hostService;
  }
}
