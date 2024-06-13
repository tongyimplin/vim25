package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.RetrieveOptions;
import com.vmware.vim25.RetrievePropertiesExRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePropertiesExRequestType", propOrder = {"_this", "specSet", "options"})
public class RetrievePropertiesExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<PropertyFilterSpec> specSet;
  
  @XmlElement(required = true)
  protected RetrieveOptions options;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<PropertyFilterSpec> getSpecSet() {
    if (this.specSet == null)
      this.specSet = new ArrayList<>(); 
    return this.specSet;
  }
  
  public RetrieveOptions getOptions() {
    return this.options;
  }
  
  public void setOptions(RetrieveOptions paramRetrieveOptions) {
    this.options = paramRetrieveOptions;
  }
}
