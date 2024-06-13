package com.vmware.vim25;

import com.vmware.vim25.DatastoreMountPathDatastorePair;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVirtualMachineFilesRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesRequestType", propOrder = {"_this", "mountPathDatastoreMapping"})
public class UpdateVirtualMachineFilesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<DatastoreMountPathDatastorePair> mountPathDatastoreMapping;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DatastoreMountPathDatastorePair> getMountPathDatastoreMapping() {
    if (this.mountPathDatastoreMapping == null)
      this.mountPathDatastoreMapping = new ArrayList<>(); 
    return this.mountPathDatastoreMapping;
  }
}
