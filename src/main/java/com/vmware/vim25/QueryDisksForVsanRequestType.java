package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryDisksForVsanRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDisksForVsanRequestType", propOrder = {"_this", "canonicalName"})
public class QueryDisksForVsanRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> canonicalName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getCanonicalName() {
    if (this.canonicalName == null)
      this.canonicalName = new ArrayList<>(); 
    return this.canonicalName;
  }
}
