package com.vmware.vim25;

import com.vmware.vim25.HostBootDeviceInfo;
import com.vmware.vim25.QueryBootDevicesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryBootDevicesResponse")
public class QueryBootDevicesResponse {
  protected HostBootDeviceInfo returnval;
  
  public HostBootDeviceInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostBootDeviceInfo paramHostBootDeviceInfo) {
    this.returnval = paramHostBootDeviceInfo;
  }
}
