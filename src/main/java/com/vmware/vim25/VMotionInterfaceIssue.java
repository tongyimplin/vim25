package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.VMotionInterfaceIssue;
import com.vmware.vim25.VMotionLinkCapacityLow;
import com.vmware.vim25.VMotionLinkDown;
import com.vmware.vim25.VMotionNotConfigured;
import com.vmware.vim25.VMotionNotLicensed;
import com.vmware.vim25.VMotionNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMotionInterfaceIssue", propOrder = {"atSourceHost", "failedHost", "failedHostEntity"})
@XmlSeeAlso({VMotionLinkCapacityLow.class, VMotionLinkDown.class, VMotionNotLicensed.class, VMotionNotSupported.class, VMotionNotConfigured.class})
public class VMotionInterfaceIssue extends MigrationFault {
  protected boolean atSourceHost;
  
  @XmlElement(required = true)
  protected String failedHost;
  
  protected ManagedObjectReference failedHostEntity;
  
  public boolean isAtSourceHost() {
    return this.atSourceHost;
  }
  
  public void setAtSourceHost(boolean paramBoolean) {
    this.atSourceHost = paramBoolean;
  }
  
  public String getFailedHost() {
    return this.failedHost;
  }
  
  public void setFailedHost(String paramString) {
    this.failedHost = paramString;
  }
  
  public ManagedObjectReference getFailedHostEntity() {
    return this.failedHostEntity;
  }
  
  public void setFailedHostEntity(ManagedObjectReference paramManagedObjectReference) {
    this.failedHostEntity = paramManagedObjectReference;
  }
}
