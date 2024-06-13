package com.vmware.vim25;

import com.vmware.vim25.AddDisksRequestType;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDisksRequestType", propOrder = {"_this", "disk"})
public class AddDisksRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<HostScsiDisk> disk;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HostScsiDisk> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
}
