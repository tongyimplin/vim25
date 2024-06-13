package com.vmware.vim25;

import com.vmware.vim25.CreateListViewRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateListViewRequestType", propOrder = {"_this", "obj"})
public class CreateListViewRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ManagedObjectReference> obj;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getObj() {
    if (this.obj == null)
      this.obj = new ArrayList<>(); 
    return this.obj;
  }
}
