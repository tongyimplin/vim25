package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ListFilesInGuestRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFilesInGuestRequestType", propOrder = {"_this", "vm", "auth", "filePath", "index", "maxResults", "matchPattern"})
public class ListFilesInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String filePath;
  
  protected Integer index;
  
  protected Integer maxResults;
  
  protected String matchPattern;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public GuestAuthentication getAuth() {
    return this.auth;
  }
  
  public void setAuth(GuestAuthentication paramGuestAuthentication) {
    this.auth = paramGuestAuthentication;
  }
  
  public String getFilePath() {
    return this.filePath;
  }
  
  public void setFilePath(String paramString) {
    this.filePath = paramString;
  }
  
  public Integer getIndex() {
    return this.index;
  }
  
  public void setIndex(Integer paramInteger) {
    this.index = paramInteger;
  }
  
  public Integer getMaxResults() {
    return this.maxResults;
  }
  
  public void setMaxResults(Integer paramInteger) {
    this.maxResults = paramInteger;
  }
  
  public String getMatchPattern() {
    return this.matchPattern;
  }
  
  public void setMatchPattern(String paramString) {
    this.matchPattern = paramString;
  }
}
