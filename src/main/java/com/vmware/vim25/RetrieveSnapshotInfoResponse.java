package com.vmware.vim25;

import com.vmware.vim25.RetrieveSnapshotInfoResponse;
import com.vmware.vim25.VStorageObjectSnapshotInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveSnapshotInfoResponse")
public class RetrieveSnapshotInfoResponse {
  @XmlElement(required = true)
  protected VStorageObjectSnapshotInfo returnval;
  
  public VStorageObjectSnapshotInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VStorageObjectSnapshotInfo paramVStorageObjectSnapshotInfo) {
    this.returnval = paramVStorageObjectSnapshotInfo;
  }
}
