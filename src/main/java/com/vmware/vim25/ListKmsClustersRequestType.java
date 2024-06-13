package com.vmware.vim25;

import com.vmware.vim25.ListKmsClustersRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListKmsClustersRequestType", propOrder = {"_this", "includeKmsServers", "managementTypeFilter", "statusFilter"})
public class ListKmsClustersRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected Boolean includeKmsServers;
  
  protected Integer managementTypeFilter;
  
  protected Integer statusFilter;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Boolean isIncludeKmsServers() {
    return this.includeKmsServers;
  }
  
  public void setIncludeKmsServers(Boolean paramBoolean) {
    this.includeKmsServers = paramBoolean;
  }
  
  public Integer getManagementTypeFilter() {
    return this.managementTypeFilter;
  }
  
  public void setManagementTypeFilter(Integer paramInteger) {
    this.managementTypeFilter = paramInteger;
  }
  
  public Integer getStatusFilter() {
    return this.statusFilter;
  }
  
  public void setStatusFilter(Integer paramInteger) {
    this.statusFilter = paramInteger;
  }
}
