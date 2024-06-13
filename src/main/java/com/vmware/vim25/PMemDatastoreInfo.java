package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.HostPMemVolume;
import com.vmware.vim25.PMemDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMemDatastoreInfo", propOrder = {"pmem"})
public class PMemDatastoreInfo extends DatastoreInfo {
  @XmlElement(required = true)
  protected HostPMemVolume pmem;
  
  public HostPMemVolume getPmem() {
    return this.pmem;
  }
  
  public void setPmem(HostPMemVolume paramHostPMemVolume) {
    this.pmem = paramHostPMemVolume;
  }
}
