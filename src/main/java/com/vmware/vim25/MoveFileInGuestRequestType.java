package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MoveFileInGuestRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveFileInGuestRequestType", propOrder = {"_this", "vm", "auth", "srcFilePath", "dstFilePath", "overwrite"})
public class MoveFileInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String srcFilePath;
  
  @XmlElement(required = true)
  protected String dstFilePath;
  
  protected boolean overwrite;
  
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
  
  public String getSrcFilePath() {
    return this.srcFilePath;
  }
  
  public void setSrcFilePath(String paramString) {
    this.srcFilePath = paramString;
  }
  
  public String getDstFilePath() {
    return this.dstFilePath;
  }
  
  public void setDstFilePath(String paramString) {
    this.dstFilePath = paramString;
  }
  
  public boolean isOverwrite() {
    return this.overwrite;
  }
  
  public void setOverwrite(boolean paramBoolean) {
    this.overwrite = paramBoolean;
  }
}
