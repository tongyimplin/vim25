package com.vmware.vim25;

import com.vmware.vim25.InitializeDisksRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanHostDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeDisksRequestType", propOrder = {"_this", "mapping"})
public class InitializeDisksRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VsanHostDiskMapping> mapping;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VsanHostDiskMapping> getMapping() {
    if (this.mapping == null)
      this.mapping = new ArrayList<>(); 
    return this.mapping;
  }
}
