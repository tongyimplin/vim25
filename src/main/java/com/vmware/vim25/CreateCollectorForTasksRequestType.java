package com.vmware.vim25;

import com.vmware.vim25.CreateCollectorForTasksRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskFilterSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCollectorForTasksRequestType", propOrder = {"_this", "filter"})
public class CreateCollectorForTasksRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected TaskFilterSpec filter;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public TaskFilterSpec getFilter() {
    return this.filter;
  }
  
  public void setFilter(TaskFilterSpec paramTaskFilterSpec) {
    this.filter = paramTaskFilterSpec;
  }
}
