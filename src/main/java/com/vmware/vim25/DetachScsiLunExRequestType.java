package com.vmware.vim25;

import com.vmware.vim25.DetachScsiLunExRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachScsiLunExRequestType", propOrder = {"_this", "lunUuid"})
public class DetachScsiLunExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> lunUuid;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getLunUuid() {
    if (this.lunUuid == null)
      this.lunUuid = new ArrayList<>(); 
    return this.lunUuid;
  }
}
