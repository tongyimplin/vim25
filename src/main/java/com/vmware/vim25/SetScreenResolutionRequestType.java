package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetScreenResolutionRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetScreenResolutionRequestType", propOrder = {"_this", "width", "height"})
public class SetScreenResolutionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int width;
  
  protected int height;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public void setWidth(int paramInt) {
    this.width = paramInt;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public void setHeight(int paramInt) {
    this.height = paramInt;
  }
}
