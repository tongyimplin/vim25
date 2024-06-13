package com.vmware.vim25;

import com.vmware.vim25.ArrayOfServiceManagerServiceInfo;
import com.vmware.vim25.ServiceManagerServiceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceManagerServiceInfo", propOrder = {"serviceManagerServiceInfo"})
public class ArrayOfServiceManagerServiceInfo {
  @XmlElement(name = "ServiceManagerServiceInfo")
  protected List<ServiceManagerServiceInfo> serviceManagerServiceInfo;
  
  public List<ServiceManagerServiceInfo> getServiceManagerServiceInfo() {
    if (this.serviceManagerServiceInfo == null)
      this.serviceManagerServiceInfo = new ArrayList<>(); 
    return this.serviceManagerServiceInfo;
  }
}
