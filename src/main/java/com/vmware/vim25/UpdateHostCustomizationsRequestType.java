package com.vmware.vim25;

import com.vmware.vim25.HostProfileManagerHostToConfigSpecMap;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHostCustomizationsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHostCustomizationsRequestType", propOrder = {"_this", "hostToConfigSpecMap"})
public class UpdateHostCustomizationsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<HostProfileManagerHostToConfigSpecMap> hostToConfigSpecMap;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostProfileManagerHostToConfigSpecMap> getHostToConfigSpecMap() {
    if (this.hostToConfigSpecMap == null)
      this.hostToConfigSpecMap = new ArrayList<>(); 
    return this.hostToConfigSpecMap;
  }
}
