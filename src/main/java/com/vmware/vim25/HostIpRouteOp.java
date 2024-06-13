package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteEntry;
import com.vmware.vim25.HostIpRouteOp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteOp", propOrder = {"changeOperation", "route"})
public class HostIpRouteOp extends DynamicData {
  @XmlElement(required = true)
  protected String changeOperation;
  
  @XmlElement(required = true)
  protected HostIpRouteEntry route;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public HostIpRouteEntry getRoute() {
    return this.route;
  }
  
  public void setRoute(HostIpRouteEntry paramHostIpRouteEntry) {
    this.route = paramHostIpRouteEntry;
  }
}
