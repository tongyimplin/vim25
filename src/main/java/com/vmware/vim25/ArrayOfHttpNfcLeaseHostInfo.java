package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHttpNfcLeaseHostInfo;
import com.vmware.vim25.HttpNfcLeaseHostInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseHostInfo", propOrder = {"httpNfcLeaseHostInfo"})
public class ArrayOfHttpNfcLeaseHostInfo {
  @XmlElement(name = "HttpNfcLeaseHostInfo")
  protected List<HttpNfcLeaseHostInfo> httpNfcLeaseHostInfo;
  
  public List<HttpNfcLeaseHostInfo> getHttpNfcLeaseHostInfo() {
    if (this.httpNfcLeaseHostInfo == null)
      this.httpNfcLeaseHostInfo = new ArrayList<>(); 
    return this.httpNfcLeaseHostInfo;
  }
}
