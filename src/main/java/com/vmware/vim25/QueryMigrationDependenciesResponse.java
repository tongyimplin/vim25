package com.vmware.vim25;

import com.vmware.vim25.IscsiMigrationDependency;
import com.vmware.vim25.QueryMigrationDependenciesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryMigrationDependenciesResponse")
public class QueryMigrationDependenciesResponse {
  @XmlElement(required = true)
  protected IscsiMigrationDependency returnval;
  
  public IscsiMigrationDependency getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(IscsiMigrationDependency paramIscsiMigrationDependency) {
    this.returnval = paramIscsiMigrationDependency;
  }
}
