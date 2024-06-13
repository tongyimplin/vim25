package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostConfigInfoStorageInfo;
import com.vmware.vim25.VsanHostDiskMapInfo;
import com.vmware.vim25.VsanHostDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfoStorageInfo", propOrder = {"autoClaimStorage", "diskMapping", "diskMapInfo", "checksumEnabled"})
public class VsanHostConfigInfoStorageInfo extends DynamicData {
  protected Boolean autoClaimStorage;
  
  protected List<VsanHostDiskMapping> diskMapping;
  
  protected List<VsanHostDiskMapInfo> diskMapInfo;
  
  protected Boolean checksumEnabled;
  
  public Boolean isAutoClaimStorage() {
    return this.autoClaimStorage;
  }
  
  public void setAutoClaimStorage(Boolean paramBoolean) {
    this.autoClaimStorage = paramBoolean;
  }
  
  public List<VsanHostDiskMapping> getDiskMapping() {
    if (this.diskMapping == null)
      this.diskMapping = new ArrayList<>(); 
    return this.diskMapping;
  }
  
  public List<VsanHostDiskMapInfo> getDiskMapInfo() {
    if (this.diskMapInfo == null)
      this.diskMapInfo = new ArrayList<>(); 
    return this.diskMapInfo;
  }
  
  public Boolean isChecksumEnabled() {
    return this.checksumEnabled;
  }
  
  public void setChecksumEnabled(Boolean paramBoolean) {
    this.checksumEnabled = paramBoolean;
  }
}
