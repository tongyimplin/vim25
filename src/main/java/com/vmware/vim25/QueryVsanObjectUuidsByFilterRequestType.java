package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryVsanObjectUuidsByFilterRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryVsanObjectUuidsByFilterRequestType", propOrder = {"_this", "uuids", "limit", "version"})
public class QueryVsanObjectUuidsByFilterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> uuids;
  
  protected Integer limit;
  
  protected Integer version;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getUuids() {
    if (this.uuids == null)
      this.uuids = new ArrayList<>(); 
    return this.uuids;
  }
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public void setLimit(Integer paramInteger) {
    this.limit = paramInteger;
  }
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(Integer paramInteger) {
    this.version = paramInteger;
  }
}
