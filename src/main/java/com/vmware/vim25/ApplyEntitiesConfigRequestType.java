package com.vmware.vim25;

import com.vmware.vim25.ApplyEntitiesConfigRequestType;
import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyEntitiesConfigRequestType", propOrder = {"_this", "applyConfigSpecs"})
public class ApplyEntitiesConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ApplyHostProfileConfigurationSpec> applyConfigSpecs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ApplyHostProfileConfigurationSpec> getApplyConfigSpecs() {
    if (this.applyConfigSpecs == null)
      this.applyConfigSpecs = new ArrayList<>(); 
    return this.applyConfigSpecs;
  }
}
