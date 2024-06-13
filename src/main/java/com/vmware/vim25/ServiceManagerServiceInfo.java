package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceManagerServiceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceManagerServiceInfo", propOrder = {"serviceName", "location", "service", "description"})
public class ServiceManagerServiceInfo extends DynamicData {
  @XmlElement(required = true)
  protected String serviceName;
  
  protected List<String> location;
  
  @XmlElement(required = true)
  protected ManagedObjectReference service;
  
  @XmlElement(required = true)
  protected String description;
  
  public String getServiceName() {
    return this.serviceName;
  }
  
  public void setServiceName(String paramString) {
    this.serviceName = paramString;
  }
  
  public List<String> getLocation() {
    if (this.location == null)
      this.location = new ArrayList<>(); 
    return this.location;
  }
  
  public ManagedObjectReference getService() {
    return this.service;
  }
  
  public void setService(ManagedObjectReference paramManagedObjectReference) {
    this.service = paramManagedObjectReference;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
