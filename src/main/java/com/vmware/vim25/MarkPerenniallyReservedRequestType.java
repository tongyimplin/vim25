package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MarkPerenniallyReservedRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkPerenniallyReservedRequestType", propOrder = {"_this", "lunUuid", "state"})
public class MarkPerenniallyReservedRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String lunUuid;
  
  protected boolean state;
  
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
  
  public boolean isState() {
    return this.state;
  }
  
  public void setState(boolean paramBoolean) {
    this.state = paramBoolean;
  }
}
