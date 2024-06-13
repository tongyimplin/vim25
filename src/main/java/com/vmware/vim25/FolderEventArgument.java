package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.FolderEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderEventArgument", propOrder = {"folder"})
public class FolderEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference folder;
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
}
