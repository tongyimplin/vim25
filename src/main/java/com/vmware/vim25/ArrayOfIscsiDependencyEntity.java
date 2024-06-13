package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIscsiDependencyEntity;
import com.vmware.vim25.IscsiDependencyEntity;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIscsiDependencyEntity", propOrder = {"iscsiDependencyEntity"})
public class ArrayOfIscsiDependencyEntity {
  @XmlElement(name = "IscsiDependencyEntity")
  protected List<IscsiDependencyEntity> iscsiDependencyEntity;
  
  public List<IscsiDependencyEntity> getIscsiDependencyEntity() {
    if (this.iscsiDependencyEntity == null)
      this.iscsiDependencyEntity = new ArrayList<>(); 
    return this.iscsiDependencyEntity;
  }
}
