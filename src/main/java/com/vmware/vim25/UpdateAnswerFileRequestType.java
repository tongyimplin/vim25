package com.vmware.vim25;

import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateAnswerFileRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAnswerFileRequestType", propOrder = {"_this", "host", "configSpec"})
public class UpdateAnswerFileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected AnswerFileCreateSpec configSpec;
  
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
  
  public AnswerFileCreateSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(AnswerFileCreateSpec paramAnswerFileCreateSpec) {
    this.configSpec = paramAnswerFileCreateSpec;
  }
}
