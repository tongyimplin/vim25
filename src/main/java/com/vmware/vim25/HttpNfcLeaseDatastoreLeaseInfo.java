package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseDatastoreLeaseInfo;
import com.vmware.vim25.HttpNfcLeaseHostInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseDatastoreLeaseInfo", propOrder = {"datastoreKey", "hosts"})
public class HttpNfcLeaseDatastoreLeaseInfo extends DynamicData {
  @XmlElement(required = true)
  protected String datastoreKey;
  
  @XmlElement(required = true)
  protected List<HttpNfcLeaseHostInfo> hosts;
  
  public String getDatastoreKey() {
    return this.datastoreKey;
  }
  
  public void setDatastoreKey(String paramString) {
    this.datastoreKey = paramString;
  }
  
  public List<HttpNfcLeaseHostInfo> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
