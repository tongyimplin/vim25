package com.vmware.vim25;

import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.ImportVAppRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportVAppRequestType", propOrder = {"_this", "spec", "folder", "host"})
public class ImportVAppRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ImportSpec spec;
  
  protected ManagedObjectReference folder;
  
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ImportSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ImportSpec paramImportSpec) {
    this.spec = paramImportSpec;
  }
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
