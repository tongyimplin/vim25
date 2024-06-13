package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostService;
import com.vmware.vim25.HostServiceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostServiceInfo", propOrder = {"service"})
public class HostServiceInfo extends DynamicData {
  protected List<HostService> service;
  
  public List<HostService> getService() {
    if (this.service == null)
      this.service = new ArrayList<>(); 
    return this.service;
  }
}
