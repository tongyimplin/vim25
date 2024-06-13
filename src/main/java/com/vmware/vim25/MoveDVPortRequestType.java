package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MoveDVPortRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveDVPortRequestType", propOrder = {"_this", "portKey", "destinationPortgroupKey"})
public class MoveDVPortRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> portKey;
  
  protected String destinationPortgroupKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getPortKey() {
    if (this.portKey == null)
      this.portKey = new ArrayList<>(); 
    return this.portKey;
  }
  
  public String getDestinationPortgroupKey() {
    return this.destinationPortgroupKey;
  }
  
  public void setDestinationPortgroupKey(String paramString) {
    this.destinationPortgroupKey = paramString;
  }
}
