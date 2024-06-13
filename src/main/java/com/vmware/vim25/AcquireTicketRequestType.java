package com.vmware.vim25;

import com.vmware.vim25.AcquireTicketRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireTicketRequestType", propOrder = {"_this", "ticketType"})
public class AcquireTicketRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String ticketType;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getTicketType() {
    return this.ticketType;
  }
  
  public void setTicketType(String paramString) {
    this.ticketType = paramString;
  }
}
