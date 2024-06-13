package com.vmware.vim25;

import com.vmware.vim25.HostSpecGetUpdatedHostsRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSpecGetUpdatedHostsRequestType", propOrder = {"_this", "startChangeID", "endChangeID"})
public class HostSpecGetUpdatedHostsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String startChangeID;
  
  protected String endChangeID;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getStartChangeID() {
    return this.startChangeID;
  }
  
  public void setStartChangeID(String paramString) {
    this.startChangeID = paramString;
  }
  
  public String getEndChangeID() {
    return this.endChangeID;
  }
  
  public void setEndChangeID(String paramString) {
    this.endChangeID = paramString;
  }
}
