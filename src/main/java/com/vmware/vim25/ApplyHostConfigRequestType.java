package com.vmware.vim25;

import com.vmware.vim25.ApplyHostConfigRequestType;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyHostConfigRequestType", propOrder = {"_this", "host", "configSpec", "userInput"})
public class ApplyHostConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected HostConfigSpec configSpec;
  
  protected List<ProfileDeferredPolicyOptionParameter> userInput;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public HostConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(HostConfigSpec paramHostConfigSpec) {
    this.configSpec = paramHostConfigSpec;
  }
  
  public List<ProfileDeferredPolicyOptionParameter> getUserInput() {
    if (this.userInput == null)
      this.userInput = new ArrayList<>(); 
    return this.userInput;
  }
}
