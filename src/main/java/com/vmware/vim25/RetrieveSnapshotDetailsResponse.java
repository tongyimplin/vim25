package com.vmware.vim25;

import com.vmware.vim25.RetrieveSnapshotDetailsResponse;
import com.vmware.vim25.VStorageObjectSnapshotDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveSnapshotDetailsResponse")
public class RetrieveSnapshotDetailsResponse {
  @XmlElement(required = true)
  protected VStorageObjectSnapshotDetails returnval;
  
  public VStorageObjectSnapshotDetails getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VStorageObjectSnapshotDetails paramVStorageObjectSnapshotDetails) {
    this.returnval = paramVStorageObjectSnapshotDetails;
  }
}
