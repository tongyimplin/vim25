package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostIpRouteOp;
import com.vmware.vim25.HostIpRouteOp;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIpRouteOp", propOrder = {"hostIpRouteOp"})
public class ArrayOfHostIpRouteOp {
  @XmlElement(name = "HostIpRouteOp")
  protected List<HostIpRouteOp> hostIpRouteOp;
  
  public List<HostIpRouteOp> getHostIpRouteOp() {
    if (this.hostIpRouteOp == null)
      this.hostIpRouteOp = new ArrayList<>(); 
    return this.hostIpRouteOp;
  }
}
