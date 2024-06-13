package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryAvailableSsdsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAvailableSsdsRequestType", propOrder = {"_this", "vffsPath"})
public class QueryAvailableSsdsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String vffsPath;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVffsPath() {
    return this.vffsPath;
  }
  
  public void setVffsPath(String paramString) {
    this.vffsPath = paramString;
  }
}
