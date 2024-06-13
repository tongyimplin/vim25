package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QuerySyncingVsanObjectsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySyncingVsanObjectsRequestType", propOrder = {"_this", "uuids"})
public class QuerySyncingVsanObjectsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> uuids;
  
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
}
