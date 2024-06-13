package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot;
import com.vmware.vim25.VStorageObjectSnapshotInfoVStorageObjectSnapshot;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot", propOrder = {"vStorageObjectSnapshotInfoVStorageObjectSnapshot"})
public class ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot {
  @XmlElement(name = "VStorageObjectSnapshotInfoVStorageObjectSnapshot")
  protected List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> vStorageObjectSnapshotInfoVStorageObjectSnapshot;
  
  public List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> getVStorageObjectSnapshotInfoVStorageObjectSnapshot() {
    if (this.vStorageObjectSnapshotInfoVStorageObjectSnapshot == null)
      this.vStorageObjectSnapshotInfoVStorageObjectSnapshot = new ArrayList<>(); 
    return this.vStorageObjectSnapshotInfoVStorageObjectSnapshot;
  }
}
