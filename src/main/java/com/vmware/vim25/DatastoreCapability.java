package com.vmware.vim25;

import com.vmware.vim25.DatastoreCapability;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreCapability", propOrder = {"directoryHierarchySupported", "rawDiskMappingsSupported", "perFileThinProvisioningSupported", "storageIORMSupported", "nativeSnapshotSupported", "topLevelDirectoryCreateSupported", "seSparseSupported", "vmfsSparseSupported", "vsanSparseSupported", "upitSupported", "vmdkExpandSupported", "clusteredVmdkSupported"})
public class DatastoreCapability extends DynamicData {
  protected boolean directoryHierarchySupported;
  
  protected boolean rawDiskMappingsSupported;
  
  protected boolean perFileThinProvisioningSupported;
  
  protected Boolean storageIORMSupported;
  
  protected Boolean nativeSnapshotSupported;
  
  protected Boolean topLevelDirectoryCreateSupported;
  
  protected Boolean seSparseSupported;
  
  protected Boolean vmfsSparseSupported;
  
  protected Boolean vsanSparseSupported;
  
  protected Boolean upitSupported;
  
  protected Boolean vmdkExpandSupported;
  
  protected Boolean clusteredVmdkSupported;
  
  public boolean isDirectoryHierarchySupported() {
    return this.directoryHierarchySupported;
  }
  
  public void setDirectoryHierarchySupported(boolean paramBoolean) {
    this.directoryHierarchySupported = paramBoolean;
  }
  
  public boolean isRawDiskMappingsSupported() {
    return this.rawDiskMappingsSupported;
  }
  
  public void setRawDiskMappingsSupported(boolean paramBoolean) {
    this.rawDiskMappingsSupported = paramBoolean;
  }
  
  public boolean isPerFileThinProvisioningSupported() {
    return this.perFileThinProvisioningSupported;
  }
  
  public void setPerFileThinProvisioningSupported(boolean paramBoolean) {
    this.perFileThinProvisioningSupported = paramBoolean;
  }
  
  public Boolean isStorageIORMSupported() {
    return this.storageIORMSupported;
  }
  
  public void setStorageIORMSupported(Boolean paramBoolean) {
    this.storageIORMSupported = paramBoolean;
  }
  
  public Boolean isNativeSnapshotSupported() {
    return this.nativeSnapshotSupported;
  }
  
  public void setNativeSnapshotSupported(Boolean paramBoolean) {
    this.nativeSnapshotSupported = paramBoolean;
  }
  
  public Boolean isTopLevelDirectoryCreateSupported() {
    return this.topLevelDirectoryCreateSupported;
  }
  
  public void setTopLevelDirectoryCreateSupported(Boolean paramBoolean) {
    this.topLevelDirectoryCreateSupported = paramBoolean;
  }
  
  public Boolean isSeSparseSupported() {
    return this.seSparseSupported;
  }
  
  public void setSeSparseSupported(Boolean paramBoolean) {
    this.seSparseSupported = paramBoolean;
  }
  
  public Boolean isVmfsSparseSupported() {
    return this.vmfsSparseSupported;
  }
  
  public void setVmfsSparseSupported(Boolean paramBoolean) {
    this.vmfsSparseSupported = paramBoolean;
  }
  
  public Boolean isVsanSparseSupported() {
    return this.vsanSparseSupported;
  }
  
  public void setVsanSparseSupported(Boolean paramBoolean) {
    this.vsanSparseSupported = paramBoolean;
  }
  
  public Boolean isUpitSupported() {
    return this.upitSupported;
  }
  
  public void setUpitSupported(Boolean paramBoolean) {
    this.upitSupported = paramBoolean;
  }
  
  public Boolean isVmdkExpandSupported() {
    return this.vmdkExpandSupported;
  }
  
  public void setVmdkExpandSupported(Boolean paramBoolean) {
    this.vmdkExpandSupported = paramBoolean;
  }
  
  public Boolean isClusteredVmdkSupported() {
    return this.clusteredVmdkSupported;
  }
  
  public void setClusteredVmdkSupported(Boolean paramBoolean) {
    this.clusteredVmdkSupported = paramBoolean;
  }
}
