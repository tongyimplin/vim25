package com.vmware.vim25;

import com.vmware.vim25.DisallowedChangeByService;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisallowedChangeByService", propOrder = {"serviceName", "disallowedChange"})
public class DisallowedChangeByService extends RuntimeFault {
  @XmlElement(required = true)
  protected String serviceName;
  
  protected String disallowedChange;
  
  public String getServiceName() {
    return this.serviceName;
  }
  
  public void setServiceName(String paramString) {
    this.serviceName = paramString;
  }
  
  public String getDisallowedChange() {
    return this.disallowedChange;
  }
  
  public void setDisallowedChange(String paramString) {
    this.disallowedChange = paramString;
  }
}
