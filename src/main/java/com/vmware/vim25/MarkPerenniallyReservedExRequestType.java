package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MarkPerenniallyReservedExRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkPerenniallyReservedExRequestType", propOrder = {"_this", "lunUuid", "state"})
public class MarkPerenniallyReservedExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> lunUuid;
  
  protected boolean state;
  
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
  
  public boolean isState() {
    return this.state;
  }
  
  public void setState(boolean paramBoolean) {
    this.state = paramBoolean;
  }
}
