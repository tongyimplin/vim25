package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetDisplayTopologyRequestType;
import com.vmware.vim25.VirtualMachineDisplayTopology;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDisplayTopologyRequestType", propOrder = {"_this", "displays"})
public class SetDisplayTopologyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VirtualMachineDisplayTopology> displays;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VirtualMachineDisplayTopology> getDisplays() {
    if (this.displays == null)
      this.displays = new ArrayList<>(); 
    return this.displays;
  }
}
