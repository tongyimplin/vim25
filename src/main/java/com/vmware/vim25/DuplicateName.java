package com.vmware.vim25;

import com.vmware.vim25.DuplicateName;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateName", propOrder = {"name", "object"})
public class DuplicateName extends VimFault {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ManagedObjectReference object;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedObjectReference getObject() {
    return this.object;
  }
  
  public void setObject(ManagedObjectReference paramManagedObjectReference) {
    this.object = paramManagedObjectReference;
  }
}
