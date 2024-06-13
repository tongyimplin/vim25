package com.vmware.vim25;

import com.vmware.vim25.ArrayOfManagedEntityStatus;
import com.vmware.vim25.ManagedEntityStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagedEntityStatus", propOrder = {"managedEntityStatus"})
public class ArrayOfManagedEntityStatus {
  @XmlElement(name = "ManagedEntityStatus")
  protected List<ManagedEntityStatus> managedEntityStatus;
  
  public List<ManagedEntityStatus> getManagedEntityStatus() {
    if (this.managedEntityStatus == null)
      this.managedEntityStatus = new ArrayList<>(); 
    return this.managedEntityStatus;
  }
}
