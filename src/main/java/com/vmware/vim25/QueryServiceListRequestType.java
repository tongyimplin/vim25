package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryServiceListRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryServiceListRequestType", propOrder = {"_this", "serviceName", "location"})
public class QueryServiceListRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String serviceName;
  
  protected List<String> location;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
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
}
