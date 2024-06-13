package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.RollbackFailure;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollbackFailure", propOrder = {"entityName", "entityType"})
public class RollbackFailure extends DvsFault {
  @XmlElement(required = true)
  protected String entityName;
  
  @XmlElement(required = true)
  protected String entityType;
  
  public String getEntityName() {
    return this.entityName;
  }
  
  public void setEntityName(String paramString) {
    this.entityName = paramString;
  }
  
  public String getEntityType() {
    return this.entityType;
  }
  
  public void setEntityType(String paramString) {
    this.entityType = paramString;
  }
}
