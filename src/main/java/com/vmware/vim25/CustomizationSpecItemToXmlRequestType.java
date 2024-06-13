package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpecItem;
import com.vmware.vim25.CustomizationSpecItemToXmlRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpecItemToXmlRequestType", propOrder = {"_this", "item"})
public class CustomizationSpecItemToXmlRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CustomizationSpecItem item;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CustomizationSpecItem getItem() {
    return this.item;
  }
  
  public void setItem(CustomizationSpecItem paramCustomizationSpecItem) {
    this.item = paramCustomizationSpecItem;
  }
}
