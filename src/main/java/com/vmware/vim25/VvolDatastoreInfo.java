package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.HostVvolVolume;
import com.vmware.vim25.VvolDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VvolDatastoreInfo", propOrder = {"vvolDS"})
public class VvolDatastoreInfo extends DatastoreInfo {
  protected HostVvolVolume vvolDS;
  
  public HostVvolVolume getVvolDS() {
    return this.vvolDS;
  }
  
  public void setVvolDS(HostVvolVolume paramHostVvolVolume) {
    this.vvolDS = paramHostVvolVolume;
  }
}
