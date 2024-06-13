package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.PowerOnMultiVMRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOnMultiVMRequestType", propOrder = {"_this", "vm", "option"})
public class PowerOnMultiVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> vm;
  
  protected List<OptionValue> option;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
