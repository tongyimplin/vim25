package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ModifyListViewRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyListViewRequestType", propOrder = {"_this", "add", "remove"})
public class ModifyListViewRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ManagedObjectReference> add;
  
  protected List<ManagedObjectReference> remove;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getAdd() {
    if (this.add == null)
      this.add = new ArrayList<>(); 
    return this.add;
  }
  
  public List<ManagedObjectReference> getRemove() {
    if (this.remove == null)
      this.remove = new ArrayList<>(); 
    return this.remove;
  }
}
