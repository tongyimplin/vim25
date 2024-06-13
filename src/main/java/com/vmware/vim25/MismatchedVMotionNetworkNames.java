package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.MismatchedVMotionNetworkNames;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedVMotionNetworkNames", propOrder = {"sourceNetwork", "destNetwork"})
public class MismatchedVMotionNetworkNames extends MigrationFault {
  @XmlElement(required = true)
  protected String sourceNetwork;
  
  @XmlElement(required = true)
  protected String destNetwork;
  
  public String getSourceNetwork() {
    return this.sourceNetwork;
  }
  
  public void setSourceNetwork(String paramString) {
    this.sourceNetwork = paramString;
  }
  
  public String getDestNetwork() {
    return this.destNetwork;
  }
  
  public void setDestNetwork(String paramString) {
    this.destNetwork = paramString;
  }
}
