package com.vmware.vim25;

import com.vmware.vim25.HostVsanInternalSystemCmmdsQuery;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryCmmdsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCmmdsRequestType", propOrder = {"_this", "queries"})
public class QueryCmmdsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<HostVsanInternalSystemCmmdsQuery> queries;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostVsanInternalSystemCmmdsQuery> getQueries() {
    if (this.queries == null)
      this.queries = new ArrayList<>(); 
    return this.queries;
  }
}
