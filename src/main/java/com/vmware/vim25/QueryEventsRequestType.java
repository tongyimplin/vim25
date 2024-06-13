package com.vmware.vim25;

import com.vmware.vim25.EventFilterSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryEventsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryEventsRequestType", propOrder = {"_this", "filter"})
public class QueryEventsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected EventFilterSpec filter;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public EventFilterSpec getFilter() {
    return this.filter;
  }
  
  public void setFilter(EventFilterSpec paramEventFilterSpec) {
    this.filter = paramEventFilterSpec;
  }
}
