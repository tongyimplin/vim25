package com.vmware.vim25;

import com.vmware.vim25.HealthUpdateInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RegisterHealthUpdateProviderRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterHealthUpdateProviderRequestType", propOrder = {"_this", "name", "healthUpdateInfo"})
public class RegisterHealthUpdateProviderRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected List<HealthUpdateInfo> healthUpdateInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<HealthUpdateInfo> getHealthUpdateInfo() {
    if (this.healthUpdateInfo == null)
      this.healthUpdateInfo = new ArrayList<>(); 
    return this.healthUpdateInfo;
  }
}
