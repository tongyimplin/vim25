package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryFault;
import com.vmware.vim25.CAMServerRefusedConnection;
import com.vmware.vim25.InvalidCAMCertificate;
import com.vmware.vim25.InvalidCAMServer;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidCAMServer", propOrder = {"camServer"})
@XmlSeeAlso({InvalidCAMCertificate.class, CAMServerRefusedConnection.class})
public class InvalidCAMServer extends ActiveDirectoryFault {
  @XmlElement(required = true)
  protected String camServer;
  
  public String getCamServer() {
    return this.camServer;
  }
  
  public void setCamServer(String paramString) {
    this.camServer = paramString;
  }
}
