package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeasePullFromUrlsRequestType;
import com.vmware.vim25.HttpNfcLeaseSourceFile;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeasePullFromUrlsRequestType", propOrder = {"_this", "files"})
public class HttpNfcLeasePullFromUrlsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<HttpNfcLeaseSourceFile> files;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<HttpNfcLeaseSourceFile> getFiles() {
    if (this.files == null)
      this.files = new ArrayList<>(); 
    return this.files;
  }
}
