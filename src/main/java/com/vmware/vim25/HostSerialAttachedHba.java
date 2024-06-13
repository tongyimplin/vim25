package com.vmware.vim25;

import com.vmware.vim25.HostHostBusAdapter;
import com.vmware.vim25.HostSerialAttachedHba;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSerialAttachedHba", propOrder = {"nodeWorldWideName"})
public class HostSerialAttachedHba extends HostHostBusAdapter {
  @XmlElement(required = true)
  protected String nodeWorldWideName;
  
  public String getNodeWorldWideName() {
    return this.nodeWorldWideName;
  }
  
  public void setNodeWorldWideName(String paramString) {
    this.nodeWorldWideName = paramString;
  }
}
