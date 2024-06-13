package com.vmware.vim25;

import com.vmware.vim25.InvalidRequest;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MethodNotFound;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodNotFound", propOrder = {"receiver", "method"})
public class MethodNotFound extends InvalidRequest {
  @XmlElement(required = true)
  protected ManagedObjectReference receiver;
  
  @XmlElement(required = true)
  protected String method;
  
  public ManagedObjectReference getReceiver() {
    return this.receiver;
  }
  
  public void setReceiver(ManagedObjectReference paramManagedObjectReference) {
    this.receiver = paramManagedObjectReference;
  }
  
  public String getMethod() {
    return this.method;
  }
  
  public void setMethod(String paramString) {
    this.method = paramString;
  }
}
