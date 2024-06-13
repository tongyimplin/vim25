package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEntityPrivilege;
import com.vmware.vim25.EntityPrivilege;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityPrivilege", propOrder = {"entityPrivilege"})
public class ArrayOfEntityPrivilege {
  @XmlElement(name = "EntityPrivilege")
  protected List<EntityPrivilege> entityPrivilege;
  
  public List<EntityPrivilege> getEntityPrivilege() {
    if (this.entityPrivilege == null)
      this.entityPrivilege = new ArrayList<>(); 
    return this.entityPrivilege;
  }
}
