package com.vmware.vim25;

import com.vmware.vim25.DVPortConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureDVPortRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureDVPortRequestType", propOrder = {"_this", "port"})
public class ReconfigureDVPortRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<DVPortConfigSpec> port;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DVPortConfigSpec> getPort() {
    if (this.port == null)
      this.port = new ArrayList<>(); 
    return this.port;
  }
}
