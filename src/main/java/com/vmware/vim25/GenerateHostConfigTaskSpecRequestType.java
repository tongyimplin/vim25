package com.vmware.vim25;

import com.vmware.vim25.GenerateHostConfigTaskSpecRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StructuredCustomizations;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateHostConfigTaskSpecRequestType", propOrder = {"_this", "hostsInfo"})
public class GenerateHostConfigTaskSpecRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<StructuredCustomizations> hostsInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<StructuredCustomizations> getHostsInfo() {
    if (this.hostsInfo == null)
      this.hostsInfo = new ArrayList<>(); 
    return this.hostsInfo;
  }
}
