package com.vmware.vim25;

import com.vmware.vim25.FullStorageVMotionNotSupported;
import com.vmware.vim25.IndependentDiskVMotionNotSupported;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.MigrationFeatureNotSupported;
import com.vmware.vim25.NonHomeRDMVMotionNotSupported;
import com.vmware.vim25.StorageVMotionNotSupported;
import com.vmware.vim25.UnsharedSwapVMotionNotSupported;
import com.vmware.vim25.VMotionAcrossNetworkNotSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationFeatureNotSupported", propOrder = {"atSourceHost", "failedHostName", "failedHost"})
@XmlSeeAlso({IndependentDiskVMotionNotSupported.class, StorageVMotionNotSupported.class, UnsharedSwapVMotionNotSupported.class, FullStorageVMotionNotSupported.class, VMotionAcrossNetworkNotSupported.class, NonHomeRDMVMotionNotSupported.class})
public class MigrationFeatureNotSupported extends MigrationFault {
  protected boolean atSourceHost;
  
  @XmlElement(required = true)
  protected String failedHostName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference failedHost;
  
  public boolean isAtSourceHost() {
    return this.atSourceHost;
  }
  
  public void setAtSourceHost(boolean paramBoolean) {
    this.atSourceHost = paramBoolean;
  }
  
  public String getFailedHostName() {
    return this.failedHostName;
  }
  
  public void setFailedHostName(String paramString) {
    this.failedHostName = paramString;
  }
  
  public ManagedObjectReference getFailedHost() {
    return this.failedHost;
  }
  
  public void setFailedHost(ManagedObjectReference paramManagedObjectReference) {
    this.failedHost = paramManagedObjectReference;
  }
}
