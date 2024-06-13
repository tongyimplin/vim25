package com.vmware.vim25;

import com.vmware.vim25.AttachScsiLunRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachScsiLunRequestType", propOrder = {"_this", "lunUuid"})
public class AttachScsiLunRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String lunUuid;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getLunUuid() {
    return this.lunUuid;
  }
  
  public void setLunUuid(String paramString) {
    this.lunUuid = paramString;
  }
}
