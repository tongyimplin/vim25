package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VStorageObjectSnapshotDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectSnapshotDetails", propOrder = {"path", "changedBlockTrackingId"})
public class VStorageObjectSnapshotDetails extends DynamicData {
  protected String path;
  
  protected String changedBlockTrackingId;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public String getChangedBlockTrackingId() {
    return this.changedBlockTrackingId;
  }
  
  public void setChangedBlockTrackingId(String paramString) {
    this.changedBlockTrackingId = paramString;
  }
}
