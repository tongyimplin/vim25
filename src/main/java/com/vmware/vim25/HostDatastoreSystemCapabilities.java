package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDatastoreSystemCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreSystemCapabilities", propOrder = {"nfsMountCreationRequired", "nfsMountCreationSupported", "localDatastoreSupported", "vmfsExtentExpansionSupported"})
public class HostDatastoreSystemCapabilities extends DynamicData {
  protected boolean nfsMountCreationRequired;
  
  protected boolean nfsMountCreationSupported;
  
  protected boolean localDatastoreSupported;
  
  protected Boolean vmfsExtentExpansionSupported;
  
  public boolean isNfsMountCreationRequired() {
    return this.nfsMountCreationRequired;
  }
  
  public void setNfsMountCreationRequired(boolean paramBoolean) {
    this.nfsMountCreationRequired = paramBoolean;
  }
  
  public boolean isNfsMountCreationSupported() {
    return this.nfsMountCreationSupported;
  }
  
  public void setNfsMountCreationSupported(boolean paramBoolean) {
    this.nfsMountCreationSupported = paramBoolean;
  }
  
  public boolean isLocalDatastoreSupported() {
    return this.localDatastoreSupported;
  }
  
  public void setLocalDatastoreSupported(boolean paramBoolean) {
    this.localDatastoreSupported = paramBoolean;
  }
  
  public Boolean isVmfsExtentExpansionSupported() {
    return this.vmfsExtentExpansionSupported;
  }
  
  public void setVmfsExtentExpansionSupported(Boolean paramBoolean) {
    this.vmfsExtentExpansionSupported = paramBoolean;
  }
}
