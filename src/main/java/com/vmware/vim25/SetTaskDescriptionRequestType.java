package com.vmware.vim25;

import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetTaskDescriptionRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTaskDescriptionRequestType", propOrder = {"_this", "description"})
public class SetTaskDescriptionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected LocalizableMessage description;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public LocalizableMessage getDescription() {
    return this.description;
  }
  
  public void setDescription(LocalizableMessage paramLocalizableMessage) {
    this.description = paramLocalizableMessage;
  }
}
