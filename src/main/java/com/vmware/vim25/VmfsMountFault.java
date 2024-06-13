package com.vmware.vim25;

import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.VmfsAlreadyMounted;
import com.vmware.vim25.VmfsAmbiguousMount;
import com.vmware.vim25.VmfsMountFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsMountFault", propOrder = {"uuid"})
@XmlSeeAlso({VmfsAmbiguousMount.class, VmfsAlreadyMounted.class})
public class VmfsMountFault extends HostConfigFault {
  @XmlElement(required = true)
  protected String uuid;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
}
