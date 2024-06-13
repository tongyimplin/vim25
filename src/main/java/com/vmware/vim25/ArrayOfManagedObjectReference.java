package com.vmware.vim25;

import com.vmware.vim25.ArrayOfManagedObjectReference;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagedObjectReference", propOrder = {"managedObjectReference"})
public class ArrayOfManagedObjectReference {
  @XmlElement(name = "ManagedObjectReference")
  protected List<ManagedObjectReference> managedObjectReference;
  
  public List<ManagedObjectReference> getManagedObjectReference() {
    if (this.managedObjectReference == null)
      this.managedObjectReference = new ArrayList<>(); 
    return this.managedObjectReference;
  }
}
