package com.vmware.vim25;

import com.vmware.vim25.ConfigureVFlashResourceExRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureVFlashResourceExRequestType", propOrder = {"_this", "devicePath"})
public class ConfigureVFlashResourceExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> devicePath;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getDevicePath() {
    if (this.devicePath == null)
      this.devicePath = new ArrayList<>(); 
    return this.devicePath;
  }
}
