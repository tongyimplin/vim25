package com.vmware.vim25;

import com.vmware.vim25.DeleteScsiLunStateRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteScsiLunStateRequestType", propOrder = {"_this", "lunCanonicalName"})
public class DeleteScsiLunStateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String lunCanonicalName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getLunCanonicalName() {
    return this.lunCanonicalName;
  }
  
  public void setLunCanonicalName(String paramString) {
    this.lunCanonicalName = paramString;
  }
}
