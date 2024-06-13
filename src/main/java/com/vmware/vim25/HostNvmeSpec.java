package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeConnectSpec;
import com.vmware.vim25.HostNvmeDiscoverSpec;
import com.vmware.vim25.HostNvmeSpec;
import com.vmware.vim25.HostNvmeTransportParameters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeSpec", propOrder = {"hbaName", "transportParameters"})
@XmlSeeAlso({HostNvmeDiscoverSpec.class, HostNvmeConnectSpec.class})
public class HostNvmeSpec extends DynamicData {
  @XmlElement(required = true)
  protected String hbaName;
  
  @XmlElement(required = true)
  protected HostNvmeTransportParameters transportParameters;
  
  public String getHbaName() {
    return this.hbaName;
  }
  
  public void setHbaName(String paramString) {
    this.hbaName = paramString;
  }
  
  public HostNvmeTransportParameters getTransportParameters() {
    return this.transportParameters;
  }
  
  public void setTransportParameters(HostNvmeTransportParameters paramHostNvmeTransportParameters) {
    this.transportParameters = paramHostNvmeTransportParameters;
  }
}
