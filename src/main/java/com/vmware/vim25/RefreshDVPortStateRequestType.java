package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RefreshDVPortStateRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefreshDVPortStateRequestType", propOrder = {"_this", "portKeys"})
public class RefreshDVPortStateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> portKeys;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getPortKeys() {
    if (this.portKeys == null)
      this.portKeys = new ArrayList<>(); 
    return this.portKeys;
  }
}
