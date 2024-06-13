package com.vmware.vim25;

import com.vmware.vim25.AddDVPortgroupRequestType;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDVPortgroupRequestType", propOrder = {"_this", "spec"})
public class AddDVPortgroupRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<DVPortgroupConfigSpec> spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DVPortgroupConfigSpec> getSpec() {
    if (this.spec == null)
      this.spec = new ArrayList<>(); 
    return this.spec;
  }
}
