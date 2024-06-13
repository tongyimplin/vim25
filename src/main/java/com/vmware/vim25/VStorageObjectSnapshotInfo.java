package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VStorageObjectSnapshotInfo;
import com.vmware.vim25.VStorageObjectSnapshotInfoVStorageObjectSnapshot;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectSnapshotInfo", propOrder = {"snapshots"})
public class VStorageObjectSnapshotInfo extends DynamicData {
  protected List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> snapshots;
  
  public List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> getSnapshots() {
    if (this.snapshots == null)
      this.snapshots = new ArrayList<>(); 
    return this.snapshots;
  }
}
