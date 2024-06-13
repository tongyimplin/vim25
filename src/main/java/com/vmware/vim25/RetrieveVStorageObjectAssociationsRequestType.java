package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveVStorageObjSpec;
import com.vmware.vim25.RetrieveVStorageObjectAssociationsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveVStorageObjectAssociationsRequestType", propOrder = {"_this", "ids"})
public class RetrieveVStorageObjectAssociationsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<RetrieveVStorageObjSpec> ids;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<RetrieveVStorageObjSpec> getIds() {
    if (this.ids == null)
      this.ids = new ArrayList<>(); 
    return this.ids;
  }
}
