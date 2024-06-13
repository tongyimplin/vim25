package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConnectInfoNetworkInfo;
import com.vmware.vim25.HostNewNetworkConnectInfo;
import com.vmware.vim25.NetworkSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectInfoNetworkInfo", propOrder = {"summary"})
@XmlSeeAlso({HostNewNetworkConnectInfo.class})
public class HostConnectInfoNetworkInfo extends DynamicData {
  @XmlElement(required = true)
  protected NetworkSummary summary;
  
  public NetworkSummary getSummary() {
    return this.summary;
  }
  
  public void setSummary(NetworkSummary paramNetworkSummary) {
    this.summary = paramNetworkSummary;
  }
}
