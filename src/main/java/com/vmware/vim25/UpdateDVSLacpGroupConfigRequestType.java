package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDVSLacpGroupConfigRequestType;
import com.vmware.vim25.VMwareDvsLacpGroupSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDVSLacpGroupConfigRequestType", propOrder = {"_this", "lacpGroupSpec"})
public class UpdateDVSLacpGroupConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VMwareDvsLacpGroupSpec> lacpGroupSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VMwareDvsLacpGroupSpec> getLacpGroupSpec() {
    if (this.lacpGroupSpec == null)
      this.lacpGroupSpec = new ArrayList<>(); 
    return this.lacpGroupSpec;
  }
}
