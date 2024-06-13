package com.vmware.vim25;

import com.vmware.vim25.FindAllByUuidRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindAllByUuidRequestType", propOrder = {"_this", "datacenter", "uuid", "vmSearch", "instanceUuid"})
public class FindAllByUuidRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected boolean vmSearch;
  
  protected Boolean instanceUuid;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public boolean isVmSearch() {
    return this.vmSearch;
  }
  
  public void setVmSearch(boolean paramBoolean) {
    this.vmSearch = paramBoolean;
  }
  
  public Boolean isInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(Boolean paramBoolean) {
    this.instanceUuid = paramBoolean;
  }
}
