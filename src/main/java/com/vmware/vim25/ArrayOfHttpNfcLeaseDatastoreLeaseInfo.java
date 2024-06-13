package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHttpNfcLeaseDatastoreLeaseInfo;
import com.vmware.vim25.HttpNfcLeaseDatastoreLeaseInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseDatastoreLeaseInfo", propOrder = {"httpNfcLeaseDatastoreLeaseInfo"})
public class ArrayOfHttpNfcLeaseDatastoreLeaseInfo {
  @XmlElement(name = "HttpNfcLeaseDatastoreLeaseInfo")
  protected List<HttpNfcLeaseDatastoreLeaseInfo> httpNfcLeaseDatastoreLeaseInfo;
  
  public List<HttpNfcLeaseDatastoreLeaseInfo> getHttpNfcLeaseDatastoreLeaseInfo() {
    if (this.httpNfcLeaseDatastoreLeaseInfo == null)
      this.httpNfcLeaseDatastoreLeaseInfo = new ArrayList<>(); 
    return this.httpNfcLeaseDatastoreLeaseInfo;
  }
}
