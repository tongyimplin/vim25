package com.vmware.vim25;

import com.vmware.vim25.DVSManagerExportEntityRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SelectionSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSManagerExportEntityRequestType", propOrder = {"_this", "selectionSet"})
public class DVSManagerExportEntityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<SelectionSet> selectionSet;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<SelectionSet> getSelectionSet() {
    if (this.selectionSet == null)
      this.selectionSet = new ArrayList<>(); 
    return this.selectionSet;
  }
}
