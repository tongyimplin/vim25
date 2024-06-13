package com.vmware.vim25;

import com.vmware.vim25.ExecuteSimpleCommandRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteSimpleCommandRequestType", propOrder = {"_this", "arguments"})
public class ExecuteSimpleCommandRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> arguments;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getArguments() {
    if (this.arguments == null)
      this.arguments = new ArrayList<>(); 
    return this.arguments;
  }
}
