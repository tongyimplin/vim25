package com.vmware.vim25;

import com.vmware.vim25.DatabaseSizeParam;
import com.vmware.vim25.EstimateDatabaseSizeRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateDatabaseSizeRequestType", propOrder = {"_this", "dbSizeParam"})
public class EstimateDatabaseSizeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DatabaseSizeParam dbSizeParam;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DatabaseSizeParam getDbSizeParam() {
    return this.dbSizeParam;
  }
  
  public void setDbSizeParam(DatabaseSizeParam paramDatabaseSizeParam) {
    this.dbSizeParam = paramDatabaseSizeParam;
  }
}
