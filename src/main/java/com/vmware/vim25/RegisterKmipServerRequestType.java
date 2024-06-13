package com.vmware.vim25;

import com.vmware.vim25.KmipServerSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RegisterKmipServerRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterKmipServerRequestType", propOrder = {"_this", "server"})
public class RegisterKmipServerRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KmipServerSpec server;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KmipServerSpec getServer() {
    return this.server;
  }
  
  public void setServer(KmipServerSpec paramKmipServerSpec) {
    this.server = paramKmipServerSpec;
  }
}
