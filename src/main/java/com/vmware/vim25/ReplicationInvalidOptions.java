package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplicationFault;
import com.vmware.vim25.ReplicationInvalidOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationInvalidOptions", propOrder = {"options", "entity"})
public class ReplicationInvalidOptions extends ReplicationFault {
  @XmlElement(required = true)
  protected String options;
  
  protected ManagedObjectReference entity;
  
  public String getOptions() {
    return this.options;
  }
  
  public void setOptions(String paramString) {
    this.options = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
