package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.HostNasVolume;
import com.vmware.vim25.NasDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasDatastoreInfo", propOrder = {"nas"})
public class NasDatastoreInfo extends DatastoreInfo {
  protected HostNasVolume nas;
  
  public HostNasVolume getNas() {
    return this.nas;
  }
  
  public void setNas(HostNasVolume paramHostNasVolume) {
    this.nas = paramHostNasVolume;
  }
}
