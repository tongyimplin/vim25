package com.vmware.vim25;

import com.vmware.vim25.VMotionInterfaceIssue;
import com.vmware.vim25.VMotionLinkDown;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMotionLinkDown", propOrder = {"network"})
public class VMotionLinkDown extends VMotionInterfaceIssue {
  @XmlElement(required = true)
  protected String network;
  
  public String getNetwork() {
    return this.network;
  }
  
  public void setNetwork(String paramString) {
    this.network = paramString;
  }
}
